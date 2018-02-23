package com.lframe.live.serviceimpl;

import com.lframe.live.mapper.CategoryMapper;
import com.lframe.live.mapper.ItemMapper;
import com.lframe.live.pojo.Category;
import com.lframe.live.pojo.Item;
import com.lframe.live.pojo.ItemExample;
import com.lframe.live.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author home-pc
 * @create2018 -02 -23 -9:20
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public void add(Item item) {
        itemMapper.insert(item);
    }

    @Override
    public void delete(Integer id) {
        itemMapper.deleteByPrimaryKey(id);
    }

    public void setCategory(Item item){
        int cid=item.getCid();
        Category category=categoryMapper.selectByPrimaryKey(cid);
        item.setCategory(category);
    }
    public void setCategory(List<Item> items){
        for (Item item:items){
            setCategory(item);
        }
    }

    /**
     * 测试一下
     * @param item
     */
    @Override
    public void update(Item item) {
        itemMapper.updateByPrimaryKey(item);
    }



    @Override
    public Item get(Integer id) {
        Item item=itemMapper.selectByPrimaryKey(id);
        setCategory(item);
        return item;
    }

    @Override
    public List<Item> list(int cid) {
        ItemExample itemExample=new ItemExample();
        ItemExample.Criteria criteria=itemExample.createCriteria();
        criteria.andCidEqualTo(cid);
        List<Item> items=itemMapper.selectByExample(itemExample);
        setCategory(items);
        return items;
    }
}
