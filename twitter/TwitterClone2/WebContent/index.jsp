<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:include page="templateTop.jsp" />

<% 
	//Check for POST parameters username and password
	String userName = request.getParameter("Username"); 
	String password = request.getParameter("Password");
			
	//if found, try to login
	if(request.getParameter("name") != null && request.getParameter("address") != null)
	{
		//pass to database for verification
	} 

	//if logged in, redirect to wherever.
	//else show error message of some kind (username/password combination invalid etc)
	 %>	
		
			<div id="tweets">
				<h1>Tweets</h1>
			</div>
			
			<div id="profile">
				<p>Profile</p>
			</div>
			
<jsp:include page="templateBottom.jsp" />