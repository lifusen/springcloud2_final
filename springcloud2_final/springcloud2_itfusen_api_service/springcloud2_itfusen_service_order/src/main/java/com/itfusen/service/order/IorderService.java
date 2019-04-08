package com.itfusen.service.order;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface IorderService {
    @RequestMapping(value="/getOrder")
    String getOrder(@RequestParam("name") String name);

    @RequestMapping(value="/getOrderFeign")
    String getOrderFeign(@RequestParam("name") String name);

    @RequestMapping(value="/getOrderFeignHys")
    @HystrixCommand(fallbackMethod = "heheda")
    String getOrderFeignHys(@RequestParam("name") String name);

}
