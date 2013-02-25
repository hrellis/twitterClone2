<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:include page="templateTop.jsp" />
			
			<h1>Register</h1>
			<div id="register">
			<form action="Register.jsp">
				<input type="text" required="required" placeholder="Username" name="username" /><br />
				<input type="text" required="required" placeholder="Full Name" name="fullname" /><br />
				<input type="password" required="required" placeholder="Password" name="password" /><br />
				<input type="password" required="required" placeholder="Confirm Password" name="password" /><br />
				<input type="text" required="required" placeholder="Hometown" name="location" /><br />
				<input type="text" required="required" placeholder="Write a bit about yourself (max 140 characters)..." name="bio" /><br />
				<input type="submit" value="Register" />
			</form>
			</div>
			
<jsp:include page="templateBottom.jsp" />