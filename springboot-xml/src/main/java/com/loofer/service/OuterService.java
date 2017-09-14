package com.loofer.service;


import org.springframework.stereotype.Service;

@Service
public class OuterService {

    public OuterService() {
        System.out.println("OuterService");
    }
}
