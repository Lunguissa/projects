package mz.co.lunguissa.Testes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.swing.JOptionPane;

import mz.co.lunguissa.Interfaces.RegDoente;
import mz.co.lunguissa.Interfaces.RegMedicamentos;
import mz.co.lunguissa.dao.SenhaDao;
import mz.co.lunguissa.entity.Senha;

public class Teste {

	public static void main(String[] args) {
		Properties prop = loadProperties();
		SenhaDao senhaDao = new SenhaDao(prop);
		Senha ent,sai;
		RegDoente rd = null;
		RegMedicamentos rm = null;
		
		while(true)
		{
			ent = senhaDao.readEntSenha();
			if(ent!=null)
			{
				rd = new RegDoente();
				rd.setVisible(true);
				senhaDao.updateEntSenha();
			}
			
			sai = senhaDao.readSaiSenha();
			if(sai!=null)
			{
				rm = new RegMedicamentos();
				rm.setVisible(true);
				senhaDao.updateSaiSenha();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static Properties loadProperties() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("C://HCM-LUNGUISSA/config.properties");

			// load a properties file
			prop.load(input);
			return prop;
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop;
	}

	public static void mainn(String[] args) {
		try {
			// Load the SQLServerDriver class, build the
			// connection string, and get a connection
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl = "jdbc:sqlserver://SARAIVA01;"
					+ "database=HCM_LUNGUISSA;" + "user=lunguissa;" + "password=54321";
			Connection con = DriverManager.getConnection(connectionUrl);
			System.out.println("Connected.");

			/*
			 * // Create and execute an SQL statement that returns some data.
			 * String SQL = "SELECT CustomerID, ContactName FROM Customers";
			 * Statement stmt = con.createStatement(); ResultSet rs =
			 * stmt.executeQuery(SQL);
			 * 
			 * // Iterate through the data in the result set and display it.
			 * while (rs.next()) { System.out.println(rs.getString(1) + " " +
			 * rs.getString(2)); }
			 */

		} catch (Exception e) {
			System.out.println(e.getMessage());
			// System.exit(0);
		}
	}
}
