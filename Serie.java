/*
	Receba um número N. Calcule e mostre o resultado da série:  1/1! + 1/2! + 1/3! ... + 1/N! 
	Sugestão: Desenvolver 2 funções, onde haverá a chamada de uma função na outra. 

*/

import javax.swing.JOptionPane;
public class Serie_Tarefa07 
{
  
    public static void main(String args[])
    {
       int x;
        double res = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número N"));
        
        res = ResultSerie(x);
        JOptionPane.showMessageDialog(null, "O resultado da série é: " + res );
       
    }

        public static double ResultSerie(int n)
        {
            int cta;
            double soma=0;
            
            for(cta = 1; cta <= n;cta++)
            {
                soma = soma + (1 /(double)Fatorial(cta));
            }
           return soma;
        }
        
         public static int Fatorial(int num)
        {
            int aux;
            aux = num -1;
            while(aux != 0)
            {
                num = num * aux;
                aux = aux -1;
            }
            
            return num;
        }
}