package mz.co.lunguissa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	
	public static Connection getConnection() throws ExcRepositorio {
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://192.168.137.143:1433;"+"databaseName=HCM-LUNGUISSA";
		String login = "sa";
		String senha = "root123";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, login, senha);
			System.out.println("Done");
			return con;
		} catch (ClassNotFoundException e) {
			throw new ExcRepositorio("Driver não encontrado: " + e.getMessage());
		} catch (SQLException e) {
			throw new ExcRepositorio("Erro abrindo conexão: " + e.getMessage());
		}
		
	}
	
	
	public static void main(String[] args) {
		getConnection();
	}
	
}
