package com.seb.covid;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.core.JsonParseException;
import com.seb.services.CovidResult;
import com.seb.services.JsonService;
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
		String html = new UrlService().getUrlAsString("http://www.google.com");
		assertTrue(html != null);
		assertTrue(html.length() > 0);
		assertTrue(html.contains("<html"));
	}

	@Test
	void testGetJson() throws Exception, JsonParseException{
		CovidResult cr = new CovidResult();
		cr.setNbrDeath(111);
		cr.setNbrInfected(2222);

		String json = new JsonService().getJson(cr);

		assertTrue(json != null);
		assertTrue(json.contains("{"));
		assertTrue(json.contains("111"));
		assertTrue(json.contains("2222"));
	}

	@Test
	void testParseJson() throws Exception, JsonParseException{
		String json = "{\"nbrInfected\" : 2000,\"nbrDeath\" : 111}";
		CovidResult cr = new JsonService().<CovidResult>parseJson(CovidResult.class, json);

		assertTrue(cr != null);
		assertTrue(cr.getNbrDeath() == 111);
		assertTrue(cr.getNbrInfected() == 2000);
	}

}
