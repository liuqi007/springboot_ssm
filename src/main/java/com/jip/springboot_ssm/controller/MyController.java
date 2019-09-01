package com.jip.springboot_ssm.controller;

import com.jip.springboot_ssm.entity.Dept;
import com.jip.springboot_ssm.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Time:2018/11/15 16:56
 * @Author:Jip
 * @Version:1.0
 */
@RestController
public class MyController {
	@Autowired
	private IDeptService deptService;

	@RequestMapping("/")
	public String index() {
		return "hello";
	}

	@RequestMapping("/getAll")
	public List<Dept> getAll() {
		List<Dept> depts = deptService.getAll();
		return depts;
	}
}
