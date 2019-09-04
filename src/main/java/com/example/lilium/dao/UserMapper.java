package com.example.lilium.dao;

import com.example.lilium.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}