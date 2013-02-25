<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <script>  
   import uk.ac.dundee.computing.hre.model.*;
   import uk.ac.dundee.computing.hre.controller.*;
 </script> 
    
<jsp:include page="templateTop.jsp" />
		
			<div id="tweets">
				<h1>Tweets</h1>
				
			 	<script>
			 		ResultsSet resultSet = getAllTweets();
			 		writeResultSet(resultSet);
			 	</script>
			 	
			 	
			</div>
			
			<div id="profile">
				<p>Profile</p>
			</div>
			
<jsp:include page="templateBottom.jsp" />