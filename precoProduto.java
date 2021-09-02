//1.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
//Venda Mensal  e	Preço Atual	Preço Novo
//   < 500	   < 30	+ 10%
//>= 500 e < 1000   >= 30 e < 80	+15%
//>= 1000	>= 80	- 5%
//Obs.: para outras condições, preço novo será igual ao preço atual.


import javax.swing.JOptionPane;
public class PrecoProd 
{
    static double PreAtual, medMensal, venMensal, PreNew;
    public static void main(String args[])
    {
        
        
        PreAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto"));
        medMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal"));
        
        Produto();
        JOptionPane.showMessageDialog(null, "O novo preço é de R$ " + PreNew );
    }
    
    static void Produto()
    {
        if(venMensal < 500 || PreAtual < 30)
        {
           PreNew = PreAtual * 1.10;  
           
           
           
        }
        
        if (venMensal >= 500 && venMensal< 1000 || PreAtual >= 30 && PreAtual< 80)
        {
            PreNew = PreAtual * 1.15 ;
        }
        
        if (venMensal >=1000 || PreAtual >= 80 )
        {
             
            PreNew = -0.05/100.0;
            PreNew = PreAtual * PreNew + PreAtual;
        }
        
        
    }
}