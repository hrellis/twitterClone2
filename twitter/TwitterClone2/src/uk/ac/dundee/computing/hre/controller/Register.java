package uk.ac.dundee.computing.hre.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection connect = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
       
	static String userName;
	static String password;
	static String fullName;
	static String location;
	static String bio;
	static String email;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				PrintWriter out = response.getWriter();
				userName = request.getParameter("username");
				fullName = request.getParameter("fullname");
				email = request.getParameter("email");
				password = request.getParameter("password");
				location = request.getParameter("location");
				bio = request.getParameter("bio");
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connect = DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk:3306/heatherellis","HeatherEllis","ac31004");
					
					preparedStatement = connect.prepareStatement("INSERT into heatherellis.users values (?, ?, ?, ?, ?, ?)");
					preparedStatement.setString(1, userName);
					preparedStatement.setString(2, fullName);
					preparedStatement.setString(3, email);
					preparedStatement.setString(4, password);
					preparedStatement.setString(5, location);
					preparedStatement.setString(6, bio);
					preparedStatement.executeUpdate();	
					out.println("Welcome to Chatterbox, you have successfully registered!");
				}catch (ClassNotFoundException e) {
					throw new ServletException("Error connecting to the database.", e);
				}  catch (SQLException e) {
					throw new ServletException("User not registered.", e);
				} finally {
					try {
						if (resultSet != null) {
							resultSet.close();
						}
						if (statement != null) {
							statement.close();
						}
						if (connect !=null) {
							connect.close();
						}
					} catch (SQLException e) {}
				}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
