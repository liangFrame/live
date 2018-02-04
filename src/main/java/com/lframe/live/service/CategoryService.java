package com.lframe.live.service;

import com.lframe.live.pojo.Category;

import java.util.List;

public interface CategoryService {

    void add(Category category);

    Category get(Integer id);

    void delete(Integer id);

    void update(Category category);

    List<Category> list();
}
