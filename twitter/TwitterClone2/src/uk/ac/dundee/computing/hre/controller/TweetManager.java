package uk.ac.dundee.computing.hre.controller;

import uk.ac.dundee.computing.hre.model.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class TweetManager {
	
	public Tweet getTweetFromUser(String username)
	{
		MySQLAccess dbConnection = new MySQLAccess();
		
		String query = "SELECT * FROM heatherellis.Tweets WHERE userName='" + username + "';";
		
		ResultSet result = dbConnection.runQuery(query);
		
		try
		{
			//if there are any results in the result list, get them
			if(result.first())
			{
				Tweet tweet = new Tweet();
				
				tweet.idTweets = result.getInt("idTweets");
				tweet.whenPosted = result.getDate("whenPosted");
				tweet.userName = result.getString("userName");
				
				return tweet;
			}
			else //otherwise send error message
			{
				System.out.println("Tweets from user '" + username + "' do not exist.");
				return null;
			}
		}
		catch (Exception e)
		{
			System.out.println("getTweetFromUser() failed.");
			return null;
		}
	}
	
	public Tweet getAllTweets()
	{
		MySQLAccess dbConnection = new MySQLAccess();
		
		String query = "SELECT * FROM heatherellis.Tweets";
		
		ResultSet result = dbConnection.runQuery(query);
		
		try
		{
			//if there are any results in the result list, get them
			if(result.first())
			{
				Tweet tweet = new Tweet();
				
				tweet.idTweets = result.getInt("idTweets");
				tweet.whenPosted = result.getDate("whenPosted");
				tweet.userName = result.getString("userName");
				
				return tweet;
			}
			else //otherwise send error message
			{
				System.out.println("Tweets do not exist.");
				return null;
			}
		}
		catch (Exception e)
		{
			System.out.println("getAllTweets() failed.");
			return null;
		}
	}
	
	//source: http://www.vogella.com/articles/MySQLJava/article.html
	public void writeResultSet(ResultSet resultSet) throws SQLException {
		    // ResultSet is initially before the first data set
		    while (resultSet.next()) {
		      // It is possible to get the columns via name
		      // also possible to get the columns via the column number
		      // which starts at 1
		      // e.g. resultSet.getSTring(2);
		      String username = resultSet.getString("userName");
		      String tweet = resultSet.getString("tweet");
		      System.out.println("User: " + username);
		      System.out.println("Website: " + tweet);
		    }
		  }
}
