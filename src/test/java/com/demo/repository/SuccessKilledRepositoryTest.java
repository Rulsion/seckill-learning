package com.demo.repository;

import com.demo.SeckillApplication;
import com.demo.entity.SeckillType;
import com.demo.entity.SuccessKilled;
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
public class SuccessKilledRepositoryTest {
    @Autowired
    private SuccessKilledRepository successKilledRepository;

    @Test
    public void findAll(){
        List<SuccessKilled> successKilleds = successKilledRepository.findAll();
        successKilleds.forEach(System.out::println);
    }
}