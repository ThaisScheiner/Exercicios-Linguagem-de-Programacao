/*
	Receba o salario do funcionário e calcule o aumento de acordo com o cargo:
	Escriturário: +0.5% 
	Secretário: +0.35%
	Caixa: +0.2%
	Gerente: +0.1%
	
*/


import javax.swing.JOptionPane;
public class Cargo 
{
    
    public static void main (String args[])
    {
        Double salario, aumento;
        int cargo = 0;
     
 
        
      cargo = Integer.parseInt(JOptionPane.showInputDialog("1 - ESCRITURÁRIO \n 2 - SECRETÁRIO \n 3 - CAIXA \n 4 - GERENTE  \n Outros - Não há cargo \n Digite o número correspondente ao cargo do funcionário")); 
       
              salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual"));
        
        switch (cargo)
        {
            case 1 : 
                aumento = salario * 0.5; 
                System.out.println("O cargo escolhido foi: Escriturário " );
                System.out.println("O novo salário é de " + (salario + aumento) );
                break;
                
            case 2 :
                aumento = salario * 0.35;
                System.out.println("O cargo escolhido foi: Secretário");
                System.out.println("O novo salário é de " + (salario + aumento) );
                break;
                                
            case 3 :
                aumento = salario * 0.2;
                System.out.println("O cargo escolhido foi: Caixa");
                System.out.println("O novo salário é de " + (salario + aumento) );
                break;
                
            case 4 :
                aumento = salario * 0.1;
                System.out.println("O cargo escolhido foi: Gerente");
                System.out.println("O novo salário é de " + (salario + aumento) );
                break;
                
            default :
                
                System.out.println("Esse número de cargo não existe: Não há cargo");
                
   
        }
        
        
    }
    
}