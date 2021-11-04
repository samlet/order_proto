package com.bluecc.bluesrv.ecomm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
$ just app ecomm.EcommApp
 */

@SpringBootApplication
@MapperScan({"com.bluecc.bluesrv.ecomm.mapper"})
public class EcommApp {
	public static void main(String[] args) {
		SpringApplication.run(EcommApp.class, args);
	}

}
