import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 10) {
            System.out.println(numero + ": el numero tiene una cifra");

        } else if (numero >= 10 && numero <= 99) {
            System.out.println(numero + ": el numero tiene dos cifras");

        } else if (numero >= 100 && numero <= 999) {
            System.out.println(numero + ": el numero tiene tres cifras");

        } else {
            System.out.println("Error:el numero de cifras es mayor");
        }
        scanner.close();

    }
}
