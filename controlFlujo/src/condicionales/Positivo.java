package condicionales;

public class Positivo {
    public static void main(String[] args) {
        //Saber si un numero dado es positivo, negativo o cero
        int numero = -10;
        if (numero > 0) {
            System.out.println("Numero " + numero + " es positivo.");
        }else if(numero < 0){
            System.out.println("Numero " + numero + " es negativo.");
        }else{
            System.out.println("Numero es cero (0)");

        }
    }
}
