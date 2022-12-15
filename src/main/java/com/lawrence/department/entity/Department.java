package com.lawrence.department.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings(value = { "unused" })
public class Department {
    @Id
    @SequenceGenerator(name="department_sequence",sequenceName="department_sequence", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="department_sequence")
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
	private String departmentCode;
	public Long getDepartmentId() {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
		
	
	
}
