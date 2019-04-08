package com.itfusen.api.order.fallback;

import com.itfusen.api.order.feign.MemberServiceFeign;
import com.itfusen.service.member.ImemberService;
import org.springframework.stereotype.Component;

@Component
public class Error implements MemberServiceFeign{

    @Override
    public String getMember(String name) {
        return null;
    }
}
