package com.kifiyaApi.kifiyaApi;

import com.kifiyaApi.kifiyaApi.Model.Employee;
import com.kifiyaApi.kifiyaApi.Model.HealthServiceProviders;
import com.kifiyaApi.kifiyaApi.Repository.EmployeeRepository;
import com.kifiyaApi.kifiyaApi.Repository.HSProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KifiyaApiApplication implements CommandLineRunner {

	private EmployeeRepository repository;
	private HSProviderRepository hsProviderRepository;

	@Autowired
	public void setRepository(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Autowired
	public void setHsProviderRepository(HSProviderRepository hsProviderRepository) {
		this.hsProviderRepository = hsProviderRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(KifiyaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("------------------saving a new data------------------");
		Employee employee = new Employee();
		employee.setAge(12);
		employee.setDescription("New Employee");
		employee.setName("Kebron");
		repository.save(employee);
		System.out.println("------------------Finished saving a new data------------------");

		System.out.println("------------------saving a new data------------------");
		HealthServiceProviders providers = new HealthServiceProviders();
		providers.setAddress("Addis Ababa");
		providers.setDescription("Higher Clinic");
		providers.setName("Black Lion");
		hsProviderRepository.save(providers);
		System.out.println("------------------Finished saving a new data------------------");
	}
}
