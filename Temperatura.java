/*
	Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida 
	em fahrenheit F = (9*C+160) /5
*/

import javax.swing.JOptionPane;
public class Temperatura 
{
  
      public static void main(String args[])
    {
        Double TempC, TempF;
        
        TempC = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius"));
        TempF = (9*TempC + 160) / 5;
        
        JOptionPane.showMessageDialog(null, "A temperatura convertida de Celsius para Fahrenheit é de " + TempF);
    }
   
}
