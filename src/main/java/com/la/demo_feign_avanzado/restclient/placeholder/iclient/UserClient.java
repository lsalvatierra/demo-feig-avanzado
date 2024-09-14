package com.la.demo_feign_avanzado.restclient.placeholder.iclient;

import com.la.demo_feign_avanzado.restclient.config.FeignConfig;
import com.la.demo_feign_avanzado.restclient.placeholder.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "userClient", url = "https://jsonplaceholder.typicode.com",
        configuration = FeignConfig.class)
public interface UserClient {

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Long id,
                     @RequestHeader("Authorization") String token);
}
