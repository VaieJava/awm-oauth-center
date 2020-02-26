package com.outdd.oauth.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/*
 * TODO: [NAME]
 * @author VAIE
 * @date: 2019/5/9-16:54
 * @version v1.0
 */
@Component
@FeignClient("member-server")
public interface MenuApiServiceFeign {
}
