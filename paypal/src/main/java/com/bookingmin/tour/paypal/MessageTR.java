package com.bookingmin.tour.paypal;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.bookingmin.tour.tool.Configuration;

public class MessageTR {
	
	public void testInitial() throws Exception{
		HttpGet httpGet = new HttpGet(Configuration.getStr("paypal.api.url")+"/GetTransactionDetails");
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		CloseableHttpResponse response = httpClient.execute(httpGet);
		
		System.out.println(EntityUtils.toString(response.getEntity()));
		
		httpClient.close();
	}
	
	public static void main(String[] args) throws Exception {
		MessageTR messageTR = new MessageTR();
		messageTR.testInitial();
	}
}
