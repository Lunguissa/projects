package mz.co.lunguissa.Funcionalidades;

import javax.swing.JOptionPane;

public class Validacao
{
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
