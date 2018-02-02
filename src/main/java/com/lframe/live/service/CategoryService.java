package com.lframe.live.service;

import com.lframe.live.pojo.Category;

public interface CategoryService {

    void add(Category category);

    Category get(int id);

    void delete(int id);

    void update(Category category);
}
