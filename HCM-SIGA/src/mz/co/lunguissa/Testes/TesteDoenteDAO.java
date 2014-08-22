package mz.co.lunguissa.Testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import mz.co.lunguissa.dao.DoenteDAO;
import mz.co.lunguissa.entity.DetalhesDoente;
import mz.co.lunguissa.entity.Doente;

public class TesteDoenteDAO {
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
	public static void main(String[] args) {
		Doente d=new Doente();
		DoenteDAO dao=new DoenteDAO();
		d.setNome("maria");
		d.setApelido("joana");
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
		String str = "09/01/2003";  
		  
		Date data = null;
		try {
			data = formatador.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.setDataNascimento(data);
		d.setNumProcesso(25489);
		d.setSexo("F");
		dao.saveDoente(d);
		
		System.out.println("getDoente()");
		Doente d2=dao.getDoente(25486);
		System.out.println(d2);
		System.out.println("                              ");
		System.out.println("getDetalhesDoente()");
		DetalhesDoente dd=new DetalhesDoente();
		String dat = "dd/MM/yyyy";  
		 
		String data1;  
		  
		Date agora = new Date(); 
		SimpleDateFormat formata = new SimpleDateFormat(dat);  
		data1 = formata.format(agora);
		
		
		try {
			data = formatador.parse(data1);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dd.setNumProcesso(25537);
		dd.setServ_n_servico("c");
		dd.setEnt_n_entidade(2);
		dd.setN_senha(35);
		dd.setData(data);
		dd.setMorada("somewhere");
		dd.setCidade(1);
		dd.setNomeAcompanhante("joao");
		
		dd.setRelacaoAcompanhante("amigo");
		dd.setTelefAcompanhante("825555555");
		dd.setInsencaoPagamento(2);
		dd.setProvenienvia(2);
		dd.setAltaBoolean(true);
		
		dao.saveDetalhesDoente(dd);
		
		
		ArrayList<DetalhesDoente> list= dao.getDetalhesDoente(25536);
		ArrayList<Doente> list2= dao.getDoentes();
		
		for (int i = 0; i < list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("                              ");
		System.out.println("getLastDetalhesDoente()");
		DetalhesDoente dd2=dao.getLastDetalhesDoente(25536);
		System.out.println(dd2);
		
		System.out.println("                              ");
		for (int i = 0; i < list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
	}
	

}
