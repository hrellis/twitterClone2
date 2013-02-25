package uk.ac.dundee.computing.hre.controller;

import uk.ac.dundee.computing.hre.model.*;
import java.sql.ResultSet;

public class UserManager
{
	public User getUser(String username)
	{
		MySQLAccess dbConnection = new MySQLAccess();
		
		String query = "SELECT * FROM heatherellis.users WHERE userName='" + username + "';";
		
		ResultSet result = dbConnection.runQuery(query);
		
		try
		{
			//if there are any results in result list, get them
			if(result.first())
			{
				User user = new User();
				
				user.bio = result.getString("bio");
				user.email = result.getString("email");
				user.fullName = result.getString("fullName");
				user.location = result.getString("location");
				user.password = result.getString("password");
				user.userName = result.getString("userName");
				
				return user;
			}
			else //otherwise print error message
			{
				System.out.println("User " + username + " does not exist.");
				return null;
			}
		}
		catch (Exception e)
		{
			System.out.println("getUser() failed.");
			return null;
		}
	}
}
