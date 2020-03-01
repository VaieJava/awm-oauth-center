package com.outdd.oauth.feign;

import com.outdd.awmapicustomer.service.MenuApiService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/*
 *
 * @author VAIE
 * @date: 2019/5/9-16:54
 * @version v1.0
 */
@Component
@FeignClient("customer-server")
public interface MenuApiServiceFeign extends MenuApiService {
}
