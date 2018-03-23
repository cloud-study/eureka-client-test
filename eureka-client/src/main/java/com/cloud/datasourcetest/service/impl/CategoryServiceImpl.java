package com.cloud.datasourcetest.service.impl;

import com.cloud.datasource.TargetDatasource;
import com.cloud.datasourcetest.dto.Category;
import com.cloud.datasourcetest.mapper.CategoryMapper;
import com.cloud.datasourcetest.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/26 20:50
 * @description
 */
@Service
public class CategoryServiceImpl implements ICategoryService{
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    @TargetDatasource(name = "sub")
    public int insert(Category category) {
        return categoryMapper.insert(category);
    }
}
