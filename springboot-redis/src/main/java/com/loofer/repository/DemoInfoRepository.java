package com.loofer.repository;

import com.loofer.domain.DemoInfo;
import org.springframework.data.repository.CrudRepository;

public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long> {
    
}
