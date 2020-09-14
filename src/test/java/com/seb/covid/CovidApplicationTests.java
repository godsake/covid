package com.seb.covid;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.seb.services.UrlService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CovidApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testUrlService() throws Exception {
		// String html = new UrlService().getUrlAsString("http://www.google.com");
		// assertTrue(html != null);
		// assertTrue(html.length() > 0);
		// assertTrue(html.contains("<html"));
	}
}
