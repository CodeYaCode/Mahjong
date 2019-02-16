package com.chen.mahjong.Interceptor;

import com.chen.mahjong.constant.WebConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author LiuChen
 * @create 2019-02-17-2:27
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        HttpSession session = request.getSession();
        if (null == session || StringUtils.isEmpty(session.getAttribute(WebConstants.SESSION_USER_NAME))) {
            System.err.println("login required.");
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }
}
