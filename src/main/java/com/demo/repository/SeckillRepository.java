package com.demo.repository;

import com.demo.entity.Seckill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @Author: Rulsion
 * @Date: 2019/4/6 10:24
 */
@Repository
public interface SeckillRepository extends JpaRepository<Seckill, Long> {
}
