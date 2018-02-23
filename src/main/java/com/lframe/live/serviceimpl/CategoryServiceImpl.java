package com.lframe.live.serviceimpl;

import com.lframe.live.mapper.CategoryMapper;
import com.lframe.live.pojo.Category;
import com.lframe.live.pojo.CategoryExample;
import com.lframe.live.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author home-pc
 * @create2018 -02 -04 -18:04
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public void add(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public Category get(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(Integer id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public List<Category> list() {
        CategoryExample categoryExample=new CategoryExample();
        categoryExample.setOrderByClause("id desc");
        return categoryMapper.selectByExample(categoryExample);
    }

    @Override
    public Category get(String nameKeyWord) {
        CategoryExample categoryExample=new CategoryExample();
        CategoryExample.Criteria criteria=categoryExample.createCriteria();
        criteria.andNameEqualTo(nameKeyWord);
        List<Category> categories=categoryMapper.selectByExample(categoryExample);
        return categories.get(0);
    }
}
