package mz.co.lunguissa.entity;

import java.util.Date;

public class DoenteDetalhesAnalisesPedidas {

	private long numProcesso;
	private Date data;
	private Date hora;
	private int codAnalise;
	private long numAnalise;
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
	public int getCodAnalise() {
		return codAnalise;
	}
	public void setCodAnalise(int codAnalise) {
		this.codAnalise = codAnalise;
	}
	public long getNumAnalise() {
		return numAnalise;
	}
	public void setNumAnalise(long numAnalise) {
		this.numAnalise = numAnalise;
	}
	
	
}
