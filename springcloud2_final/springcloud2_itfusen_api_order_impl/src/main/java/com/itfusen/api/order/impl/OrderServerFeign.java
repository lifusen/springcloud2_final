package com.itfusen.api.order.impl;

import com.itfusen.api.order.feign.MemberServiceFeign;
import com.itfusen.service.order.IorderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lifusen
 * @create 2019-03-20 13:56
 * @descri
 **/
@RestController
public class OrderServerFeign implements IorderService {

    @Resource
    private MemberServiceFeign memberServiceFeign;

    @Override
    public String getOrderFeign(String name)
    {
        System.out.println("线程"+Thread.currentThread().getName());
        System.out.println("订单服务收到name:"+name);
        return memberServiceFeign.getMember(name) ;
    }

    @Override
    @RequestMapping(value="/getOrderFeignHys")
    @HystrixCommand(fallbackMethod = "heheda")
    public String getOrderFeignHys(String name) {
        System.out.println("线程"+Thread.currentThread().getName());
        System.out.println("订单服务收到Hyname:"+name);
        return memberServiceFeign.getMember(name);
    }

    public String heheda(String name)
    {
        return "heheda"+name;
    }

    @Override
    public String getOrder(String name) {
        return null;
    }
}
