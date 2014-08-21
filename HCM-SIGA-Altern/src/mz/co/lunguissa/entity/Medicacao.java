package mz.co.lunguissa.entity;

import java.util.Date;

public class Medicacao
{
	private long numProcesso;
	private Date data;
	private Date hora;
	private String parecer;
	public long getNumProcesso() {
		return numProcesso;
	}
	public void setNumProcesso(long numProcesso) {
		this.numProcesso = numProcesso;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public String getParecer() {
		return parecer;
	}
	public void setParecer(String parecer) {
		this.parecer = parecer;
	}
	
	
}
