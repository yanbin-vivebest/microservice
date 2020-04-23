package com.producer.producer.mapper;

import com.producer.producer.dto.CustInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustInfoRepository extends MongoRepository<CustInfo, Long> {

    /**
     * Like（模糊查询）
     * {"username" : name} ( name as regex)
     * */
    List<CustInfo> findByUsernameLike(String username);

    /**
     * Like（模糊查询）
     * {"username" : name}
     * */
    List<CustInfo> findByUsername(String username);

}
