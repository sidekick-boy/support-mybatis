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
import com.huawei.support.mapper.NewUserMapper;

public class NewUserMapperTest {
	SqlSessionFactory sqlSessionFactory;
	SqlSession  sqlSession;
	NewUserMapper newUserMapper;

	@Before
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession(true);
		newUserMapper = sqlSession.getMapper(NewUserMapper.class);
	}

	@Test
	public void testSelectOne() {
		User user = newUserMapper.selectOne(new User(2L,null,null,null,null));
		System.out.println(user);
	}

	@Test
	public void testSelect() {
	}

	@Test
	public void testSelectCount() {
	}

	@Test
	public void testSelectByPrimaryKey() {
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testInsertSelective() {
	}

	@Test
	public void testDelete() {
	}

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCountByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExampleSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

}
