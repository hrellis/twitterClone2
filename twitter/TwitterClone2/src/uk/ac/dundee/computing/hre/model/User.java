package uk.ac.dundee.computing.hre.model;

public class User
{
	public String userName;
	public String fullName;
	public String email;
	public String password;
	public String bio;
	public String location;
	
	public User()
	{
		
	}
	
	public User(String userName, String fullName, String email, String password, String bio, String location)
	{
		this.userName = userName;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.bio = bio;
		this.location = location;
	}
}
