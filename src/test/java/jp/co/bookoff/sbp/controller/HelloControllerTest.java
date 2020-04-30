package jp.co.bookoff.sbp.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@WebMvcTest(HelloController.class)
class HelloControllerTest {
	@Autowired
	MockMvc mock;
	

//	@Test
//	void testHello() throws Exception{
//		mock.perform(get("/hello"))
//		.andExpect(status().is0k())
//		.andExpect(content().string("Hello 스프링부트!!"));
//		
//		MvcResult resutl = mock.perform(get("/hello"))
//				.andExpect(status().isOk())
//				.andReturn();
//		
//		assertEquals("Hello 스프링부트!!", result.getResponse().getContentAsString());
//		assertThat(result.getResponse().getContentAsString()).isEqualTo("Hello 스프링부트!!");
//		
//		System.out.println("RRR>>" + result.getResponse().getContentAsString());
//		
//	}

}
