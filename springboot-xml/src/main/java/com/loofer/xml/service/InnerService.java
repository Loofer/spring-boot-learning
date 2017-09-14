package com.loofer.xml.service;


import org.springframework.stereotype.Service;

@Service
public class InnerService {

    public InnerService() {
        System.out.println("InnerService");
    }
}
