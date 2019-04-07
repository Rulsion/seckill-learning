package com.demo.service;

import com.demo.entity.Seckill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Author: Rulsion
 * @Date: 2019/4/6 16:07
 */

public interface SeckillService {
/*

 * @Description:

 * @Author: Rulsion

 * @Date: 2019/4/6 17:48

 * @Param: []

 * @Return: java.util.List<com.demo.entity.Seckill>

 */
    List<Seckill> getAll();


   /*
   
    * @Description:
   
    * @Author: Rulsion
   
    * @Date: 2019/4/6 17:48
   
    * @Param: []
   
    * @Return: com.demo.entity.Seckill
   
    */
    Seckill getBySeckillId(Long seckillId);
}
