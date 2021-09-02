/*
	Calcule e mostre o quadrado dos números entre 10 e 150.
*/

public class QuadradoNum
{
         public static void main(String arg[])
        {
               int b; 
               double pow;
               for (b=10; b<=150; b++) 
              { 
                     pow = Math.pow(b, 2);
                    System.out.println(" O quadrado de: " +b+ " é "+pow);
                }
    
    }

}

