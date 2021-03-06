package com.faceblog.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.faceblog.service.AdminSensitiveServiceInterface;
import com.faceblog.service.impl.AdminSensitiveServiceImpl;

public class AdminSensitiveAddCon extends HttpServlet {
	/**
	 * 敏感词添加
	 */
	private static final long serialVersionUID = 1L;
	AdminSensitiveServiceInterface ns = new AdminSensitiveServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取参数
		Date date = new Date();
		//日期格式化
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd- HH-mm-ss");
		String word = request.getParameter("sensitive");
		String time = df.format(date);
		//service层处理
		String res = ns.SensitiveAdd(word, time);
		//结果返回
		request.setAttribute("sensitive", res);
		request.getRequestDispatcher(
				"/backstage/manager/admin_SensitiveAdd.jsp").forward(request,
				response);
	}
}
