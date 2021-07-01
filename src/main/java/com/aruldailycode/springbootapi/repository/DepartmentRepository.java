package com.aruldailycode.springbootapi.repository;

import com.aruldailycode.springbootapi.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
