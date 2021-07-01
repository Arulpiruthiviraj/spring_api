package com.aruldailycode.springbootapi.controller;

import com.aruldailycode.springbootapi.entity.Department;
import com.aruldailycode.springbootapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("")
    public List getDepartmentList() {
        return departmentService.getDepartmentList();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully";
    }

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.getDepartmentByName(departmentName);
    }

}
