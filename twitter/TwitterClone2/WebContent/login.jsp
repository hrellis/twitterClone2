<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%-- <%
	if(request.getParameter("username") != null && request.getParameter("password") != null)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("username");
		
		

	}
%> --%>

<jsp:include page="templateTop.jsp" />
			<h1>Login</h1>
			<div id="login">
				<form method="post" action="login.jsp">
					<input type="text" required="required" placeholder="Username" name="username" /><br />
					<input type="password" required="required" placeholder="Password" name="password" /><br />
					<input type="submit" value="Login" />
				</form>
			</div>
			
<jsp:include page="templateBottom.jsp" />