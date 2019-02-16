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
public class Turn implements Serializable {
    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private Integer id;

    /**
     * 房间号
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private Integer room_id;

    /**
     * 回合数
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private Integer turn_no;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private String east_username;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private String south_username;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private String west_username;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private String north_username;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private Double east_score;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private Double south_score;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private Double west_score;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private Double north_score;

    /**
     * 胡的番型
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private String east_fan;

    /**
     * 胡的番型
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private String south_fan;

    /**
     * 胡的番型
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private String west_fan;

    /**
     * 胡的番型
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private String north_fan;

    /**
     *
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private Date create_time;

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column mahjong..turn.id
     *
     * @return the value of mahjong..turn.id
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.id
     *
     * @param id the value for mahjong..turn.id
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column mahjong..turn.room_id
     *
     * @return the value of mahjong..turn.room_id
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Integer getRoom_id() {
        return room_id;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withRoom_id(Integer room_id) {
        this.setRoom_id(room_id);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.room_id
     *
     * @param room_id the value for mahjong..turn.room_id
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    /**
     * This method returns the value of the database column mahjong..turn.turn_no
     *
     * @return the value of mahjong..turn.turn_no
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Integer getTurn_no() {
        return turn_no;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withTurn_no(Integer turn_no) {
        this.setTurn_no(turn_no);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.turn_no
     *
     * @param turn_no the value for mahjong..turn.turn_no
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setTurn_no(Integer turn_no) {
        this.turn_no = turn_no;
    }

    /**
     * This method returns the value of the database column mahjong..turn.east_username
     *
     * @return the value of mahjong..turn.east_username
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public String getEast_username() {
        return east_username;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withEast_username(String east_username) {
        this.setEast_username(east_username);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.east_username
     *
     * @param east_username the value for mahjong..turn.east_username
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setEast_username(String east_username) {
        this.east_username = east_username;
    }

    /**
     * This method returns the value of the database column mahjong..turn.south_username
     *
     * @return the value of mahjong..turn.south_username
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public String getSouth_username() {
        return south_username;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withSouth_username(String south_username) {
        this.setSouth_username(south_username);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.south_username
     *
     * @param south_username the value for mahjong..turn.south_username
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setSouth_username(String south_username) {
        this.south_username = south_username;
    }

    /**
     * This method returns the value of the database column mahjong..turn.west_username
     *
     * @return the value of mahjong..turn.west_username
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public String getWest_username() {
        return west_username;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withWest_username(String west_username) {
        this.setWest_username(west_username);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.west_username
     *
     * @param west_username the value for mahjong..turn.west_username
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setWest_username(String west_username) {
        this.west_username = west_username;
    }

    /**
     * This method returns the value of the database column mahjong..turn.north_username
     *
     * @return the value of mahjong..turn.north_username
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public String getNorth_username() {
        return north_username;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withNorth_username(String north_username) {
        this.setNorth_username(north_username);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.north_username
     *
     * @param north_username the value for mahjong..turn.north_username
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setNorth_username(String north_username) {
        this.north_username = north_username;
    }

    /**
     * This method returns the value of the database column mahjong..turn.east_score
     *
     * @return the value of mahjong..turn.east_score
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Double getEast_score() {
        return east_score;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withEast_score(Double east_score) {
        this.setEast_score(east_score);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.east_score
     *
     * @param east_score the value for mahjong..turn.east_score
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setEast_score(Double east_score) {
        this.east_score = east_score;
    }

    /**
     * This method returns the value of the database column mahjong..turn.south_score
     *
     * @return the value of mahjong..turn.south_score
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Double getSouth_score() {
        return south_score;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withSouth_score(Double south_score) {
        this.setSouth_score(south_score);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.south_score
     *
     * @param south_score the value for mahjong..turn.south_score
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setSouth_score(Double south_score) {
        this.south_score = south_score;
    }

    /**
     * This method returns the value of the database column mahjong..turn.west_score
     *
     * @return the value of mahjong..turn.west_score
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Double getWest_score() {
        return west_score;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withWest_score(Double west_score) {
        this.setWest_score(west_score);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.west_score
     *
     * @param west_score the value for mahjong..turn.west_score
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setWest_score(Double west_score) {
        this.west_score = west_score;
    }

    /**
     * This method returns the value of the database column mahjong..turn.north_score
     *
     * @return the value of mahjong..turn.north_score
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Double getNorth_score() {
        return north_score;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withNorth_score(Double north_score) {
        this.setNorth_score(north_score);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.north_score
     *
     * @param north_score the value for mahjong..turn.north_score
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setNorth_score(Double north_score) {
        this.north_score = north_score;
    }

    /**
     * This method returns the value of the database column mahjong..turn.east_fan
     *
     * @return the value of mahjong..turn.east_fan
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public String getEast_fan() {
        return east_fan;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withEast_fan(String east_fan) {
        this.setEast_fan(east_fan);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.east_fan
     *
     * @param east_fan the value for mahjong..turn.east_fan
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setEast_fan(String east_fan) {
        this.east_fan = east_fan;
    }

    /**
     * This method returns the value of the database column mahjong..turn.south_fan
     *
     * @return the value of mahjong..turn.south_fan
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public String getSouth_fan() {
        return south_fan;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withSouth_fan(String south_fan) {
        this.setSouth_fan(south_fan);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.south_fan
     *
     * @param south_fan the value for mahjong..turn.south_fan
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setSouth_fan(String south_fan) {
        this.south_fan = south_fan;
    }

    /**
     * This method returns the value of the database column mahjong..turn.west_fan
     *
     * @return the value of mahjong..turn.west_fan
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public String getWest_fan() {
        return west_fan;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withWest_fan(String west_fan) {
        this.setWest_fan(west_fan);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.west_fan
     *
     * @param west_fan the value for mahjong..turn.west_fan
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setWest_fan(String west_fan) {
        this.west_fan = west_fan;
    }

    /**
     * This method returns the value of the database column mahjong..turn.north_fan
     *
     * @return the value of mahjong..turn.north_fan
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public String getNorth_fan() {
        return north_fan;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withNorth_fan(String north_fan) {
        this.setNorth_fan(north_fan);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.north_fan
     *
     * @param north_fan the value for mahjong..turn.north_fan
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setNorth_fan(String north_fan) {
        this.north_fan = north_fan;
    }

    /**
     * This method returns the value of the database column mahjong..turn.create_time
     *
     * @return the value of mahjong..turn.create_time
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public Turn withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..turn.create_time
     *
     * @param create_time the value for mahjong..turn.create_time
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", room_id=").append(room_id);
        sb.append(", turn_no=").append(turn_no);
        sb.append(", east_username=").append(east_username);
        sb.append(", south_username=").append(south_username);
        sb.append(", west_username=").append(west_username);
        sb.append(", north_username=").append(north_username);
        sb.append(", east_score=").append(east_score);
        sb.append(", south_score=").append(south_score);
        sb.append(", west_score=").append(west_score);
        sb.append(", north_score=").append(north_score);
        sb.append(", east_fan=").append(east_fan);
        sb.append(", south_fan=").append(south_fan);
        sb.append(", west_fan=").append(west_fan);
        sb.append(", north_fan=").append(north_fan);
        sb.append(", create_time=").append(create_time);
        sb.append("]");
        return sb.toString();
    }
}