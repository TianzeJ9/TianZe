package com.thmy.mybat.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.thmy.mybat.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository

public interface UserMapper extends BaseMapper<User> {
    //插入一条数据
    int insert(User user);
    //删一条数据
    int deleteById(Serializable id);
    //改一条数据
    int updateById(User user);
    //查一条数据
    User selectById(Serializable id);

}
