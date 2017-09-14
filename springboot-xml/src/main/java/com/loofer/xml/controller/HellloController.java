package com.loofer.xml.controller;


import com.loofer.service.OuterService;
import com.loofer.xml.service.InnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloController {

    @Autowired
    private OuterService outerService;

    @Autowired
    private InnerService innerService;

}
