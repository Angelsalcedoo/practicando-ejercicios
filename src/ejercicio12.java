import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        // 1. Creamos un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // 2. Variables para contar empleados y calcular gastos
        int empleados100a300 = 0; // Contador de empleados que cobran entre $100 y $300
        int empleadosMas300 = 0;  // Contador de empleados que cobran más de $300
        double gastoTotal = 0;    // Acumulador del gasto total en sueldos

        // 3. Solicitamos el número de empleados
        System.out.print("Ingrese el número de empleados: ");
        int n = scanner.nextInt();

        // 4. Validamos que el número de empleados sea positivo
        if (n <= 0) {
            System.out.println("El número de empleados debe ser mayor que 0.");
            return; // Terminamos el programa si no es válido
        }

        // 5. Leemos los sueldos de cada empleado
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double sueldo = scanner.nextDouble();

            // 6. Validamos que el sueldo esté entre $100 y $500
            if (sueldo < 100 || sueldo > 500) {
                System.out.println("El sueldo debe estar entre $100 y $500. Intente nuevamente.");
                i--; // Repetimos la iteración para el mismo empleado
                continue;
            }

            // 7. Clasificamos al empleado según su sueldo
            if (sueldo <= 300) {
                empleados100a300++;
            } else {
                empleadosMas300++;
            }

            // 8. Sumamos el sueldo al gasto total
            gastoTotal += sueldo;
        }

        // 9. Mostramos los resultados
        System.out.println("\nResultados:");
        System.out.println("Empleados que cobran entre $100 y $300: " + empleados100a300);
        System.out.println("Empleados que cobran más de $300: " + empleadosMas300);
        System.out.println("Gasto total en sueldos: $" + gastoTotal);

        // 10. Cerramos el Scanner
        scanner.close();
    }

    }

