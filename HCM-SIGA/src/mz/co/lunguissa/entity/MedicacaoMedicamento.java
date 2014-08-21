package mz.co.lunguissa.entity;

import java.util.Date;

public class MedicacaoMedicamento 
{
	private long numProcesso;
	private Date data;
	private Date hora;
	private int codMed;
	private int quant;
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
	public int getCodMed() {
		return codMed;
	}
	public void setCodMed(int codMed) {
		this.codMed = codMed;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	
}
