package uk.ac.dundee.computing.hre.model;

import java.sql.Date;

public class Tweet
{
	public int idTweets;
	public String userName;
	public String tweet;
	public Date whenPosted;
	
	public Tweet()
	{
		
	}
	
	public Tweet(int idTweets, String userName, String tweet, Date whenPosted)
	{
		this.idTweets = idTweets;
		this.userName = userName;
		this.tweet = tweet;
		this.whenPosted = whenPosted;
	}
}
