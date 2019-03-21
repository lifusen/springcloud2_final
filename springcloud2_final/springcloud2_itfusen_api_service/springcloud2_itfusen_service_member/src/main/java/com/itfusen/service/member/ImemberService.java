package com.itfusen.service.member;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ImemberService {

    @RequestMapping("/getMember")
    String getMember(@RequestParam("name") String name);

}
