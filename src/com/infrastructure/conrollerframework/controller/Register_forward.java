package com.infrastructure.conrollerframework.controller;

import javax.net.*;
import java.util.*;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infrastructure.conrollerframework.data.HttpRequestProxy;
import com.infrastructure.conrollerframework.data.HttpResponseProxy;
import com.infrastructure.conrollerframework.data.VI;
import com.infrastructure.exception.BaseException;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class Register_forward extends BaseAction {

		@Override
	public VI convertRequest(HttpServletRequest request) throws BaseException {
		System.out.println("convertRequest");
		return null;
	}
	
	@Override
	public HttpResponseProxy executeRequest(HttpRequestProxy request) throws BaseException,IOException {
		
		String name = request.getParameter("j_name");
		String email = request.getParameter("j_email");
		String pwd = request.getParameter("j_pwd");
		String family = request.getParameter("j_gid");
		String dob = request.getParameter("j_dob");
		String gen = request.getParameter("j_gen");
		
		HashMap newmap = new HashMap();
		newmap.put(1, name);
		newmap.put(2, email);
		newmap.put(3, pwd);
		newmap.put(4, family);
		newmap.put(5, dob);
		newmap.put(6, gen);
		
		String query = newmap.toString();
			
		
		URL url = new URL("http://www.triphpe.16mb.com/vreg.html");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setReadTimeout(10000);
		conn.setConnectTimeout(20000);
		conn.setRequestMethod("POST");
		conn.setDoInput(true);
		conn.setDoOutput(true);
				
		OutputStream os = conn.getOutputStream();
		BufferedWriter writer = new BufferedWriter(
		            new OutputStreamWriter(os, "UTF-8"));
		writer.write(query);
		writer.flush();
		writer.close();
		os.close();

		conn.connect();
		
		
		return null;
	}

	

	@Override
	public void actionForward(VI response, ServletConfig config,
			HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) throws BaseException {
		try {

			System.out.println(" Action Forward Called");
			/*servletRequest.setAttribute("RESPONSE_VI_ATTRIBUTE", response);

			config.getServletContext().getRequestDispatcher("")
					.forward(servletRequest, servletResponse);
*/		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
			}
	
		
	

}
