package com.chen.mahjong.dal.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class User implements Serializable {
    /**
     *
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    private String username;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    private String wechat;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    private String password;

    /**
     * 总分数
     *
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    private Double score;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    private Date last_login_time;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    private Date create_time;

    /**
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column mahjong..user.id
     *
     * @return the value of mahjong..user.id
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public User withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..user.id
     *
     * @param id the value for mahjong..user.id
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column mahjong..user.username
     *
     * @return the value of mahjong..user.username
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public User withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..user.username
     *
     * @param username the value for mahjong..user.username
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method returns the value of the database column mahjong..user.wechat
     *
     * @return the value of mahjong..user.wechat
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public String getWechat() {
        return wechat;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public User withWechat(String wechat) {
        this.setWechat(wechat);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..user.wechat
     *
     * @param wechat the value for mahjong..user.wechat
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * This method returns the value of the database column mahjong..user.password
     *
     * @return the value of mahjong..user.password
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public User withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..user.password
     *
     * @param password the value for mahjong..user.password
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method returns the value of the database column mahjong..user.score
     *
     * @return the value of mahjong..user.score
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public Double getScore() {
        return score;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public User withScore(Double score) {
        this.setScore(score);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..user.score
     *
     * @param score the value for mahjong..user.score
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * This method returns the value of the database column mahjong..user.last_login_time
     *
     * @return the value of mahjong..user.last_login_time
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public Date getLast_login_time() {
        return last_login_time;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public User withLast_login_time(Date last_login_time) {
        this.setLast_login_time(last_login_time);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..user.last_login_time
     *
     * @param last_login_time the value for mahjong..user.last_login_time
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    /**
     * This method returns the value of the database column mahjong..user.create_time
     *
     * @return the value of mahjong..user.create_time
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public User withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..user.create_time
     *
     * @param create_time the value for mahjong..user.create_time
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", wechat=").append(wechat);
        sb.append(", password=").append(password);
        sb.append(", score=").append(score);
        sb.append(", last_login_time=").append(last_login_time);
        sb.append(", create_time=").append(create_time);
        sb.append("]");
        return sb.toString();
    }
}