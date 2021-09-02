/*
	Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
*/

import javax.swing.JOptionPane;
public class AreaTriangulo 
{
    public static void main(String args[])
    {
        int base, altura, area;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base de um triângulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura de um triângulo "));
      
        area = (base * altura) / 2 ;
        
        JOptionPane.showMessageDialog(null, "A área do triângulo é de: " + area);
    }
}
