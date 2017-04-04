
package com.infrastructure.conrollerframework.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infrastructure.conrollerframework.data.HttpRequestProxy;
import com.infrastructure.conrollerframework.data.HttpResponseProxy;
import com.infrastructure.conrollerframework.data.VI;
import com.infrastructure.exception.BaseException;

public abstract class Receive extends BaseAction{

	@Override
	
	public HttpResponseProxy executeRequest(HttpRequestProxy request) throws BaseException, IOException {
		System.out.println("executeRequest");
		URL connectURL = new URL("https://google.com");
	    BufferedReader in = new BufferedReader(
	    new InputStreamReader(connectURL.openStream()));

	    String inputLine;
	    StringBuilder sb = new StringBuilder();
	    while ((inputLine = in.readLine()) != null){     
	        System.out.println(inputLine);
	        sb.append(inputLine);
	    }
	    String[] strArray2 = sb.toString().split(Pattern.quote("split"));
	    System.out.println(strArray2[0]);
	    System.out.println(strArray2[1]);

	    in.close();
		return null;
	}
	
	

}
