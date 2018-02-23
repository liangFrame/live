package com.lframe.live.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lframe.live.domain.Result;
import com.lframe.live.pojo.Category;
import com.lframe.live.service.CategoryService;
import com.lframe.live.utils.Page;
import com.lframe.live.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Category控制器
 *
 * @author home-pc
 * @create2018 -02 -05 -6:40
 */
@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @GetMapping(value = "/categories/all")
    public Result<Category> getCategoryAll(Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Category> categories=categoryService.list();
        int total=(int)new PageInfo<>(categories).getTotal();
        page.setTotal(total);
        return ResultUtils.success(categories,page);
    }


}
