import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        
        
        
         Scanner scanner = new Scanner(System.in);

        // 2. Solicitamos y leemos el primer nombre
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();

        // 3. Solicitamos y leemos el segundo nombre
        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        // 4. Cerramos el Scanner
        scanner.close();

        // 5. Usamos compareToIgnoreCase para comparar los nombres
        int comparacion = nombre1.compareToIgnoreCase(nombre2);

        // 6. Mostramos los nombres ordenados alfabéticamente
        System.out.println("\nNombres ordenados alfabéticamente:");
        if (comparacion < 0) {
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else if (comparacion > 0) {
            System.out.println(nombre2);
            System.out.println(nombre1);
        } else {
            System.out.println("Los nombres son iguales: " + nombre1);
        }
    }

    
}
