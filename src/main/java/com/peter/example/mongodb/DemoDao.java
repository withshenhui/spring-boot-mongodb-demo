package com.peter.example.mongodb;

/**
 * 描述: 提供增删改查 MongoDB 接口
 *
 **/
public interface DemoDao {

    void saveDemo(DemoEntity demoEntity);

    void removeDemo(Long id);

    void updateDemo(DemoEntity demoEntity);

    DemoEntity findDemoById(Long id);
}
