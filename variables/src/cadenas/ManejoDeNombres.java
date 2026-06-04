package cadenas;

import java.util.Scanner;

public class ManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre1, nombre2, nombre3;
        String nombreA, nombreB, nombreC;
        String resultado;

        System.out.print("Ingresa el nombre 1:");
        nombre1 = entrada.next();
        System.out.print("Ingresa el nombre 2:");
        nombre2 = entrada.next();
        System.out.print("Ingresa el nombre 3:");
        nombre3 = entrada.next();   

        //Problema

        // nombreA = nombre1.charAt(1)+".";
        // nombreA = nombreA.toUpperCase() + nombre1.substring(nombre1.length()-2);
        nombreA = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
        nombreB = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        nombreC = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);

        resultado = nombreA + "_" + nombreB + "_" + nombreC;
        System.out.println(resultado);
    }
}
