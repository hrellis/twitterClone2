package uk.ac.dundee.computing.hre.model;

//source: http://www.vogella.com/articles/MySQLJava/article.html

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLAccess 
{
  private Connection connection = null;
  private Statement statement = null;
  private ResultSet resultSet = null;

  public MySQLAccess()
  {
	  try
	  {
		Class.forName("com.mysql.jdbc.Driver");
		// Setup the connection with the DB
	      connection = DriverManager
	          .getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk:3306/heatherellis","HeatherEllis","ac31004");
	      
	  }
	  catch (Exception e)
	  {
		  System.out.println("Connection failed.");
	  }
  }
  
  public ResultSet runQuery(String query)
  {  
	  try
	  {
	      statement = connection.createStatement();
	      resultSet = statement.executeQuery(query);
	      close();
	      return resultSet;
	  }
	  catch (Exception e)
	  {
		  System.out.println("runQuery failed.");
		  close();
		  return null;
	  }
  }
  

  // close the resultSet
  private void close() {
    try {
      if (resultSet != null) {
        resultSet.close();
      }

      if (statement != null) {
        statement.close();
      }

      if (connection != null) {
        connection.close();
      }
    } catch (Exception e) {

    }
  }

} 