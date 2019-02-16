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
public class Room implements Serializable {
    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private Integer id;

    /**
     * 名字
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private String room_name;

    /**
     * 状态
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private Integer status;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private String east_username;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private String south_username;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private String west_username;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private String north_username;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private Double east_score;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private Double south_score;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private Double west_score;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private Double north_score;

    /**
     * 创建人
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private String creator;

    /**
     * 持续时间
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private Double duration;

    /**
     * 创建时间
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private Date create_time;

    /**
     * 更新时间
     *
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private Date update_time;

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column mahjong..room.id
     *
     * @return the value of mahjong..room.id
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.id
     *
     * @param id the value for mahjong..room.id
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column mahjong..room.room_name
     *
     * @return the value of mahjong..room.room_name
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public String getRoom_name() {
        return room_name;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withRoom_name(String room_name) {
        this.setRoom_name(room_name);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.room_name
     *
     * @param room_name the value for mahjong..room.room_name
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    /**
     * This method returns the value of the database column mahjong..room.status
     *
     * @return the value of mahjong..room.status
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.status
     *
     * @param status the value for mahjong..room.status
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column mahjong..room.east_username
     *
     * @return the value of mahjong..room.east_username
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public String getEast_username() {
        return east_username;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withEast_username(String east_username) {
        this.setEast_username(east_username);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.east_username
     *
     * @param east_username the value for mahjong..room.east_username
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setEast_username(String east_username) {
        this.east_username = east_username;
    }

    /**
     * This method returns the value of the database column mahjong..room.south_username
     *
     * @return the value of mahjong..room.south_username
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public String getSouth_username() {
        return south_username;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withSouth_username(String south_username) {
        this.setSouth_username(south_username);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.south_username
     *
     * @param south_username the value for mahjong..room.south_username
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setSouth_username(String south_username) {
        this.south_username = south_username;
    }

    /**
     * This method returns the value of the database column mahjong..room.west_username
     *
     * @return the value of mahjong..room.west_username
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public String getWest_username() {
        return west_username;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withWest_username(String west_username) {
        this.setWest_username(west_username);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.west_username
     *
     * @param west_username the value for mahjong..room.west_username
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setWest_username(String west_username) {
        this.west_username = west_username;
    }

    /**
     * This method returns the value of the database column mahjong..room.north_username
     *
     * @return the value of mahjong..room.north_username
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public String getNorth_username() {
        return north_username;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withNorth_username(String north_username) {
        this.setNorth_username(north_username);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.north_username
     *
     * @param north_username the value for mahjong..room.north_username
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setNorth_username(String north_username) {
        this.north_username = north_username;
    }

    /**
     * This method returns the value of the database column mahjong..room.east_score
     *
     * @return the value of mahjong..room.east_score
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Double getEast_score() {
        return east_score;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withEast_score(Double east_score) {
        this.setEast_score(east_score);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.east_score
     *
     * @param east_score the value for mahjong..room.east_score
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setEast_score(Double east_score) {
        this.east_score = east_score;
    }

    /**
     * This method returns the value of the database column mahjong..room.south_score
     *
     * @return the value of mahjong..room.south_score
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Double getSouth_score() {
        return south_score;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withSouth_score(Double south_score) {
        this.setSouth_score(south_score);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.south_score
     *
     * @param south_score the value for mahjong..room.south_score
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setSouth_score(Double south_score) {
        this.south_score = south_score;
    }

    /**
     * This method returns the value of the database column mahjong..room.west_score
     *
     * @return the value of mahjong..room.west_score
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Double getWest_score() {
        return west_score;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withWest_score(Double west_score) {
        this.setWest_score(west_score);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.west_score
     *
     * @param west_score the value for mahjong..room.west_score
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setWest_score(Double west_score) {
        this.west_score = west_score;
    }

    /**
     * This method returns the value of the database column mahjong..room.north_score
     *
     * @return the value of mahjong..room.north_score
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Double getNorth_score() {
        return north_score;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withNorth_score(Double north_score) {
        this.setNorth_score(north_score);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.north_score
     *
     * @param north_score the value for mahjong..room.north_score
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setNorth_score(Double north_score) {
        this.north_score = north_score;
    }

    /**
     * This method returns the value of the database column mahjong..room.creator
     *
     * @return the value of mahjong..room.creator
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withCreator(String creator) {
        this.setCreator(creator);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.creator
     *
     * @param creator the value for mahjong..room.creator
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * This method returns the value of the database column mahjong..room.duration
     *
     * @return the value of mahjong..room.duration
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Double getDuration() {
        return duration;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withDuration(Double duration) {
        this.setDuration(duration);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.duration
     *
     * @param duration the value for mahjong..room.duration
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * This method returns the value of the database column mahjong..room.create_time
     *
     * @return the value of mahjong..room.create_time
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.create_time
     *
     * @param create_time the value for mahjong..room.create_time
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column mahjong..room.update_time
     *
     * @return the value of mahjong..room.update_time
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public Room withUpdate_time(Date update_time) {
        this.setUpdate_time(update_time);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.update_time
     *
     * @param update_time the value for mahjong..room.update_time
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:35:41 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", room_name=").append(room_name);
        sb.append(", status=").append(status);
        sb.append(", east_username=").append(east_username);
        sb.append(", south_username=").append(south_username);
        sb.append(", west_username=").append(west_username);
        sb.append(", north_username=").append(north_username);
        sb.append(", east_score=").append(east_score);
        sb.append(", south_score=").append(south_score);
        sb.append(", west_score=").append(west_score);
        sb.append(", north_score=").append(north_score);
        sb.append(", creator=").append(creator);
        sb.append(", duration=").append(duration);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append("]");
        return sb.toString();
    }
}