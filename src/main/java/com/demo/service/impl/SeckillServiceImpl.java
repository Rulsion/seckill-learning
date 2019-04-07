package com.demo.service.impl;

import com.demo.entity.Seckill;
import com.demo.repository.SeckillRepository;
import com.demo.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Author: Rulsion
 * @Date: 2019/4/6 16:10
 */

@Service
public class SeckillServiceImpl implements SeckillService {
    @Autowired
    private SeckillRepository seckillRepository;

    public List<Seckill> getAll(){
        return seckillRepository.findAll();
    }

    public Seckill getBySeckillId(Long seckillId){
        return seckillRepository.findById(seckillId).get();

    }
}
