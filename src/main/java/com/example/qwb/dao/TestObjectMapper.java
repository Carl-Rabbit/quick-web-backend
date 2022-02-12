package com.example.qwb.dao;

import com.example.qwb.entity.TestObject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestObjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestObject record);

    int insertSelective(TestObject record);

    TestObject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestObject record);

    int updateByPrimaryKey(TestObject record);

    // extra

    List<TestObject> selectAll();
}