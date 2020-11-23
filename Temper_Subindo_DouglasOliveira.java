
package temper_subindo_douglas.oliveira;

import java.util.Scanner;


public class Temper_Subindo_DouglasOliveira {

    public static void main(String[] args) {
        Scanner entrada;
      double C,F;
      entrada = new Scanner (System.in);
       System.out.println("Digite a temperatura em Celsius");
      C= entrada.nextDouble();
        F= (C *1.8 + 32);
        System.out.println("A temperatura em Fahrenheit é:\n" +F);
     int i=0;
     do 
    {F=F+10;
     i++;
    if(i<=10){
     System.out.println("temperatura subindo de 10 em 10 \n"+F);}
     } while (i<=10);
    }
    
}
