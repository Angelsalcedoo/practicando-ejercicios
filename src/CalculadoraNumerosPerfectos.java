import java.util.Scanner;

public class CalculadoraNumerosPerfectos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero para verificar si es perfecto y hallar sus divisores :");
        int numero = scanner.nextInt();

        int suma = 0;
        System.out.print("Los divisores de " + numero + " son: ");
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                System.out.print(i);
                suma += i;
                if (suma < numero) {
                    System.out.print(" + ");

                }

            }

        }
        System.out.println(" = " + suma);
        if (suma == numero) {
            System.out.println(" Es un numero perfecto. ");
        } else {
            System.out.println(" no es un numero perfecto . ");
        }

        System.out.println(" Ingrese el inicio del rango: ");
        int inicio = scanner.nextInt();
        System.out.println(" Ingrese el fin del rango: ");
        int fin = scanner.nextInt();

        if (inicio > fin) {
            System.out.println("Error:El inico debe ser menor que el fin del rango... ");
            return;

        }
        System.out.println("numeros perfectos en el rango[" + inicio + "," + fin + "]");
        boolean encontrado = false;

        for (int i = inicio; i <= fin; i++) {
            suma = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    suma += j;

                }
            }

            if (suma == i) {
                System.out.println(i + " es un numero perfecto. divisores: ");
                for (int j = 1; j < i / 2; j++) {
                    if (i % j == 0) {
                        suma += j;
                        System.out.print(j + " ");

                    }
                }
                System.out.println();
            encontrado = true;

            }
            if (!encontrado) {
                System.out.println("no se encontraron numeros perfectos en el rango");
            }
        }
        scanner.close();
    }
}