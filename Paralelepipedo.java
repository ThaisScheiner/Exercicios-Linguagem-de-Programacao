/*
	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
*/

import javax.swing.JOptionPane;
public class Paralelepipedo 
{
    public static void main(String args[])
    {
        Double comp, larg, alt, paralelepipedo;
        
        comp = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo"));
        larg = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do paralelepípedo"));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paralelepípedo"));
        
        paralelepipedo = comp * larg * alt;
        
        JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é de: " + paralelepipedo);
    }
}