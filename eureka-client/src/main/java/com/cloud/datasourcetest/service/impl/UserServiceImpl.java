package com.cloud.datasourcetest.service.impl;

import com.cloud.datasource.TargetDatasource;
import com.cloud.datasourcetest.dto.User;
import com.cloud.datasourcetest.mapper.UserMapper;
import com.cloud.datasourcetest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/26 20:44
 * @description
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
