package com.example.qwb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName(value="test_table")
public class TestObject {
    @TableId(value="id",type=IdType.AUTO)
    Integer id;
    String str;
}
