import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            int suma = numero1 + numero2;
            int diferencia = numero1 - numero2;
            System.out.println("suma: " + suma);
            System.out.println("diferencia: " + diferencia);
        } else {
            int producto = numero1 * numero2;
            double division = numero1 / numero2;
            System.out.println("producto: " + producto);
            System.out.println("division: " + division);

        }
        scanner.close();
    }

}
