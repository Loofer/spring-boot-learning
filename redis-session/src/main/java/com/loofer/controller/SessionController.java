package com.loofer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class SessionController {


    @GetMapping("/helloSession")
    public String helloSession(HttpSession session) {

        UUID uuid = (UUID) session.getAttribute("uuid");
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        session.setAttribute("uuid", uuid);
        return session.getId();
    }


}
