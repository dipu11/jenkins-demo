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
	public void testSuccess(){
		Assertions.assertEquals(1, 1);
	}

	@Test
	public void testSuccess2(){
		Assertions.assertEquals("test", "test", "should pass");
	}

}
