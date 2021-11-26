package com.yang.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(type = IdType.UUID)
    private long id;
    private  String name;
    private int age;
    private String email;
}
