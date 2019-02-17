package com.chen.mahjong.configuration;

import com.chen.mahjong.constant.WebConstants;
import com.chen.mahjong.dal.entity.Meta;
import com.chen.mahjong.dal.mapper.MetaMapper;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiuChen
 * @create 2019-02-17-22:42
 */
@Data
@Configuration
public class WechatConfiguration implements InitializingBean {

    @Resource
    private MetaMapper metaMapper;

    @Value("${wechat.server.url}")
    private String wechatServerUrl;

    @Value("${wechat.app.grant_type:authorization_code}")
    private String appGrantType;

    private String appId;

    private String appSecret;

    @Override
    public void afterPropertiesSet() throws Exception {
        List<Meta> metas = metaMapper.selectAll();
        metas.forEach(meta -> {
            if (meta.getKey().equalsIgnoreCase(WebConstants.APP_ID)) {
                this.appId = meta.getValue();
            }
            if (meta.getKey().equalsIgnoreCase(WebConstants.APP_SECRET)) {
                this.appSecret = meta.getValue();
            }
        });
    }
}
