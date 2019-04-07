package com.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * @Description:
 * @Author: Rulsion
 * @Date: 2019/4/6 15:29
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "seckill_type")
public class SeckillType {
    @Id
    @Column(name = "type_id")
    private short typeId;

    @Column(name = "describe")
    private String describe;
}
