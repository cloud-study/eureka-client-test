package com.cloud.datasourcetest.mapper;

import com.cloud.datasourcetest.dto.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/26 20:44
 * @description
 */
@Mapper
public interface UserMapper {
    /**
     * 数据插入
     * @param user
     * @return
     */
    int insert(User user);
}
