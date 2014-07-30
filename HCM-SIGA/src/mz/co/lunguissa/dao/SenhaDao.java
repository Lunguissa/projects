package mz.co.lunguissa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import mz.co.lunguissa.entity.Senha;

public class SenhaDao {

	private String server;
	private String database1;
	private String database2;
	private String user;
	private String password;

	public SenhaDao(Properties prop) {
		server = prop.getProperty("server");
		database1 = prop.getProperty("database1");
		database2 = prop.getProperty("database2");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	}

	private Connection getSGFEConnection() {
		return getConnection(database1);
	}

	private Connection getHCMConnection() {
		return getConnection(database2);
	}

	private Connection getConnection(String database) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl = "jdbc:sqlserver://" + server + ";"
					+ "database=" + database + ";" + "user=" + user + ";"
					+ "password=" + password;
			Connection con = DriverManager.getConnection(connectionUrl);
			return con;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public Senha readEntSenha() {
		return readSenha("SENHA_ENT");
	}

	public Senha readSaiSenha() {
		return readSenha("SENHA_MED");
	}
	
	public void updateEntSenha() {
		updateSenha("SENHA_ENT");
	}

	public void updateSaiSenha() {
		updateSenha("SENHA_MED");
	}

	private Senha readSenha(String table) {
		Connection conn = getHCMConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM " + table + " where VERIFICADO = 0";
			ResultSet rs = stmt.executeQuery(sql);
			Senha senha = null;

			// STEP 5: Extract data from result set
			while (rs.next()) {
				senha = new Senha();
				
				senha.setId(rs.getInt("ID"));
				senha.setN_senha(rs.getInt("N_SENHA"));
				senha.setServ_n_servico(rs.getString("SERV_N_SERVICO"));
				senha.setVerificado(rs.getInt("VERIFICADO"));
				senha.setData_hora_senha(rs.getDate("DATA_HORA_SENHA"));
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
			return senha;
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		return null;
	}

	private void updateSenha(String table) {
		Connection conn = getHCMConnection();
		;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "UPDATE " + table + " SET VERIFICADO=1";
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
	}
}
