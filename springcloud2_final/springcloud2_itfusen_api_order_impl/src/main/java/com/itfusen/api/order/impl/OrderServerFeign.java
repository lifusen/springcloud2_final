package com.itfusen.api.order.impl;

import com.itfusen.api.order.feign.MemberServiceFeign;
import com.itfusen.service.order.IorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lifusen
 * @create 2019-03-20 13:56
 * @descri
 **/
@RestController
public class OrderServerFeign implements IorderService {

    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @Override
    public String getOrderFeign(@RequestParam("name") String name)
    {
        return memberServiceFeign.getMember(name) ;
    }

    @Override
    public String getOrder(String name) {
        return null;
    }
}
