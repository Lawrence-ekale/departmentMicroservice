package com.lawrence.department.controller;

import com.lawrence.department.entity.Department;
import com.lawrence.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    
    Logger logger = LoggerFactory.getLogger(Department.class);

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        logger.info("Inside saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id")Long departmentId) {
        logger.info("Inside findDepartmentById method of Department Controller "+departmentId);
        return departmentService.findDepartmentById(departmentId);
    }
}
