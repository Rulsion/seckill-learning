package com.demo.repository;

import com.demo.entity.SuccessKilled;
import com.demo.entity.pk.SuceesskilledPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Rulsion
 * @Date: 2019/4/5 17:05
 */
@Repository
public interface SuccessKilledRepository extends JpaRepository<SuccessKilled, SuceesskilledPK> {


}
