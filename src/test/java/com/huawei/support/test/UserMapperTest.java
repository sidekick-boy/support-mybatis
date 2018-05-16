package com.huawei.support.test;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.huawei.support.entity.User;
import com.huawei.support.mapper.UserMapper;

public class UserMapperTest {
	SqlSessionFactory sqlSessionFactory;
	SqlSession sqlSession;
	UserMapper userMapper;

	@Before
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession(true);
		userMapper = sqlSession.getMapper(UserMapper.class);
	}

	@Test
	public void test() {
		User user = userMapper.selectUserById(2L);
		System.out.println(user);
	}

}
