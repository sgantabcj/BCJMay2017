package com.crmindz.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crmindz.connection.DbUtil;
import com.crmindz.model.CreditCard;
import com.crmindz.model.Customer;

public class ReservationDao {
	//returns CreditCard class object with retrieved values from bank
	public CreditCard getBankCreditCardByNumber(String creditCardNumber) {
		System.out.println("begining of methodgetBank credit card by number");
		CreditCard bankCreditCard = new CreditCard();
		String sql = "select * from bankcreditcard where BccNum=?";

		try {
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, creditCardNumber);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				bankCreditCard.setNameOnCard(rs.getString("BccName"));
				bankCreditCard.setCardNumber(rs.getString("BccNum"));
				bankCreditCard.setCardExp(rs.getString("BccExp"));
				bankCreditCard.setCvv(rs.getInt("CVV"));
				bankCreditCard.setCardBalance(rs.getDouble("Balance"));
				System.out.printf("name: %s\ncard no: %s\nexp: %s\ncvv: %d\nbalance: %.2f\n"
									,bankCreditCard.getNameOnCard(),bankCreditCard.getCardNumber()
									,bankCreditCard.getCardExp(),bankCreditCard.getCvv(),bankCreditCard.getCardBalance());	
			}else{
				return null;
			}
			connection.close();
			return bankCreditCard;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql exception in getbankcreditcardby number method");
		}
		System.out.println("returning credit card obj succesfully");
		return null;
	}
	
	public int getLastAccountNumber(){
		String sql ="select AccNum from account";
		
		try{
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				rs.last();
				return rs.getInt("AccNum");
			}
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return -1;
	}
	//saves details in a table by name
	public void saveCustomer(Customer c){
		System.out.println("begining of save customer method");
		String sql = "insert into customer(FirstName,LastName,Email,Phone) values(?,?,?,?)";

		try {
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, c.getFirstName());
			ps.setString(2, c.getLastName());
			ps.setString(3, c.getEmail());
			ps.setString(4, c.getPhone());
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql exception in save customer method");
		}
		System.out.println("executed save customer succesfully");
	}
	//saves details in a table by name
	public void saveTransaction(Customer c){
		System.out.println("begining of save transaction");
		String sql = "insert into transaction(TranDate,TranTime,CusId,AccId) values(?,?,?,?)";
		String fetchCusIdsql = "select CusID from customer where customer.FirstName = \""+c.getFirstName()+"\"";
		String fetchAccIdsql = "select AccID from account as a inner join customer as c on c.CusID=a.CusId where c.FirstName= \""+c.getFirstName()+"\"";
		
		java.util.Date dt = new java.util.Date();
		java.sql.Time currentTime = new java.sql.Time(dt.getTime());
		
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
		
		try {
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setDate(1, date);
			ps.setTime(2, currentTime);
			
			PreparedStatement ps1 = connection.prepareStatement(fetchCusIdsql);
			ResultSet CusId = ps1.executeQuery();
			if(CusId.next()){
				ps.setInt(3, CusId.getInt(1));
			}		
			
			PreparedStatement ps2 = connection.prepareStatement(fetchAccIdsql);
			ResultSet AccId = ps2.executeQuery();
			if(AccId.next()){
				ps.setInt(4, AccId.getInt(1));
			}			
			
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql exception in save transaction method");
		}
		System.out.println("ending of save transaction");
	}
	//saves details in a table by name
	public void saveAddress(Customer c){
		System.out.println("begining of address");
		String sql = "insert into address(CusId,Street,Apt,City,State,Zip) values(?,?,?,?,?,?)";
		String fetchCusIdsql = "select CusID from customer where customer.FirstName = \""+c.getFirstName()+"\"";
		try {
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			
			PreparedStatement ps1 = connection.prepareStatement(fetchCusIdsql);
			ResultSet CusId = ps1.executeQuery();
			if(CusId.next()){
				ps.setInt(1, CusId.getInt(1));
			}
		
			ps.setString(2, c.getAdd().getStreet());
			ps.setString(3, c.getAdd().getApt());
			ps.setString(4, c.getAdd().getCity());
			ps.setString(5, c.getAdd().getState());
			ps.setString(6, c.getAdd().getZip());
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql exception in save address method");
		}
		System.out.println("ending of address");
	}
	//saves details in a table by name
	public void saveLogin(Customer c){
		System.out.println("begining of login");
		String sql = "insert into login(UserID,Password,CusId) values(?,?,?)";
		String fetchCusIdsql = "select CusID from customer where customer.FirstName = \""+c.getFirstName()+"\"";
//		String fetchAccIdsql = "select AccID from account as a inner join customer as c on c.CusID=a.CusId where c.FirstName= \""+c.getFirstName()+"\"";
		
		try {
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, c.getUd().getUserId());
			ps.setString(2, c.getUd().getPassword());
			
			PreparedStatement ps1 = connection.prepareStatement(fetchCusIdsql);
			ResultSet CusId = ps1.executeQuery();
			if(CusId.next()){
				ps.setInt(3, CusId.getInt(1));
			}
		
			
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql exception in save login method");
		}
		System.out.println("ending of login");
	}
	//saves details in a table by name
	public void saveCreditCard(Customer c){
		System.out.println("begining of credit card");
		String sql = "insert into creditcard(CcName, CcNum, CcExp, CVV, AccId) values(?,?,?,?,?)";
		String fetchAccIdsql = "select AccID from account as a inner join customer as c on c.CusID=a.CusId where c.FirstName= \""+c.getFirstName()+"\"";
		try {
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, c.getCc().getNameOnCard());
			ps.setString(2, c.getCc().getCardNumber());
			ps.setString(3, c.getCc().getCardExp());
			ps.setInt(4, c.getCc().getCvv());
			
			PreparedStatement ps1 = connection.prepareStatement(fetchAccIdsql);	
			ResultSet AccId = ps1.executeQuery();
			if(AccId.next()){
				ps.setInt(5, AccId.getInt(1));				
			}
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql exception in save credit card method");
		}
		System.out.println("ending of credit card");
	}
	//saves account details and number
	public void saveAccount(Customer c, int accountNumber){
		System.out.println("begining of account");
		String sql = "insert into account(AccNum,CusId) values(?,?)";
		String fetchCusIdsql = "select CusID from customer where customer.FirstName = \""+c.getFirstName()+"\"";
		
		try {
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, accountNumber);
			
			PreparedStatement ps1 = connection.prepareStatement(fetchCusIdsql);
			ResultSet CusId = ps1.executeQuery();
			if(CusId.next()){
				ps.setInt(2, CusId.getInt(1));
			}
		
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql exception in save account method");
		}
		System.out.println("ending of account");
	}
	//saves ticket details and number
	public void saveTicket(Customer c, int ticketNumber){
		System.out.println("begining of ticket");
		String sql = "insert into ticket(TicNum, Origin, Destination, DepartDate, Fare, AccId ) values(?,?,?,?,?,?)";
		String fetchAccIdsql = "select AccID from account as a inner join customer as c on c.CusID=a.CusId where c.FirstName= \""+c.getFirstName()+"\"";

		try {
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, ticketNumber);
			ps.setString(2, c.getFt().getOrigin());
			ps.setString(3, c.getFt().getDestination());
			ps.setString(4, c.getFt().getDepartDate());
			ps.setDouble(5, c.getFt().getFare());
		
			PreparedStatement ps2 = connection.prepareStatement(fetchAccIdsql);
			ResultSet AccId = ps2.executeQuery();
			if(AccId.next()){
				ps.setInt(6, AccId.getInt(1));
			}			
			
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql exception in save ticket method");
		}
		System.out.println("ending of ticket");
	}
}
