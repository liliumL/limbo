package com.example.lilium.mapper;


import com.example.lilium.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @author Lijunbiao
 * @create 2019/7/11 011 14:31
 */
@Repository
@Mapper
public interface UserMapper {

     List<User> getAllUser();

}
