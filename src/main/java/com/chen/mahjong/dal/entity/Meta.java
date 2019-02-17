package com.chen.mahjong.dal.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Meta implements Serializable {
    /**
     *
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    private String key;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    private String value;

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column mahjong..meta.id
     *
     * @return the value of mahjong..meta.id
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    public Meta withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..meta.id
     *
     * @param id the value for mahjong..meta.id
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column mahjong..meta.key
     *
     * @return the value of mahjong..meta.key
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    public String getKey() {
        return key;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    public Meta withKey(String key) {
        this.setKey(key);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..meta.key
     *
     * @param key the value for mahjong..meta.key
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * This method returns the value of the database column mahjong..meta.value
     *
     * @return the value of mahjong..meta.value
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    public Meta withValue(String value) {
        this.setValue(value);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..meta.value
     *
     * @param value the value for mahjong..meta.value
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", key=").append(key);
        sb.append(", value=").append(value);
        sb.append("]");
        return sb.toString();
    }
}