package org.scbit.lsbi.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "customer")
public interface CustomerRemoteClient {

    @GetMapping("/get/{id}")
    String getInfo(@PathVariable("id") String id);

}
