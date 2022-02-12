package com.example.qwb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.qwb.entity.TestObject;
import org.springframework.stereotype.Repository;

@Repository
public interface TestObjectMapper extends BaseMapper<TestObject> {
    TestObject getFirst();
}