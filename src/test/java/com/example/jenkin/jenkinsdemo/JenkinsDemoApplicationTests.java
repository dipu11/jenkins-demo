package com.example.jenkin.jenkinsdemo;

import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.Assert;
import org.assertj.core.api.AssertDelegateTarget;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Log4j2
class JenkinsDemoApplicationTests {

	@BeforeAll
	static void contextLoads() {
		log.info("initializing everything regarding test environment");
	}

	@Test
	@Order(1)
	public void testSuccess(){
		Assertions.assertEquals(1, 1, "should pass 2");
	}

	@Test
	@Order(2)
	public void testSuccess2(){
		Assertions.assertEquals("test", "test", "should pass 2");
	}

	@Test
	@Order(3)
	public void testFail1(){
		Assertions.assertEquals("test", "failthis", "should fail on 3");
	}

	@Test
	@Order(4)
	public void testSuccess3(){
		Assertions.assertEquals("test", "test", "should pass on 4");
	}

	@Test
	@Order(5)
	public void testFail2(){
		Assertions.assertEquals("test5", "test", "should fail on 5");
	}

	@Test
	@Order(6)
	public void testSuccess4(){
		Assertions.assertNotEquals("test5", "test", "should success on 6");
	}

}
