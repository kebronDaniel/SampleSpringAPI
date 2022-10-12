package com.kifiyaApi.kifiyaApi.Repository;

import com.kifiyaApi.kifiyaApi.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
