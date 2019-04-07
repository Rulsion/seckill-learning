package com.demo.entity;

import com.demo.entity.pk.SuceesskilledPK;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
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
@Table(name = "success_killed")
public class SuccessKilled {
    @EmbeddedId
    private SuceesskilledPK id;

    @Column(name = "state")
    private boolean state;

    @Column(name = "create_time")
    private Date createTime;

}


