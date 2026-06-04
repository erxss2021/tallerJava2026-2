package condicionales;

public class ParImpar {
    public static void main(String[] args) {
        int numero = 15;
        // boolean condicion = numero % 2 == 0;
        if (numero % 2 != 0) {
            System.out.println("Numero " + numero + " es impar.");
        } else {
            System.out.println("Numero " + numero + " es par.");
            
        }
    }
}
