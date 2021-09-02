/*
	Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
*/

import javax.swing.JOptionPane;
public class Salario 
{
    public static void main (String args[])
    {
        Double salario, reajuste;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
        
        reajuste = salario * 1.15;
        
        JOptionPane.showMessageDialog(null, "O reajuste do salario do funcionário foi de: " + reajuste);
    }
}