package variables;

public class Ejemplo {
    public void mostrar(){
        Persona persona = new Persona();
        persona.nombre = "";
        int edad = 35;
        
        System.out.println("Edad: " + edad);
        edad = 4;
        
        {
            edad = 56;
        }
        System.out.println("Edad: " + edad);

    }

    // public void otroMetodo(){
    //     System.out.println(edad);
    // }
}
