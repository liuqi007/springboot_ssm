package com.jip.springboot_ssm.service.impl;

import com.jip.springboot_ssm.dao.IDeptDao;
import com.jip.springboot_ssm.entity.Dept;
import com.jip.springboot_ssm.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Time:2018/11/15 19:49
 * @Author:Jip
 * @Version:1.0
 */
@Service
//@Transactional  使用事务
public class DeptServiceImpl implements IDeptService {
	@Autowired
	private IDeptDao deptDao;
	@Override
	public List<Dept> getAll() {
		return deptDao.getAll();
	}
}
