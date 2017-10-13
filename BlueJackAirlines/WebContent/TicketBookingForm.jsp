<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<title>Blue Jack Airlines</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
	body{
		background-color:#ccc;
	}
	fieldset{
		background-color:#eee;
	}
	td{
		width:250px;
	}
</style>
</head>
<body>
	<header>
		<h1>Flight Ticket Booking</h1>
	</header>
	<form id="flight-ticket-purchase" method="post"
		action="ReservationController">
		<fieldset id="customer-details">
			<legend>Customer Details</legend>
			<table>
				<tr>
					<td>First Name</td>
					<td>: <input type="text" id="fname" name="fname"
						placeholder="first name"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td>: <input type="text" id="lname" name="lname"
						placeholder="last name"></td>
				</tr>
				<tr>
					<td>E-mail</td>
					<td>: <input type="email" id="email" name="email"
						placeholder="email"></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td>: <input type="tel" id="phone" name="phone"
						placeholder="phone number"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset id="address-details">
			<legend>Address Details</legend>
			<table>
				<tr>
					<td>Address line 1</td>
					<td>: <input type="text" id="addres-line-1" name="addres-ln-1"
						placeholder="street address"></td>
				</tr>
				<tr>
					<td>Address line 2</td>
					<td>: <input type="text" id="address-line-2"
						name="addres-ln-2" placeholder="apt/unit"></td>
				</tr>
				<tr>
					<td>City</td>
					<td>: <input type="text" id="city" name="city"
						placeholder="city"></td>
				</tr>
				<tr>
					<td>State</td>
					<td>: <select name="state">
							<option value="AL">Alabama</option>
							<option value="AK">Alaska</option>
							<option value="AZ">Arizona</option>
							<option value="AR">Arkansas</option>
							<option value="CA">California</option>
							<option value="CO">Colorado</option>
							<option value="CT">Connecticut</option>
							<option value="DE">Delaware</option>
							<option value="DC">District Of Columbia</option>
							<option value="FL">Florida</option>
							<option value="GA">Georgia</option>
							<option value="HI">Hawaii</option>
							<option value="ID">Idaho</option>
							<option value="IL">Illinois</option>
							<option value="IN">Indiana</option>
							<option value="IA">Iowa</option>
							<option value="KS">Kansas</option>
							<option value="KY">Kentucky</option>
							<option value="LA">Louisiana</option>
							<option value="ME">Maine</option>
							<option value="MD">Maryland</option>
							<option value="MA">Massachusetts</option>
							<option value="MI">Michigan</option>
							<option value="MN">Minnesota</option>
							<option value="MS">Mississippi</option>
							<option value="MO">Missouri</option>
							<option value="MT">Montana</option>
							<option value="NE">Nebraska</option>
							<option value="NV">Nevada</option>
							<option value="NH">New Hampshire</option>
							<option value="NJ">New Jersey</option>
							<option value="NM">New Mexico</option>
							<option value="NY">New York</option>
							<option value="NC">North Carolina</option>
							<option value="ND">North Dakota</option>
							<option value="OH">Ohio</option>
							<option value="OK">Oklahoma</option>
							<option value="OR">Oregon</option>
							<option value="PA">Pennsylvania</option>
							<option value="RI">Rhode Island</option>
							<option value="SC">South Carolina</option>
							<option value="SD">South Dakota</option>
							<option value="TN">Tennessee</option>
							<option value="TX">Texas</option>
							<option value="UT">Utah</option>
							<option value="VT">Vermont</option>
							<option value="VA">Virginia</option>
							<option value="WA">Washington</option>
							<option value="WV">West Virginia</option>
							<option value="WI">Wisconsin</option>
							<option value="WY">Wyoming</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>Zip</td>
					<td>: <input type="number" id="zip" name="zip"
						placeholder="zip"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset id="user-details">
			<legend>User Details</legend>
			<table>
				<tr>
					<td>User Id</td>
					<td>: <input type="text" id="user-id" name="user-id"
						placeholder="user name"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>: <input type="password" id="pwd" name="pwd"
						placeholder="password"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset id="Payment-details">
			<legend>Payment Details</legend>
			<table>
				<tr>
					<td>Name on the card</td>
					<td>: <input type="text" id="card-name" name="name-on-card"
						placeholder="name"></td>
				</tr>
				<tr>
					<td>Card Number</td>
					<td>: <input type="number" id="card-number" name="card-number"
						placeholder="card number"></td>
				</tr>
				<tr>
					<td>Expiration date</td>
					<td>: <input type="text" id="card-exp" name="card-exp"
						placeholder="MM/YY"></td>
				</tr>
				<tr>
					<td>CVV</td>
					<td>: <input type="number" id="cvv" name="cvv"
						placeholder="CVV"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="checkbox" name="save-chx"
						value="save-card" id="save-card"> save card details?</td>
				</tr>
			</table>
		</fieldset>
		<fieldset id="flight-ticket-details">
			<legend>Flight ticket Details</legend>
			<table>
				<tr>
					<td>Origin</td>
					<td>: <input type="text" name="origin" id="origin"></td>
				</tr>
				<tr>
					<td>Destination</td>
					<td>: <input type="text" name="destination" id="destination"></td>
				</tr>
				<tr>
					<td>Depart date</td>
					<td>: <input type="date" name="depart-date" id="depart-date"></td>
				</tr>
				<tr>
					<td>Depart Time</td>
					<td>: <input type="text" name="depart-time" id="depart-time"></td>
				</tr>
				<tr>
					<td>Fare</td>
					<td>: <select id="fare" name="fare">
							<option value="400">$400</option>
							<option value="600">$600</option>
							<option value="800">$800</option>
							<option value="1000">$1000</option>
					</select>
					</td>
				</tr>
			</table>
		</fieldset>
		<br /> <input type="submit" value="Process Payment">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
			type="reset" value="reset">
	</form>
</body>

</html>