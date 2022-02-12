package com.example.qwb.service.impl;

import com.example.qwb.dao.TestObjectMapper;
import com.example.qwb.entity.TestObject;
import com.example.qwb.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestObjectMapper testObjectMapper;

    public TestServiceImpl(TestObjectMapper testObjectMapper) {
        this.testObjectMapper = testObjectMapper;
    }

    @Override
    public List<TestObject> getAllTestObject() {
        return testObjectMapper.selectAll();
    }

    @Override
    public int createTestObject(String str) {
        TestObject obj = TestObject.builder()
                .str(str)
                .build();
        int affectedRowCnt = testObjectMapper.insertSelective(obj);
        return affectedRowCnt == 1 ? obj.getId() : -1;
    }
}
