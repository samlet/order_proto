package com.bluecc.bluesrv.ecomm;

import lombok.Data;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/*
$ just app ecomm.EcommApp
 */

@SpringBootApplication
@MapperScan({"com.bluecc.bluesrv.ecomm.mapper"})
public class EcommApp {
	public static void main(String[] args) {
		SpringApplication.run(EcommApp.class, args);
	}

	@Autowired
	Feeder feeder;

	@Bean
	public Function<RetriveNumber, List<Feeder.Contract>> contractSeeds(){
		return num -> feeder.genPostalAddress(num.total);
	}

	@Bean
	public Function<Foo, Bar> uppercase() {
		return value -> new Bar(value.uppercase());
	}

}

// @checkstyle:on

@Data
class RetriveNumber{
	int total;
}

class Foo {

	private String value;

	Foo() {
	}

	Foo(String value) {
		this.value = value;
	}

	public String lowercase() {
		return this.value.toLowerCase();
	}

	public String uppercase() {
		return this.value.toUpperCase();
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

class Bar {

	private String value;

	Bar() {
	}

	Bar(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
