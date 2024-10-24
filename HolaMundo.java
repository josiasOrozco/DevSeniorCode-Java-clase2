import java.util.Scanner;

/**
 * HolaMundo
 */
public class HolaMundo {
    
    public static void main(String[] args) {
        // Imprimir datos en pantalla / consola / terminal
        System.out.println("Hola Josias");

        System.out.printf("Mi nombre es %s y tengo %d años%n", "Josias Orozco", 23);

        System.out.println("por favor ingrese un nombre: ");
        var entrada = new Scanner (System.in);
        var entero = entrada.nextLine();

        entrada.close();
    }
    
}