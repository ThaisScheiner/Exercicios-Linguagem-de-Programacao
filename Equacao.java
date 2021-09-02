/*
	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possui 2 raízes)
*/

import javax.swing.JOptionPane;

public class Equacao 
{
     public static void main(String args[])
    {
        Double  A, B, C, X1 = null, X2 = null, Delta;
        
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C"));
        
        Delta = (B*B) - (4*A*C);
        
            if (Delta <= 0)
            {
                 JOptionPane.showMessageDialog(null, "Erro, não possui raiz real");
            }
            else
            {
                X1 = ((-B) + Math.sqrt(Delta)) / (2*A); 
                X2 = ((+B) + Math.sqrt(Delta)) / (2*A);   
            }
                    
               
        JOptionPane.showMessageDialog(null, "O valor de X1 é de " + X1);
        JOptionPane.showMessageDialog(null, "O valor de X2 é de " + X2);
        JOptionPane.showMessageDialog(null, "O valor de Delta é de " + Delta);
        
        
    }

}
