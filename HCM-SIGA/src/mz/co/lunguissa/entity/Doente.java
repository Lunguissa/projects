package mz.co.lunguissa.entity;

import java.util.Date;

public class Doente 
{
	private long numProcesso;
	private String nome;
	private String apelido;
	private Date dataNascimento;
	private String sexo;

	public long getNumProcesso() {
		return numProcesso;
	}
	public void setNumProcesso(long numProcesso) {
		this.numProcesso = numProcesso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
