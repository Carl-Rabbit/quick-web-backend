package com.example.qwb.service;

import com.example.qwb.entity.TestObject;

import java.util.List;

public interface TestService {
    List<TestObject> getAllTestObject();
    int createTestObject(String str);
}
