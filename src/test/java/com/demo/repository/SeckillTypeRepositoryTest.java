package com.demo.repository;

import com.demo.SeckillApplication;
import com.demo.entity.Seckill;
import com.demo.entity.SeckillType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Rulsion
 * @Date: 2019/4/7 15:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= SeckillApplication.class)
public class SeckillTypeRepositoryTest {
    @Autowired
    private SeckillTypeRepository seckillTypeRepository;

    @Test
    public void findAll(){
        List<SeckillType> seckillTypes = seckillTypeRepository.findAll();
        seckillTypes.forEach(System.out::println);
    }
}