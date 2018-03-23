package com.cloud.datasourcetest.service.impl;

import com.cloud.datasourcetest.dto.Category;
import com.cloud.datasourcetest.dto.User;
import com.cloud.datasourcetest.service.ICategoryService;
import com.cloud.datasourcetest.service.IDataSourceTransactionsService;
import com.cloud.datasourcetest.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/26 20:36
 * @description
 */
@Service
public class DataSourceTransactionServiceImpl implements IDataSourceTransactionsService {
    @Autowired
    private IUserService userService;
    @Autowired
    private ICategoryService categoryService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void insertTransaction() {
        User user = new User();
        user.setNickName("test")
                .setPassword("test")
                .setPhone("12345678")
                .setEmail("test@test.com")
                .setValidateCode("test")
                .setCreateBy(1)
                .setCreateDate(new Date())
                .setLasUpdateBy(1)
                .setLastUpdateDate(new Date());
        userService.insert(user);
        logger.debug("user 插入成功：{}", user);
        Category category = new Category();
        category.setName("test")
                .setDescr("test")
                .setPid(null)
                .setLevel(2);
        categoryService.insert(category);
        logger.debug("category 插入成功：{}", category);
    }
}
