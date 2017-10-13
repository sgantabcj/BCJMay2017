package com.crmindz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.model.IndiaAlerts;
import com.crmindz.service.TsunamiAlertsService;

/**
 * Servlet implementation class TsunamiAlertsController
 */
@WebServlet("/TsunamiAlertsController")
public class TsunamiAlertsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TsunamiAlertsService tsunamiService = new TsunamiAlertsService();
		String[] s = new String[3];

		switch (request.getParameter("country")) {
		case "india":
			s = tsunamiService.processAlerts("India");
			break;
		case "japan":
			s = tsunamiService.processAlerts("Japan");
			break;
		case "indonesia":
			s = tsunamiService.processAlerts("Indonesia");
			break;
		case "display-alerts":
			s = tsunamiService.getAlerts();
		default:
			s = tsunamiService.getAlerts();
		}

		PrintWriter o = response.getWriter();
		
		o.println("<head><title>World tsunami alerts</title></head><body><h2>Active Tsunami Alerts:</h2>");
		for (int i = 0; i < s.length; i++) {
			o.print("<html><body>" 
					+ "<div>"
					+ s[i] 
					+ "</div>" 
					+ "</html></body>");
		}
	}

}
