package com.itfusen.api.order.feign;

import com.itfusen.service.member.ImemberService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="itfusen-member")
public interface MemberServiceFeign extends ImemberService {
}
