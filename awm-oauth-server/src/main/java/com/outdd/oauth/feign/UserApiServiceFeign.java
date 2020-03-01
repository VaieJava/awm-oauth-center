package com.outdd.oauth.feign;

import com.outdd.awmapicustomer.service.UserApiService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/*
 *
 * @author VAIE
 * @date: 2019/3/14-22:47
 * @version v1.0
 */
@Component
@FeignClient("customer-server")
public interface UserApiServiceFeign extends UserApiService {
}
