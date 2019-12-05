package com.javalearn.cloud.mall.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author king-pan
 * @date 2019/11/18 0:05
 */
@Data
@Entity
@NoArgsConstructor
public class SysUser implements Serializable {
    @Id
    @Column
    private Long id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private Integer userLevel;
}
