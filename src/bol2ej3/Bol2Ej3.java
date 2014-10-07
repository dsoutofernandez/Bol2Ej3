
package bol2ej3;

import java.util.Scanner;

public class Bol2Ej3 {

    public static void main(String[] args) {
        
        float cambio = 0;
        float euros = 0;
        float resultado = 0;
        
        System.out.println("Introduzca el cambio: ");
        Scanner cambiobase = new Scanner (System.in);
        cambio = cambiobase.nextFloat();
        
        System.out.println("Introduzca la cantidad a calcular: ");
        Scanner base = new Scanner (System.in);
        
        euros = base.nextFloat();
        
        resultado = cambio * euros;
        
        System.out.println("Al cambio es: " +resultado);
    }
    
}
