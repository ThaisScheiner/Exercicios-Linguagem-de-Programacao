/*
	Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
*/

import javax.swing.JOptionPane;
public class SomarImpar 
{
    public static void main(String args[])
    {
            int x, y, r = 0;
      
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
     
                    if (y>x)
                   {
                       r=y;
                      y=x;
                      x=r;
                      r=0;
                    }
                   while (y<=x)
                  {
                        y++;
                        if (y%2 != 0 && y!= x)
                       {
                            r = y + r;
                       }
           }

              JOptionPane.showMessageDialog(null, "O maior é: " + x + "\n" + "A soma dos números impares entre o valor de X e Y é: " + r);
    }
}
