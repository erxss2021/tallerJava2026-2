package test;

import variables.Contador;
// import variables.Ejemplo;
import variables.Persona;

public class Principal {
    public static void main(String[] args) {
        // Ejemplo ejemplo = new Ejemplo();
        // ejemplo.mostrar();
        System.out.println("---------persona--------------------");
        Persona persona =    new Persona();
        persona.mostrar();


        System.out.println("----------------persona2--------------------");
        //Declaración del objeto
        Persona persona2;

        //Se hace la instancia
        persona2 = new Persona();
        persona2.mostrar();
        persona2.nombre = "Eloy";
        persona2.edad = 40;
        persona2.mostrar();

        //Variables estaticas
        new Contador(); 
        new Contador();
        new Contador();
        new Contador();

        System.out.println("Total de objetos: " + Contador.total);
    }
}
