import java.util.Scanner;

public class NumerosPerfectos {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número para verificar si es perfecto
        System.out.print("Ingresa un número para verificar si es perfecto: ");
        int numero = scanner.nextInt();

        // Verificar si el número es perfecto
        int suma = 0; // Variable para almacenar la suma de los divisores
        for (int i = 1; i < numero; i++) { // Recorrer desde 1 hasta numero - 1
            if (numero % i == 0) { // Si i es un divisor de numero
                suma += i; // Sumar i a la variable suma
            }
        }

        // Mostrar el resultado
        if (suma == numero) { // Si la suma de los divisores es igual al número
            System.out.println(numero + " es un número perfecto.");
        } else { // Si no
            System.out.println(numero + " no es un número perfecto.");
        }

        // Pedir al usuario un rango para buscar números perfectos
        System.out.print("Ingresa el inicio del rango: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingresa el fin del rango: ");
        int fin = scanner.nextInt();

        // Buscar números perfectos en el rango
        System.out.println("Números perfectos en el rango [" + inicio + ", " + fin + "]:");
        for (int i = inicio; i <= fin; i++) { // Recorrer el rango
            suma = 0; // Reiniciar la suma para cada número
            for (int j = 1; j < i; j++) { // Recorrer desde 1 hasta i - 1
                if (i % j == 0) { // Si j es un divisor de i
                    suma += j; // Sumar j a la variable suma
                }
            }
            if (suma == i) { // Si la suma de los divisores es igual al número
                System.out.println(i); // Imprimir el número perfecto
            }
        }

        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}