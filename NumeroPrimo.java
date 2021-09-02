    /*
		recebe um numero para identificar se ele é primo
	*/
	
	import java.util.Scanner;
     
    public class NumerosPrimos
    {
    	public static void main(String args[])
    	{
    		Scanner entrada = new Scanner(System.in);
    		
    		String resultado = "";
    		int num, quantDivisores = 0;
    		
    		System.out.println("Digite um número para verificar se é primo");
    		System.out.print("Número: ");
    		num = entrada.nextInt();	
                    
                    // para ser numero primo tem que ser igual ou maior que 2.
    		if(num < 2){
                            // se for menor que 2 não é primo.
    			System.out.println("Número inválido.");
    		}
    		
                    // Para ser número primo só pode ter 2 divisores, os divisores são 1 e o proprio numero.
    		for(int i = 1; i <= num; i++) {
                            // o ciclo verifica passa por todos os antecessores do numero.
                            // a cada passagem verifica se o número e divisivel por esse antecessor.
    			if ((num % i) == 0) {
                                    // se for divisivel por este antecessor, incrementa a variavel de controle.
    				quantDivisores++;
    			}
    		}
     
                    // no final verifica quantos divisores encontrou.
    		if (quantDivisores == 2) {
                            // se encontrou somente 2 é primo.
                            // já que só tem 2 divisores, 1 e o próprio número.
    			System.out.println("O número " + num + " é primo.");
    		} else {
                            // caso contrario tem mais divisores portanto não é primo.
    			System.out.println("O número " + num + " não é primo.");
    		}
    	}
    }
