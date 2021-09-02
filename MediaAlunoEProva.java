/*
	Calcule a média dos alunos de uma disciplina. 
	Considere uma matriz de 3 linhas e 2 colunas. Cada linha está associada a um aluno de uma determinada disciplina, e as colunas estão associadas às notas das duas provas referentes àquele estudante. 
	O programa solicita a nota de cada aluno, exibe a média de cada aluno ((nota1+nota2) /2) e a média de cada prova da turma (prova1 e prova2).

*/

import javax.swing.JOptionPane;

public class Teste 
{
     public static void main(String[] args) 
     {

        double Notas[][] = new double[3][2];
        double mediaColuna = 0, somaMedia, mediaNota;

        for (int i = 0; i < 3; i++) 
        {   
            somaMedia=0;
            
            for (int j = 0; j < 2; j++) 
            {
                
               Notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+(j+1)  +" do aluno " + (i+1)));
               somaMedia = somaMedia + Notas[i][j];
                 
            }
            
            mediaNota = somaMedia / 2;
            System.out.println("A média do aluno " + (i+1) + " é: " + mediaNota);
            //JOptionPane.showMessageDialog(null, "A média do aluno é:  " + (i+1) + " é: " +  mediaNota);
        }

        double soma[] = new double[2];

        for (int x = 0; x < 2; x++) {
            soma[x] = 0;
        }

        for (int j = 0; j < 2; j++) 
        {
            for (int i = 0; i < 3; i++) {
                soma[j] = soma[j] + Notas[i][j];
                mediaColuna = soma[j] / 3;
            }
            JOptionPane.showMessageDialog(null, "A soma da coluna " + (j + 1) +" é " + soma[j] + "\n e a média da coluna é = " + mediaColuna);
        }
    }
    
    
}
