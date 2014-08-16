package mz.co.lunguissa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.apache.log4j.Logger;

import mz.co.lunguissa.entity.*;

public class DoenteDAO
{
	 
	 private static Logger log = Logger.getLogger(DoenteDAO.class);
	public void saveDoente (Doente d)
	{
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn.prepareStatement("INSERT INTO [HCM-LUNGUISSA].[dbo].[DOENTE]"
					+ "([NUM_PROCESSO],[NOME],[APELIDO],[DATA_NASC],[SEXO]) values (?, ?, ?, ?, ?)");
			 preparedStatement.setLong(1, d.getNumProcesso());
		      preparedStatement.setString(2,d.getNome());
		      preparedStatement.setString(3, d.getApelido());
		      preparedStatement.setDate(4, (Date) d.getDataNascimento());
		      preparedStatement.setString(5, d.getSexo());
		      preparedStatement.executeUpdate();
		      
		      ResultSet rs = preparedStatement.executeQuery();
		      
		      rs.close();
		      preparedStatement.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			log.info(se);
		} catch (Exception e) {
			// Handle errors for Class.forName
			log.info(e);
		} finally {
			// finally block used to close resources
			try {
				if (preparedStatement != null)
					preparedStatement.close();
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
	public void saveDetalhesDoente (DetalhesDoente dd){
		Connection conn = DBConnection.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn.prepareStatement("INSERT INTO [HCM-LUNGUISSA].[dbo].[DETALHES_DOENTE]"
					+ "([NUM_PROCESSO] ,[ENT_N_ENTIDADE] ,[SERV_N_SERVICO] ,"
					+ "[N_SENHA] ,[DATA] ,[HORA] ,[MORADA],[CIDADE],[NOME_ACOMP] ,[RELACAO_ACOMP]"
					+ ",[TEL_ACOMP],[ISENCAO_PAGAMENTO] ,[PROVENIENCIA],[ALTA_BOOLEAN])"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			 preparedStatement.setLong(1, dd.getNumProcesso());
			 preparedStatement.setString(2, dd.getServ_n_servico());
		      preparedStatement.setInt(3,dd.getEnt_n_entidade());
		      preparedStatement.setInt(4, dd.getN_senha());
		      preparedStatement.setDate(5, (Date) dd.getData());
		      preparedStatement.setDate(6, (Date) dd.getHora());
		      preparedStatement.setString(7, dd.getMorada());
		      preparedStatement.setInt(8, dd.getCidade());
		      preparedStatement.setString(9, dd.getNomeAcompanhante());
		      preparedStatement.setString(10, dd.getRelacaoAcompanhante());
		      preparedStatement.setString(11, dd.getTelefAcompanhante());
		      preparedStatement.setInt(12, dd.getInsencaoPagamento());
		      preparedStatement.setInt(13, dd.getProvenienvia());
		      if(dd.isAltaBoolean()==true){
		    	  preparedStatement.setInt(14, 1); 
		      }else
		      {
		    	  preparedStatement.setInt(14, 0); 
		      }
		    
		      preparedStatement.executeUpdate();
		      
		      preparedStatement.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			log.info(se);
		} catch (Exception e) {
			// Handle errors for Class.forName
			log.info(e);
		} finally {
			// finally block used to close resources
			try {
				if (preparedStatement != null)
					preparedStatement.close();
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
	public Doente getDoente (long numProcesso){
		Connection conn = DBConnection.getConnection();
		PreparedStatement stmt = null;
		try {
			
			
			String sql;
			sql = "SELECT * FROM DOENTE where NUMPROCESSO = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setLong(1, numProcesso);
			ResultSet rs = stmt.executeQuery();
			
			Doente doente = null;

			// STEP 5: Extract data from result set
			while (rs.next()) {
				doente = new Doente();
				
				doente.setNumProcesso(rs.getLong("NUM_PROCESSO"));
				doente.setNome(rs.getString("NOME"));
				doente.setApelido(rs.getString("APELIDO"));
				doente.setDataNascimento(rs.getDate("DATA_NASC"));
				doente.setSexo(rs.getString("SEXO"));
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
			return doente;
		} catch (SQLException se) {
			// Handle errors for JDBC
			log.info(se);
		} catch (Exception e) {
			// Handle errors for Class.forName
			log.info(e);
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
	public DetalhesDoente getLastDetalhesDoente (int numProcesso){
		Connection conn = DBConnection.getConnection();
		PreparedStatement stmt = null;
		try {
			
			
			String sql;
			sql = "SELECT * FROM DETALHES_DOENTE where NUMPROCESSO = ? and  data <=@data"
					+ "ORDER BY data DESC limit 1";
			stmt = conn.prepareStatement(sql);
			stmt.setLong(1, numProcesso);
			ResultSet rs = stmt.executeQuery();
			
			DetalhesDoente dd = null;

			// STEP 5: Extract data from result set
			while (rs.next()) {
				dd = new DetalhesDoente();
				
				
				dd.setNumProcesso(rs.getLong("NUM_PROCESSO"));
				dd.setEnt_n_entidade(rs.getInt("ENT_N_ENTIDADE"));
				dd.setServ_n_servico(rs.getString("SERV_N_SERVICO"));
				dd.setN_senha(rs.getInt("N_SENHA"));
				dd.setData(rs.getDate("DATA"));
				dd.setHora(rs.getDate("HORA"));
				dd.setMorada(rs.getString("MORADA"));
				dd.setCidade(rs.getInt("CIDADE"));
				dd.setNomeAcompanhante(rs.getString("NOME_ACOMP"));
				dd.setRelacaoAcompanhante(rs.getString("RELACAO_ACOMP"));
				dd.setTelefAcompanhante(rs.getString("TEL_ACOMP"));
				dd.setInsencaoPagamento(rs.getInt("ISENCAO_PAGAMENTO"));
				dd.setProvenienvia(rs.getInt("PROVENIENCIA"));
				 if(rs.getInt("ALTA_BOOLEAN")==1){
					 
			    	  dd.setAltaBoolean(true); 
			      }else
			      {
			    	  dd.setAltaBoolean(false); 
			      }
				
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
			return dd;
		} catch (SQLException se) {
			// Handle errors for JDBC
			log.info(se);
		} catch (Exception e) {
			// Handle errors for Class.forName
			log.info(e);
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
	
	public DetalhesDoente getDetalhesDoente (int numProcesso){
		Connection conn = DBConnection.getConnection();
		PreparedStatement stmt = null;
		try {
			
			
			String sql;
			sql = "SELECT * FROM DETALHES_DOENTE where NUMPROCESSO = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setLong(1, numProcesso);
			ResultSet rs = stmt.executeQuery();
			
			DetalhesDoente dd = null;

			// STEP 5: Extract data from result set
			while (rs.next()) {
				dd = new DetalhesDoente();
				
				
				dd.setNumProcesso(rs.getLong("NUM_PROCESSO"));
				dd.setEnt_n_entidade(rs.getInt("ENT_N_ENTIDADE"));
				dd.setServ_n_servico(rs.getString("SERV_N_SERVICO"));
				dd.setN_senha(rs.getInt("N_SENHA"));
				dd.setData(rs.getDate("DATA"));
				dd.setHora(rs.getDate("HORA"));
				dd.setMorada(rs.getString("MORADA"));
				dd.setCidade(rs.getInt("CIDADE"));
				dd.setNomeAcompanhante(rs.getString("NOME_ACOMP"));
				dd.setRelacaoAcompanhante(rs.getString("RELACAO_ACOMP"));
				dd.setTelefAcompanhante(rs.getString("TEL_ACOMP"));
				dd.setInsencaoPagamento(rs.getInt("ISENCAO_PAGAMENTO"));
				dd.setProvenienvia(rs.getInt("PROVENIENCIA"));
				 if(rs.getInt("ALTA_BOOLEAN")==1){
					 
			    	  dd.setAltaBoolean(true); 
			      }else
			      {
			    	  dd.setAltaBoolean(false); 
			      }
				
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
			return dd;
		} catch (SQLException se) {
			// Handle errors for JDBC
			log.info(se);
		} catch (Exception e) {
			// Handle errors for Class.forName
			log.info(e);
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

}
