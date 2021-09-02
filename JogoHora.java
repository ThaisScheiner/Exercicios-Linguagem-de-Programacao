/*
	Receba a hora de início e de final de um jogo (HH,MM), 
    calcular o tempo do jogo em horas e minutos, sabendo
    que o tempo máximo é menor que 24 horas e pode   
    começar num dia e terminar em outro.

*/

public class Jogo
{   
    static int hI, hF, mI, mF, tempoH, tempoM;
    public static void main(String args[])
    {
        
        hI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio do jogo"));
        mI = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos do fim do jogo"));
        hF = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio do jogo"));
        mF = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos do fim do jogo"));
        
        calcula_jogo();
        
    }

    static void calcula_jogo()
    {
        if(hF >= hI)
            tempoH = hF - hI;
        else
            tempoH = hF + 24 - hI;
        
        if(mF >= mI)
            tempoM = mF - mI;
        else
            tempoM = mF + 59 - mI;
        
        if(hI <= 0 || hF<= 0 || hI > 24 || mI <=0 || mF <=0 || mI >59 || mF > 59)
            JOptionPane.showMessageDialog(null, "Erro! Valor da hora inválido.");
        
        JOptionPane.showMessageDialog(null, "O jogo durou " + tempoH + " - " + " horas e " + tempoM + " minutos ");
        
    }
}
