package com.bitc.plummarketdb.service;


import com.bitc.plummarketdb.DTO.userDTO;
import com.bitc.plummarketdb.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int isUserInfo(@Param("userId") String userId, @Param("userPw") String userPw) throws Exception {
        return userMapper.isUserInfo(userId,userPw);
    }

    @Override
    public userDTO getUserInfo(String userId) throws Exception {
        return userMapper.getUserInfo(userId);
    }

    @Override
    public userDTO selectList() throws Exception {
        return userMapper.selectList();
    }
}