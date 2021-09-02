/*
	Receba a nota de 2 provas de 3 alunos e calcule a media dos alunos
*/

import javax.swing.*;
public class MediaMatriz 
{
    public static void main(String args[])
    {
        double Notas[][] = new double [3][2];
        double media, soma;
        int i , j;
        
        for(i = 0; i < 3; i++)
        {
            soma = 0;
          
            for(j = 0; j < 2;j++)
            {
                Notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+(j+1)  +" do aluno " + (i+1)));
                soma = soma + Notas[i][j];
               
                
            }
          media = soma / 2;  
          System.out.println("A média do aluno " + (i+1) + " é: " + media);
            
        }
    }
}
