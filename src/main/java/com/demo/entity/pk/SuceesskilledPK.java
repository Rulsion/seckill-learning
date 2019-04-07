package com.demo.entity.pk;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @Description:
 * @Author: Rulsion
 * @Date: 2019/4/6 15:47
 */
@Embeddable
@ToString
@Getter
@Setter
public class SuceesskilledPK implements Serializable {

    @Column(name = "seckill_id")
    private long seckillId;

    @Column(name = "user_phone")
    private long userPhone;
}
