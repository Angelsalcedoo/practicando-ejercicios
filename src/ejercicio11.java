import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar contadores
        int mayoresOIgualesA7 = 0;
        int menoresA7 = 0;

        // Solicitar al usuario que ingrese 10 notas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = scanner.nextDouble();

            // Verificar si la nota es mayor o igual a 7 o menor a 7
            if (nota >= 7) {
                mayoresOIgualesA7++;
            } else {
                menoresA7++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + mayoresOIgualesA7);
        System.out.println("Cantidad de alumnos con notas menores a 7: " + menoresA7);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}