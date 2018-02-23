package com.lframe.live.service.serviceImpl;

import com.lframe.live.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CategoryServiceImplTest {

    /**
     * 系统默认的日志级别是info，在它之上的能够输出出来，这里的debug是在之下，所以输出不出来。
     */
    @Test
    public void test(){
        String user="baobao";
        String password="123";
        log.info(": {}, password: {}",user,password);
        log.debug("debug..");
        log.info("info...");
        log.error("error...");
        log.error("fgdsfdsf");

    }

    @Autowired
    CategoryService categoryService;

    @Test
    public void get() {
        System.out.println(categoryService.get(1).getName());
    }




}