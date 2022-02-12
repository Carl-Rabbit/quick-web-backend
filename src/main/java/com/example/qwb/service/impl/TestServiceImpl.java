package com.example.qwb.service.impl;

import com.example.qwb.entity.TestObject;
import com.example.qwb.mapper.TestObjectMapper;
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
        return testObjectMapper.selectList(null);
    }

    @Override
    public int createTestObject(String str) {
        TestObject obj = TestObject.builder()
                .str(str)
                .build();
        int affectedRowCnt = testObjectMapper.insert(obj);
        return affectedRowCnt == 1 ? obj.getId() : -1;
    }

    @Override
    public TestObject getFirst() {
        return testObjectMapper.getFirst();
    }
}
