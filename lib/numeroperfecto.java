import java.util.Scanner;

public class numeroperfecto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// para leer por tecaldo

        // pedir al usuario que ingrse un numero para verificar si es perfecrto
        System.out.println("ingrese un numero para verificar si es perfecto :");
        int numero = scanner.nextInt();

        // verificar si el nuemro es perfecto
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }

        }
        // mostrar el resultado
        if (suma == numero) {
            System.out.println(numero + " el numero es perfecto ");

        } else {
            System.out.println(numero + " el numero no es perfecto ");
        }

        // pedir al usario un rango
        System.out.println("ingrese el inicio del rango que quiere  :");
        int inicio = scanner.nextInt();
        System.out.println("ingrese el el fin del rango del numero perfecto que dessea :");
        int fin = scanner.nextInt();

        // buscar numeros perfectos en el rango
        for (int i = inicio; i < fin; i++) {
            suma = 0;
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    suma += j;
                }

            }
            if (suma == i) {
                System.out.println(i);
            }

        }
        scanner.close();
    }

}
