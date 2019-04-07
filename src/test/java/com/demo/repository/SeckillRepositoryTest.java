package com.demo.repository;

import com.demo.SeckillApplication;
import com.demo.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description:
 * @Author: Rulsion
 * @Date: 2019/4/7 15:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= SeckillApplication.class)
public class SeckillRepositoryTest {

    @Autowired
    private SeckillRepository seckillRepository;

    @Test
    public void findAll(){
        List<Seckill> seckills = seckillRepository.findAll();
        seckills.forEach(System.out::println);
    }

}