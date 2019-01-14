package org.kerwin.testmybatis;

import com.alibaba.fastjson.JSON;
import com.cn.kerwin.entity.Driver;
import com.cn.kerwin.entity.User;
import com.cn.kerwin.service.IDriverService;
import com.cn.kerwin.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;

	@Resource
	private IDriverService driverService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}

	@Test
	public void test2(){
		Driver driver = new Driver();
		driver.setUserId(1);
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);

		driver.setOrganizationIdList(ls);

		System.out.println(driver);
		driverService.addDriver(driver);
	}

	@Test
	public void test3(){
		Driver driver = new Driver();
		Map<String,Object> map = new HashMap<String, Object>();
		driver.setUserId(2);
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		driver.setOrganizationIdList(ls);

		map.put("organizationIdList",ls);
		map.put("driver",driver);


		driverService.addDriver2(map);
	}

	@Test
	public void test4(){
		List<Integer> id = new ArrayList<Integer>();
		id.add(4);
		id.add(5);
		id.add(6);
		id.add(7);
		userService.insertEmp(id);
	}
}
