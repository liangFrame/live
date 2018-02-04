package com.lframe.live.service.serviceImpl;

import com.lframe.live.mapper.CategoryMapper;
import com.lframe.live.pojo.Category;
import com.lframe.live.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author home-pc
 * @create2018 -02 -02 -23:13
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public void add(Category category) {
    }

    @Override
    public Category get(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Category category) {

    }
}
