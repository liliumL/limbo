package com.example.lilium.service.impl;

import com.example.lilium.mapper.UserMapper;
import com.example.lilium.model.User;
import com.example.lilium.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @author Lijunbiao
 * @create 2019/7/31 031 20:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> getAllUser() {

        return userMapper.getAllUser();
    }
}
