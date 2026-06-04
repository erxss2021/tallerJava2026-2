package cadenas;

public class MetodosString {
    public static void main(String[] args) {
        String cadena = "Hola mundo desde Java 21";
        String a = "    hola    ", b = "Hola";
        System.out.println("length() -> " + cadena.length());
        System.out.println("charAt(int) -> " + cadena.charAt(cadena.length() - 1));
        System.out.println("toUpperCase() -> " + cadena.toUpperCase());
        System.out.println("cadena -> " + cadena);
        System.out.println("toLowerCase() -> " + cadena.toLowerCase());
        System.out.println("equals() -> " + a.equals(b));
        System.out.println("equalsIgnoreCase() -> " + a.equalsIgnoreCase(b));
        System.out.println("startsWith() -> " + cadena.startsWith("H"));
        System.out.println("endsWith() -> " + cadena.endsWith("21"));
        System.out.println("contains() -> " + cadena.contains("21"));
        System.out.println("substring(int) -> " + cadena.substring(5));
        System.out.println("substring(int, int) -> " + cadena.substring(5,10));
        System.out.println("replace() -> " + cadena.replace("a","@"));
        System.out.println("a -> " + a + "hola");
        System.out.println("trim() -> " + a.trim() + "hola");
        System.out.println("split() -> ");
        String[] elementos = cadena.split(" ");
        for (String e : elementos) {
            System.out.println(e);
        }
        System.out.println("cadena -> " + cadena);
        System.out.println("indexOf() -> " + cadena.indexOf("a"));
        System.out.println("lastIndexOf() -> " + cadena.lastIndexOf("a"));





    }
}
