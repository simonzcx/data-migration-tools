package com.mingcloud.dataMigration.service.impl.master;


import com.mingcloud.dataMigration.entity.master.User;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import com.mingcloud.dataMigration.mapper.master.UserMapper;
import com.mingcloud.dataMigration.service.impl.BaseServiceImpl;
import com.mingcloud.dataMigration.service.master.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 用户操作实现类
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	protected BaseMapper<User> getMapper() {
		return this.userMapper;
	}
	
}
