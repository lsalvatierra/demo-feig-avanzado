package com.la.demo_feign_avanzado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoFeignAvanzadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignAvanzadoApplication.class, args);
	}

}
