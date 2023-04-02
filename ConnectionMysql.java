package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {
	public Connection cn=null;
	public static Connection ConnexionDB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet_java","root","");
			System.out.println("cnx rressite");
			return cn;
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("connexion echouee");
			e.printStackTrace();
			return null;
			
		}
	}
	
	

}
