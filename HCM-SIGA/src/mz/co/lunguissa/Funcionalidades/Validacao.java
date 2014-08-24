package mz.co.lunguissa.Funcionalidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import com.toedter.calendar.JDateChooser;

public class Validacao
{
	public static int getIdade(Date nascimento) {
	    Calendar cn = Calendar.getInstance();
	    cn.setTime(nascimento);
	 
	    Date dataAtual = new Date(System.currentTimeMillis());
	    Calendar ca = Calendar.getInstance();
	    ca.setTime(dataAtual);
	 
	    int idade = ca.get(Calendar.YEAR) - cn.get(Calendar.YEAR);
	    if (ca.get(Calendar.MONTH) < cn.get(Calendar.MONTH)) {
	        idade--;
	    } else if (ca.get(Calendar.MONTH) == cn.get(Calendar.MONTH)) {
	        if (ca.get(Calendar.DAY_OF_MONTH) < cn.get(Calendar.DAY_OF_MONTH))
	            idade--;
	    }
	    return idade;
	}
	
	public static double calculoMeses(String data1, String data2)
	{
		 SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
		 Date dataInicio = null;
		 Date dataFim = null;
			try {
				dataInicio = format.parse(data1);
				dataFim = format.parse(data2);  
				  
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	       
	        /* 
	         * valor de um mes em milisegundos, sendo que os valores sao: 
	         * 30 dias no mes, 24 horas no dia, 60 minutos por hora, 60 segundos por minuto e 1000 milisegundos   
	         */  
	        final double MES_EM_MILISEGUNDOS = 30.0 * 24.0 * 60.0 * 60.0 * 1000.0;  
	        //final double MES_EM_MILISEGUNDOS = 2592000000.0;  
	          
	        double numeroDeMeses = (double)((dataFim.getTime() - dataInicio.getTime())/MES_EM_MILISEGUNDOS);  
	          
	       return numeroDeMeses;  
	    }  
	
	public static int calculoAnos(JDateChooser txtData)
	{
		
		
	    Date data = new Date();  
	    Date nascimento = txtData.getDate();  
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");  
	    int ano1 = Integer.parseInt(sdf.format(nascimento));  
	    int ano2 = Integer.parseInt(sdf.format(data));  
	    int dif = ano2 - ano1;  
	
	    return dif;

	}
	
	
	public static void CalcularDias(Date nascimento)
	{
		
	    GregorianCalendar c1 = new GregorianCalendar();  
	    c1.set(2014,nascimento.getMonth(),17); // 15/08/2010  
	    GregorianCalendar c2 = new GregorianCalendar(); //data atual  
	      
	    long diferenca = c2.getTimeInMillis() - c1.getTimeInMillis();  
	    long segundos = diferenca / 1000l; //Transformando milisegundos em segundos  
	    System.out.println("Segundos: " + segundos);  
	    long horas = (segundos / 60) / 60; // segundos -> horas  
	    System.out.println("Horas: " + horas);  
	    long dias = horas / 24; // horas -> dias  
	    JOptionPane.showMessageDialog(null, "Diferenca em Dias: " + dias)  ;
	}
	
    public static boolean soContemLetras(String texto) 
    {  
    	texto=texto.replace(" ","");
    	
        if(texto == null || texto.equals(""))  
        {
            return false;
        }
        
        for (int i = 0; i < texto.length(); i++)
        {  
            if (!Character.isLetter(texto.charAt(i)))   
                return false;
         }  
         return true;  
    } 
    
    public static boolean soContemNumeros(String texto) 
    {  
    	texto=texto.replace(" ","");
    	
        if(texto == null || texto.equals(""))  
        {
            return false;
        }
        
        for (int i = 0; i < texto.length(); i++)
        {  
            if (!Character.isDigit(texto.charAt(i)))   
                return false;
         }  
         return true;  
    } 
    
    public static String arranjaNome(String nom)
	{
		
		String[] nome =nom.split(" ");
		
		for (int i = 0; i <nome.length; i++) {
			nome[i]=Validacao.primeiraMauscula(nome[i]);
		}
		String novaString="";
		
		for (int j = 0; j < nome.length; j++) {
        novaString=novaString+nome[j]+" ";
		}
		
		return novaString;
		
	}
    
    public static String primeiraMauscula(String palavra)
	{
		String c=palavra.toUpperCase().charAt(0)+"";
		palavra=c+palavra.substring(1);
		return palavra;
	}
	
    
    public static boolean soContemLetrasNumeros(String texto) 
    {  
    	texto=texto.replace(" ","");
        if(texto == null || texto.equals(""))  
        {
            return false;
        }
        
        for (int i = 0; i < texto.length(); i++)
        {  
            if (!Character.isLetter(texto.charAt(i)) && !Character.isDigit(texto.charAt(i))   )   
                return false;
         }  
         return true;  
    } 
public static void main(String[] args)
{
	System.out.println(soContemLetrasNumeros("has as"));
}

}
