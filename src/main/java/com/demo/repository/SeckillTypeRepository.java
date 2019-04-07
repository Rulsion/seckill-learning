package com.demo.repository;

import com.demo.entity.SeckillType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: Rulsion
 * @Date: 2019/4/6 15:37
 */
@Repository
public interface SeckillTypeRepository extends JpaRepository<SeckillType, Long> {
}
