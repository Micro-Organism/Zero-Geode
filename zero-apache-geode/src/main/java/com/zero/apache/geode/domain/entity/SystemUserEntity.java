package com.zero.apache.geode.domain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

import java.io.Serializable;

@Region(value = "SystemUserEntity")
public class SystemUserEntity implements Serializable {
	@Id
	private  String name;
	private  int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
