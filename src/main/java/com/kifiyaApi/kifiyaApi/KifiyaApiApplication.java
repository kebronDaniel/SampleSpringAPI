package com.kifiyaApi.kifiyaApi;

import com.kifiyaApi.kifiyaApi.Model.Employee;
import com.kifiyaApi.kifiyaApi.Model.HealthServiceProviders;
import com.kifiyaApi.kifiyaApi.Repository.EmployeeRepository;
import com.kifiyaApi.kifiyaApi.Repository.HSProviderRepository;
import com.kifiyaApi.kifiyaApi.Service.EmployeeService;
import com.kifiyaApi.kifiyaApi.Service.HSProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KifiyaApiApplication implements CommandLineRunner {

	private EmployeeService employeeService;
	private HSProviderService hsProviderService;

	@Autowired
	public void setHsProviderService(HSProviderService hsProviderService) {
		this.hsProviderService = hsProviderService;
	}

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public static void main(String[] args) {
		SpringApplication.run(KifiyaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("------------------saving a new data------------------");
//		Employee keb = new Employee();
//		keb.setAge(23);
//		keb.setDescription("Good");
//		keb.setName("Kebron");
//		employeeService.saveEmployee(keb);
		System.out.println("------------------Finished saving a new data------------------");

		System.out.println("------------------saving a new Health service provider data------------------");
//		HealthServiceProviders yekatit = new HealthServiceProviders();
//		yekatit.setAddress("Filweha");
//		yekatit.setDescription("General Hospital");
//		yekatit.setName("Yekatit");
//		hsProviderService.saveHealthServiceProvider(yekatit);
		System.out.println("------------------Finished saving a new data------------------");
	}
}
