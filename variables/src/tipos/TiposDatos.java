package tipos;

import variables.Persona;

public class TiposDatos {
    public static void main(String[] args) {

        int a = 5, b = 10;
        System.out.println("a: " + a);
        System.out.println("a++: " + a++ ); //post-incremento
        System.out.println("a: " + a); 
        System.out.println("++a: " + ++a); //pre-incremento

        System.out.println("b: " + b);
        System.out.println("b--: " + b-- ); //post-decremento
        System.out.println("b: " + b); 
        System.out.println("--b: " + --b); //pre-decremento

        int edad = 10;
        String mayorEdad;
        mayorEdad = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Eres " + mayorEdad );
        Persona persona = new Persona();
        System.out.println(persona instanceof Persona);

        int resultado = 3 + 5 * 6 / (4 - 5) + 5 % 2;
        System.out.println(resultado);



        // int i = 30000;
        // System.out.println("i: " + i);
        // double d = i;
        // System.out.println("d: " + d);
        // d = 3456.342;
        // int j = (int) d;
        // System.out.println("j: " + j);
        // String cadena = "1234";
        // Integer valor = 0;
        // int res = valor.parseInt(cadena);
        // System.out.println(res);
        
        
        // byte edad = 50;
        // System.out.println("Edad: " + edad); //dupiclar: Shift + Alt + Flecha arriba (abajo)
        
        // short codigo = 10000;
        // System.out.println("codigo: " + codigo);
        
        // long poblacion = 129987654365L;
        // System.out.println("poblacion: " + poblacion);
        
        // float precio =  50.45F;
        // System.out.println("precio: " + precio);

        // char c = 'E';
        // boolean b = true;
    }
}
