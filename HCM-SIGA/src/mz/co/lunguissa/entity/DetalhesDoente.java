package mz.co.lunguissa.entity;


import java.util.Date;

public class DetalhesDoente 
{
	private long numProcesso;
	private Date data;
	private Date hora;
	private String morada;
	private int cidade;
	private String nomeAcompanhante;
	private String relacaoAcompanhante;
	private String telefAcompanhante;
	private int insencaoPagamento;
	private int provenienvia;
	private boolean altaBoolean;
	private int ent_n_entidade;
	private String serv_n_servico;
	private int n_senha;
	
	
	
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
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public int getCidade() {
		return cidade;
	}
	public void setCidade(int cidade) {
		this.cidade = cidade;
	}
	public String getNomeAcompanhante() {
		return nomeAcompanhante;
	}
	public void setNomeAcompanhante(String nomeAcompanhante) {
		this.nomeAcompanhante = nomeAcompanhante;
	}
	public String getRelacaoAcompanhante() {
		return relacaoAcompanhante;
	}
	public void setRelacaoAcompanhante(String relacaoAcompanhante) {
		this.relacaoAcompanhante = relacaoAcompanhante;
	}
	public String getTelefAcompanhante() {
		return telefAcompanhante;
	}
	public void setTelefAcompanhante(String telefAcompanhante) {
		this.telefAcompanhante = telefAcompanhante;
	}
	public int getInsencaoPagamento() {
		return insencaoPagamento;
	}
	public void setInsencaoPagamento(int insencaoPagamento) {
		this.insencaoPagamento = insencaoPagamento;
	}
	public int getProvenienvia() {
		return provenienvia;
	}
	public void setProvenienvia(int provenienvia) {
		this.provenienvia = provenienvia;
	}
	public boolean isAltaBoolean() {
		return altaBoolean;
	}
	public void setAltaBoolean(boolean altaBoolean) {
		this.altaBoolean = altaBoolean;
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
	
	public int getEnt_n_entidade() {
		return ent_n_entidade;
	}
	public void setEnt_n_entidade(int ent_n_entidade) {
		this.ent_n_entidade = ent_n_entidade;
	}
	
	
	
	
	
	
}
