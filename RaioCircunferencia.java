/*
	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
*/

import javax.swing.JOptionPane;
public class RaioCircunferencia
{
    public static void main(String args[])
    {
        Double raio, diametro;
        
        diametro = Double.parseDouble(JOptionPane.showInputDialog("Digite o diâmetro da circunferência"));
        
        raio = diametro / 2;
        
        JOptionPane.showMessageDialog(null, "O raio da circunferência é de: " + raio);
        
    }
}
