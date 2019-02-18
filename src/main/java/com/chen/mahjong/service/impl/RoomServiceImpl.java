package com.chen.mahjong.service.impl;

import com.chen.mahjong.common.Response;
import com.chen.mahjong.constant.WebConstants;
import com.chen.mahjong.constant.enums.EnumRoomStatus;
import com.chen.mahjong.dal.entity.Room;
import com.chen.mahjong.dal.entity.User;
import com.chen.mahjong.dal.mapper.RoomMapper;
import com.chen.mahjong.dal.mapper.UserMapper;
import com.chen.mahjong.service.IRoomService;
import com.chen.mahjong.util.ResponseUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author LiuChen
 * @create 2019-02-17-17:03
 */
@Service
public class RoomServiceImpl implements IRoomService {
    @Resource
    private RoomMapper roomMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private HttpServletRequest request;

    /**
     * 房间后缀
     */
    private final static String ROOM_NAME_SUFFIX = "的研究室";

    @Override
    public Response create(String nickname) {
        HttpSession session = request.getSession();
        if (null == session) {
            return ResponseUtils.fail();
        }
        Room room = new Room();
        room.setRoomName(nickname + ROOM_NAME_SUFFIX);
        room.setStatus(EnumRoomStatus.OPENING.code());
        room.setCreator(nickname);

        roomMapper.insert(room);
        int userId = Integer.valueOf(String.valueOf(session.getAttribute(WebConstants.USER_ID)));
        int roomId = room.getId();
        User user = new User();
        user.setId(userId);
        user.setRoomId(roomId);
        userMapper.updateByPrimaryKeySelective(user);
        return ResponseUtils.success().data("room", room);
    }

    @Override
    public Response list() {
        List<Room> rooms = roomMapper.selectAll();
        return ResponseUtils.success().data("rooms", rooms);
    }
}
