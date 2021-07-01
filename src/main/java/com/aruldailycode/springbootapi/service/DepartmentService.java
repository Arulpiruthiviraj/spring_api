package com.aruldailycode.springbootapi.service;

import com.aruldailycode.springbootapi.entity.Department;

import java.util.List;

public interface DepartmentService {
   public  Department saveDepartment(Department department);

   public List getDepartmentList();

  public Department getDepartmentById(Long departmentId);

  public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

     Department getDepartmentByName(String departmentName);
}
