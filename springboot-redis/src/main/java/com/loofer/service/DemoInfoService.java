package com.loofer.service;

import com.loofer.domain.DemoInfo;

public interface DemoInfoService {

    DemoInfo findById(long id);

    void deleteFromCache(long id);

    void test();

}
