package com.chen.mahjong.service.impl;

import com.chen.mahjong.common.Response;
import com.chen.mahjong.constant.WebConstants;
import com.chen.mahjong.constant.enums.EnumRoomStatus;
import com.chen.mahjong.dal.entity.Room;
import com.chen.mahjong.dal.mapper.RoomMapper;
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
    private HttpServletRequest request;

    @Override
    public Response create(String roomName) {
        HttpSession session = request.getSession();
        if (null == session) {
            return ResponseUtils.fail();
        }
        String username = String.valueOf(session.getAttribute(WebConstants.SESSION_USER_NAME));
        Room room = new Room();
        room.setRoomName(roomName);
        room.setStatus(EnumRoomStatus.OPENING.code());
        room.setCreator(username);

        roomMapper.insert(room);
        return ResponseUtils.success().data("room", room);
    }

    @Override
    public Response list() {
        List<Room> rooms = roomMapper.selectAll();
        return ResponseUtils.success().data("rooms", rooms);
    }
}
