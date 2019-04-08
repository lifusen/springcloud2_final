package com.itfusen.api.member.impl;

import com.itfusen.service.member.ImemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lifusen
 * @create 2019-03-20 10:50
 * @descri
 **/
@RestController
public class MemberServerImpl implements ImemberService {

    public String getMember(@RequestParam("name") String name)
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Member服务收到名称："+ name ;
    }
}
