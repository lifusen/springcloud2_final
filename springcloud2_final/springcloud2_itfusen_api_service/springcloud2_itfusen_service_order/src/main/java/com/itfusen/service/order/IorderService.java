package com.itfusen.service.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface IorderService {
    @RequestMapping(value="/getOrder")
    String getOrder(@RequestParam("name") String name);

    @RequestMapping(value="/getOrderFeign")
    String getOrderFeign(@RequestParam("name") String name);
}
