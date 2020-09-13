package com.seb.covid;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.seb.services.URLHelper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CovidApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testUrlHelper() throws Exception {
		String html = URLHelper.getUrlAsString("http://www.google.com");
		assertTrue(html != null);
		assertTrue(html.length() > 0);
		assertTrue(html.contains("<html"));
	}
}
