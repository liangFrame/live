package com.lframe.live.serviceimpl;

import com.lframe.live.pojo.Category;
import com.lframe.live.pojo.Item;
import com.lframe.live.service.CategoryService;
import com.lframe.live.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemServiceImplTest {


    @Autowired
    ItemService itemService;

    @Autowired
    CategoryService categoryService;

    @Test
    public void add() {
        Item item=new Item();
        item.setName("穿越");
        Category category=categoryService.get("网游竞技");
        int cid=category.getId();
        item.setCid(cid);
        item.setCategory(category);
        itemService.add(item);
    }

    @Test
    public void delete() {
        itemService.delete(1);
    }

    @Test
    public void update() {
        Item item=itemService.get(2);
        item.setName("穿越火线");
        itemService.update(item);
    }

    @Test
    public void get() {
        Item item=itemService.get(1);
        System.out.println(item);
    }

    @Test
    public void list() {
        Category category=categoryService.get("网游竞技");
        List<Item> items=itemService.list(category.getId());
        for (Item item:items){
            System.out.println(item);
        }

    }
}