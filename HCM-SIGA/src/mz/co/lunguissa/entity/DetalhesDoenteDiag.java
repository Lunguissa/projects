package mz.co.lunguissa.entity;

import java.util.Date;

public class DetalhesDoenteDiag 
{
	private long numProcesso;
	private Date data;
	private Date hora;
	private long codDiag;
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
	public long getCodDiag() {
		return codDiag;
	}
	public void setCodDiag(long codDiag) {
		this.codDiag = codDiag;
	}
	
}
