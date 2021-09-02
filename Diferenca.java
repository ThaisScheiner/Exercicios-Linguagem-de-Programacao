//	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.

import javax.swing.JOptionPane;
public class Diferenca
{
    public static void main (String args[])
    {
        int num1, num2, maior;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro."));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));
        
        if (num1 > num2)
        {
            maior = num1;
        
            JOptionPane.showMessageDialog(null, "O primeiro número = " + num1+ " é maior e o segundo número = " + num2 + " é menor" );
        }
        
        else
        {
            maior = num2;
            
            JOptionPane.showMessageDialog(null, "O segundo número = " + num2 + " é maior e o primeiro número = " + num1 + " é menor");
        }
            
    }
    
}
