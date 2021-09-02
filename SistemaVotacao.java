/*
	1)	Criar uma classe abstrata segundo:

.......................................................................................	
.		                   Estatística		                         . 
.......................................................................................
.       CodigoCidade   :    NomeCidade       :  QtdAcidentes         .
.......................................................................................
.       int	           :         String      :     int               .
.......................................................................................

       2)   ClassePrincipal
---------------------------------------------------------------
|	MENU ESTATÍSTICA	               	        |
| Estatísticas de acidentes em 2020		        |
| 1 - Cadastro Estatística			            |
| 2 - Consulta por quantidade de acidentes	    |
| 3 - Consulta por estatísticas de acidentes	|
| 4 - Acidentes acima da média das 10 cidades   |
| 9 - Finaliza 		   		                    |
----------------------------------------------------------------


3) Criar ClasseMetodos conforme:
* exibir em todos os campos: código, nome, quantidade 

1) Cadastrar 10 registros a partir do método                       - FCADRASTRAESTATISTICA (função); 
2) Consulta por quantidade de acidentes > 100 e < 500; - PQTDACIDENTES (procedimento);
3) Consultar por:                                                                        - PMAIORMENOR (procedimento);
menor número de acidentes; 
 maior número de acidentes;

4) Cidades com qtd de acidentes acima da média das 10 cidades -PACIMA (procedimento);


*/

import java.io.*;
import javax.swing.*;
public class ClasseMenu 
{
    public static void main(String args[]) throws IOException
    { 
        String fileName = "ArquivoEstatisticaTransito.txt";
        
        
        
        
        Registro[] registro = new Registro[10];
        
        ClasseMetodos m = new ClasseMetodos();
        
       
      
        int i;
        
        for(i = 0; i < 10; i++)
        {
            registro[i] = new Registro();
        }
        
        int opc = 0;
        do
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATÍSTICA\n Estatísticas de acidentes em 2020 \n 1 - Cadastro Estatística \n2 - Consulta por quantidade de acidente \n3 - Consulta por estatísticas de acidentes \n4 - Acidentes acima da média de 10 cidades \n 9 - Finaliza"));
            switch(opc)
            {
                case 1: registro = m.FCadastra(registro);
                break;
                case 2: m.PesqQTDAcidentes(registro);
                break;
                case 3: m.PesqMAIORMENOR(registro);
                break;
                case 4: m.PesqACIMA(registro);
                break;
                case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                break;
                default: JOptionPane.showMessageDialog(null,"Opção Inválida");
                
            }
        
        }
        while(opc != 9);
    }
}


//---------------------------------------------------------------------------------------------------------------------------------------------------------

import javax.swing.JOptionPane;
import java.io.*;
public class ClasseMetodos 
{
   
    public Registro[] FCadastra(Registro[] registro) throws IOException
    {
        int i;
        String fileName = "ArquivoEstatisticaTransito.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter( fileName ));
        
        for(i=0;i<10;i++)
        {
            registro[i] = new Registro();
        
        }
        
        for(i = 0; i < 10; i++)
        {
          
                registro[i].CodCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade")); 
                gravar.write(Integer.toString(registro[i].CodCidade)); 
                gravar.newLine(); 
                registro[i].NomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade"); 
                gravar.write(registro[i].NomeCidade ); 
                gravar.newLine(); 
                registro[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes")); 
                gravar.write(Integer.toString(registro[i].QtdAcidentes)); 
                gravar.newLine(); 
                
            
            
        }   
            System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");
            gravar.close();
        
        return registro;
    }
    
    
    
    public void PesqQTDAcidentes (Registro[] registro)throws IOException
    {
            
        int i;
        String fileName = "ArquivoEstatisticaTransito.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
      
            for(i = 0; i < 10; i++)
            {
                registro[i] = new Registro();
            }

                for(i=0;i<10;i++)
                {
                    registro[i].CodCidade = Integer.parseInt(ler.readLine());
                    registro[i].NomeCidade = ler.readLine();
                    registro[i].QtdAcidentes = Integer.parseInt(ler.readLine());                
                }
                
                for(i=0;i<10;i++)
                {
                    System.out.println(registro[i].CodCidade + " - " + registro[i].NomeCidade + " - acidentes " + registro[i].QtdAcidentes);
                }
         
        ler.close();
        
    }
            
          
        
        
 
        
    
    
    public void PesqMAIORMENOR(Registro[] registro)throws IOException
    {
    	
    	
    	 int i;
         String fileName = "ArquivoEstatisticaTransito.txt";
         BufferedReader ler = new BufferedReader(new FileReader(fileName));
       
      
         int maior = Integer.MIN_VALUE;
         int menor = Integer.MAX_VALUE;
         String cidade = null;
         String cidade1 = null;
         
             for(i = 0; i < 10; i++)
             {
                 registro[i] = new Registro();
             }

                 for(i=0;i<3;i++)
                 {
                     registro[i].CodCidade = Integer.parseInt(ler.readLine());
                     registro[i].NomeCidade = ler.readLine();
                     registro[i].QtdAcidentes = Integer.parseInt(ler.readLine());                
                 }
                 
                 for(i = 0; i < registro.length; i++)
                 {
                	 if (registro[i].QtdAcidentes < menor)
                	 {
                         menor = registro[i].QtdAcidentes;
                         cidade1 = registro[i].NomeCidade;
                     } else
                       {
                    	 	if (registro[i].QtdAcidentes > maior)
                    	 	{
                    	 		maior = registro[i].QtdAcidentes;
                    	 		cidade = registro[i].NomeCidade;
                            }
                    	 	
                       }
                	 

   
                 }
          
         
         ler.close();
    
         System.out.println("A menor cidade em acidentes é : " + cidade1 + " com " + menor + " de estistica de acidentes no trânsito");
         System.out.println("A maior cidade em acidentes é : " + cidade + " com " + maior + " de estistica de acidentes no trânsito");
         
    }

    
    
    public void PesqACIMA(Registro[] registro)throws IOException
    {
    	
    	int i;
        String fileName = "ArquivoEstatisticaTransito.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        
            for(i = 0; i < 10; i++)
            {
                registro[i] = new Registro();
            }

                for(i=0;i<10;i++)
                {
                	registro[i].CodCidade = Integer.parseInt(ler.readLine());
                    registro[i].NomeCidade = ler.readLine();
                    registro[i].QtdAcidentes = Integer.parseInt(ler.readLine());                
                }
                
                for(i=0;i<10;i++)
                {
                	
                	 if(registro[i].QtdAcidentes > 400)
                     {
                     	System.out.println("A cidade " + registro[i].NomeCidade + " com o código " + registro[i].CodCidade + " está acima da média de acidentes no trânsito contabilizando " + registro[i].QtdAcidentes + " acidentes");
                     }
                  
                	
                }
                
        
        ler.close();
    	
    	
    }
     
    }

   

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


class Registro 
{
    int CodCidade;
    String NomeCidade;
    int QtdAcidentes;


    Registro()
    {
         this(0, "", 0);
    }

    Registro(int CodCid, String CNome,int QtdAc )
    {
        CodCidade =  CodCid;
        NomeCidade =  CNome;
        QtdAcidentes = QtdAc;
    }
    

}
