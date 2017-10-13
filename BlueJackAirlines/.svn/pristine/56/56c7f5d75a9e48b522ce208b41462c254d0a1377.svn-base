package com.crmindz.service;

import com.crmindz.dao.ReservationDao;
import com.crmindz.model.CreditCard;
import com.crmindz.model.Customer;

public class ReservationService {
	public String[] verifyBalance(Customer customer){
		ReservationDao reservationDao = new ReservationDao();
		CreditCard bankCreditCard = reservationDao.getBankCreditCardByNumber(customer.getCc().getCardNumber());
		
		System.out.println("inside service before comparision");
		if(bankCreditCard!=null){
			System.out.println("after first comparision");
			if(bankCreditCard.getCardBalance()>=customer.getFt().getFare() && bankCreditCard.getCvv()==customer.getCc().getCvv()){
				System.out.println("inside service after comparision");
				reservationDao.saveCustomer(customer);
				int accountNumber = 0;
				int lastAccountNumber = reservationDao.getLastAccountNumber();
				if(lastAccountNumber!=-1){				
					accountNumber = lastAccountNumber+1;
				}
				
				reservationDao.saveAddress(customer);
				reservationDao.saveLogin(customer);
				
				reservationDao.saveAccount(customer,accountNumber);

				int ticketNumber = (int)(Math.random()*20000)+10000;
				reservationDao.saveTicket(customer,ticketNumber);
				reservationDao.saveTransaction(customer);
				
				if(customer.getCc().getSaveChkBx()!=null){
					reservationDao.saveCreditCard(customer);					
				}
				
				String[] s= {Integer.toString(accountNumber),Integer.toString(ticketNumber)};
				return s;
			}else{
				return null;
			}
		}else{
			return null;
		}

	}
}
