package com.kifiyaApi.kifiyaApi;

import com.kifiyaApi.kifiyaApi.Service.EmployeeService;
import com.kifiyaApi.kifiyaApi.Service.HSProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KifiyaApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(KifiyaApiApplication.class, args);
	}
//	TODO Exception Handling for common cases

}
