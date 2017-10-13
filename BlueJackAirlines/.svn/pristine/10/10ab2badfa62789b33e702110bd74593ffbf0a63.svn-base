package com.crmindz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.model.Address;
import com.crmindz.model.CreditCard;
import com.crmindz.model.Customer;
import com.crmindz.model.FlightTicket;
import com.crmindz.model.UserDetails;
import com.crmindz.service.ReservationService;


@WebServlet("/ReservationController")
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationController() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmail(email);
		customer.setPhone(phone);
		
		System.out.println("fn: "+customer.getFirstName()+" ln: "+customer.getLastName()+" mail: "+customer.getEmail()+" phone: "+customer.getPhone());
		
		Address add = new  Address();
		
		String street = request.getParameter("addres-ln-1");
		String apt = request.getParameter("addres-ln-2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		
		add.setStreet(street);
		add.setApt(apt);
		add.setCity(city);
		add.setState(state);
		add.setZip(zip);
		
		System.out.println("street: "+add.getStreet()+" apt: "+add.getApt()+" c: "+add.getCity()+" st: "+add.getState()+" zip"+add.getZip());
		
		UserDetails ud = new UserDetails();
		
		String userId = request.getParameter("user-id");
		String password = request.getParameter("pwd");
		
		
		ud.setUserId(userId);
		ud.setPassword(password);
		
		System.out.println("uid: "+ud.getUserId()+" pwd: "+ud.getPassword());
		
		CreditCard cc = new CreditCard();
		
		String nameOnCard = request.getParameter("name-on-card");
		String cardNumber = request.getParameter("card-number");
		String cardExp = request.getParameter("card-exp");
		String saveChkBx = request.getParameter("save-chx");
		int cvv = Integer.parseInt(request.getParameter("cvv"));
		
		cc.setNameOnCard(nameOnCard);
		cc.setCardNumber(cardNumber);
		cc.setCardExp(cardExp);
		cc.setSaveChkBx(saveChkBx);
		cc.setCvv(cvv);
		
		System.out.println("name: "+cc.getNameOnCard()+" card number: "+cc.getCardNumber()+"exp: "+cc.getCardExp()+"save: "+cc.getSaveChkBx()+" cvv: "+cc.getCvv());
		
		FlightTicket ft = new FlightTicket();
		
		String origin = request.getParameter("origin");
		String destination = request.getParameter("destination");
		String departDate = request.getParameter("depart-date");
		double fare = Double.parseDouble(request.getParameter("fare"));
		
		ft.setOrigin(origin);
		ft.setDestination(destination);
		ft.setDepartDate(departDate);
		ft.setFare(fare);
		
		System.out.println("origin: "+ft.getOrigin()+" dest: "+ft.getDestination()+" date: "+ft.getDepartDate());
		
		customer.setAdd(add);
		customer.setCc(cc);
		customer.setFt(ft);
		customer.setUd(ud);
		
		ReservationService rs = new ReservationService();
		String[] s = rs.verifyBalance(customer);
		
		
		if(s!=null){
			request.setAttribute("s", s);
			request.getRequestDispatcher("/Success.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/Failure.jsp").forward(request, response);
		}
	}

}
