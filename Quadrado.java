/*
	Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
*/

import javax.swing.JOptionPane;
public class LadoQuadrado 
{
    public static void main(String args[])
    {
        int area, ladoA, ladoB;
        
        ladoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado do quadrado"));
        ladoB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado do quadrado"));
        
        area = ladoA * ladoB;
        
        JOptionPane.showMessageDialog(null, "O lado do quadrado é: " + area);
        
    }
}
