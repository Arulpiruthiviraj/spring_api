package com.aruldailycode.springbootapi.controller;

import com.aruldailycode.springbootapi.entity.Department;
import com.aruldailycode.springbootapi.error.DepartmentNotFoundException;
import com.aruldailycode.springbootapi.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Saving the Department");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("")
    public List getDepartmentList() {
        LOGGER.info("Get Department List");
        return departmentService.getDepartmentList();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        LOGGER.info("Get the Department by Id");
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("Delete the Department");
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully";
    }

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        LOGGER.info("Update the Department");
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName) {
        LOGGER.info("get department by name");
        return departmentService.getDepartmentByName(departmentName);
    }

}
