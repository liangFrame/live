package com.lframe.live;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.lframe.live.mapper")
@SpringBootTest
public class LiveApplicationTests {

	@Test
	public void contextLoads() {
	}

}
