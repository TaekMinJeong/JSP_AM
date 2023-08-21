package com.KoreaIT.java.am;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home/printDan")
public class HomeMainServlet3 extends HttpServlet {           
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String inputDan = request.getParameter("dan");
		
		int dan = Integer.parseInt(inputDan);
		
		response.getWriter().append(String.format("%d단<br />", dan));
		
		for(int i = 1; i <= 9; i++) {
			response.getWriter().append(String.format("%d * %d = %d<br>", dan, i, dan * i));
		}
	}
}
