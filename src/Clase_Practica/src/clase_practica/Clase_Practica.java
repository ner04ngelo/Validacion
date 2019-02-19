package clase_practica;

import java.util.ArrayList;

public class Clase_Practica {
   
    public static void main(String[] args) {
        
       short numPar =0 , numImpar = 0, i = 0;  
       short contPar = 0, contImpar =0;
       
        while ( i <= 99) {
            
            short random = (short)(Math.random() * 100 + 1);
            
            if (random%2==0) {                
                numPar += random;
                contPar++;                
            } else {
                numImpar+= random;
                contImpar++;               
            }

            i++;
        }       
     
        System.out.println("Promedio número Pares: " + ((float)(numPar)/(float)(contPar)));
        System.out.println("Promedio número Impares: " +((float)(numImpar)/(float)(contImpar)));        
      
    }    
}
