package com.producer.producer;

import com.producer.producer.dto.CustInfo;
import com.producer.producer.mapper.CustInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTest {

    @Autowired
    private CustInfoRepository custInfoRepository;

    @Test
    public void test(){

        // 创建10个User，并验证User总数
        custInfoRepository.save(new CustInfo(1L, "aaaaa", 10));
        custInfoRepository.save(new CustInfo(2L, "bbbaa", 20));
        custInfoRepository.save(new CustInfo(3L, "cccaa", 30));
        custInfoRepository.save(new CustInfo(4L, "dddaa", 40));
        custInfoRepository.save(new CustInfo(5L, "eeeaa", 50));
        custInfoRepository.save(new CustInfo(6L, "fffee", 60));
        custInfoRepository.save(new CustInfo(7L, "gggee", 70));
        custInfoRepository.save(new CustInfo(8L, "hhhee", 80));
        custInfoRepository.save(new CustInfo(9L, "iiiee", 90));

        log.info(String.valueOf(custInfoRepository.findAll().size()));
    }

    @Test
    public void test2(){
        List<CustInfo> u1 = custInfoRepository.findByUsernameLike("aaa");
        log.info(u1.toString());

        List<CustInfo> u2 = custInfoRepository.findByUsername("bbbaa");
        log.info(u2.toString());
    }

}
