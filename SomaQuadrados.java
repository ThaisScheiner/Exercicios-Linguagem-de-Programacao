/*
	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
*/

import javax.swing.JOptionPane;
public class SomaQuadrados 
{
    public static void main(String args[])
    {
        int num1, num2, soma1, soma2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        
        soma1 = num1 * 2;
        soma2 = num2 * 2;
        
        JOptionPane.showMessageDialog(null, "A soma do quadrado do primeiro número é:  " + soma1 + "\n A soma do quadrado do segundo número é de:  " + soma2);
    }
}
