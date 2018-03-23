package com.cloud.datasourcetest.mapper;

import com.cloud.datasourcetest.dto.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/26 20:49
 * @description
 */
@Mapper
public interface CategoryMapper {
    /**
     * 数据插入
     * @param category
     * @return
     */
    int insert(Category category);


}
