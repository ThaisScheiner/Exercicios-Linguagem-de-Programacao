/*
	Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
*/

import javax.swing.JOptionPane;
public class DepositoPoupanca 
{
    public static void main(String args[])
    {
        Double deposito, rendimento;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
        
        rendimento = (deposito * 1.3 * 30);
        
        JOptionPane.showMessageDialog(null, "O valor do rendimento da poupança é de: " + rendimento);
    }
}