package entrada;

import java.util.Scanner;

public class LecturaUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        String nombre;
        int edad;
        double sueldo;
        System.out.print("Ingresa tu nombre:");
        nombre = entrada.nextLine();
        System.out.print("Ingresa tu edad:");
        edad = entrada.nextInt();
        System.out.print("Ingresa tu sueldo:");
        sueldo = entrada.nextDouble();
        entrada.nextLine();
        entrada.close();

        System.out.println("Hola, " + nombre + " tienes " + edad + " años.");
        System.out.println("Tu sueldo es: $" + sueldo);
        
    }
}
