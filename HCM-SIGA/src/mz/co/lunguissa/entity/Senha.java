package mz.co.lunguissa.entity;

import java.util.Date;

public class Senha {
	private int id;
	private String serv_n_servico;
	private int n_senha;
	private Date data_hora_senha;
	private int verificado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServ_n_servico() {
		return serv_n_servico;
	}
	public void setServ_n_servico(String serv_n_servico) {
		this.serv_n_servico = serv_n_servico;
	}
	public int getN_senha() {
		return n_senha;
	}
	public void setN_senha(int n_senha) {
		this.n_senha = n_senha;
	}
	public Date getData_hora_senha() {
		return data_hora_senha;
	}
	public void setData_hora_senha(Date data_hora_senha) {
		this.data_hora_senha = data_hora_senha;
	}
	public int isVerificado() {
		return verificado;
	}
	public void setVerificado(int verificado) {
		this.verificado = verificado;
	}
	@Override
	public String toString() {
		return "Senha [id=" + id + ", serv_n_servico=" + serv_n_servico
				+ ", n_senha=" + n_senha + ", data_hora_senha="
				+ data_hora_senha + ", verificado=" + verificado + "]";
	}
	
}
