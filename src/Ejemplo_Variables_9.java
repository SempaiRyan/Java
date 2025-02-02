//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Ejemplo_Variables_9 {
    public Ejemplo_Variables_9() {
    }

    public static void main(String[] args) {
        String saludar = "Hola Amigos desde Java";
        System.out.println(saludar);
        System.out.println("saludar= " + saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        int numero = 10;
        System.out.println("numero = " + numero);
        boolean valor = true;
        int numero2 = 2020;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }

        System.out.println("numero2 = " + numero2);
        String numero3 = "15";
        String nombre = "Andres Pepe";
        if (numero > 10) {
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);
        int edadPersona = 5;
        System.out.println(edadPersona);
    }
}
