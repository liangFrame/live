package com.lframe.live.controller;

import com.lframe.live.domain.Result;
import com.lframe.live.pojo.Item;
import com.lframe.live.service.ItemService;
import com.lframe.live.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author home-pc
 * @create2018 -02 -23 -12:22
 */
@RestController
public class ItemController {


    @Autowired
    ItemService itemService;

    @GetMapping("/items/{cid}")
    @CrossOrigin
    public Result<Item> list(@PathVariable("cid") int cid){

        return ResultUtils.success(itemService.list(cid));
    }
}
