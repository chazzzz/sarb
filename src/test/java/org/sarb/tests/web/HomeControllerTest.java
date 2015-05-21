package org.sarb.tests.web;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

/**
 * Created by chazz on 5/20/2015.
 */
public class HomeControllerTest {

	private String hostname = "localhost";

	private String port = "8080";

	private String protocol = "http";

	private String basename = "sarb";

	@Test
	public void testIndex() throws IOException {
		String url = protocol + "://" + hostname + ":" + port + "/" + basename;

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet request = new HttpGet(url);

		CloseableHttpResponse httpResponse = httpClient.execute(request);
		int responseStatusCode = httpResponse.getStatusLine().getStatusCode();


		assertEquals(responseStatusCode, 200);
	}
}
