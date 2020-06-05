package com.producer.producer.controller.mongodb;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OutOfMemoryTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        int i = 0;
        while (true){
            list.add(new User(i++, UUID.randomUUID().toString()));
        }
    }
}
