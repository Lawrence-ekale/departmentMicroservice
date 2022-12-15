package com.lawrence.department.service;

import com.lawrence.department.entity.Department;
import com.lawrence.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    
    Logger logger = LoggerFactory.getLogger(Department.class);

    public Department saveDepartment(Department department) {
        logger.info("Inside saveDepartment method of Department Service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        logger.info("Inside findDepartment method of Department Service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
