package com.faceblog.controller.blog;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.faceblog.util.TimerHtml;

public class TimerHtmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(){
		TimerHtml.showTimer();
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
			
	}
}
