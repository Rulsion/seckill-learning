package com.demo.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Description:
 * @Author: Rulsion
 * @Date: 2019/4/6 15:29
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "seckill")
public class Seckill {
    @Id
    @Column(name = "seckill_id")
    private long seckillId;
    @Column(name = "name")
    private String name;
    @Column(name = "number")
    private int number;
    @Column(name = "start_time")
    private Date startTime;
    @Column(name = "end_time")
    private Date endTime;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "type_id")
    private short typeId;
}

