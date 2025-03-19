import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el sueldo del operario: ");
        int sueldo = scanner.nextInt();
        System.out.println("ingrese los años de antiguedad del operario: ");
        int añosDeAntiguedad = scanner.nextInt();

        if (sueldo < 500) {
           if (añosDeAntiguedad >= 10) {
            sueldo *= 1.20;
            System.out.println("se le aumento el 20%. sueldo a pagar: "+ sueldo);

            
           }else if (sueldo < 500 && añosDeAntiguedad < 10) {
            sueldo *= 1.05;
            System.out.println("se le aumento 5% .sueldo a pagar:"+ sueldo);
            
           }else if (sueldo >= 500) {
            System.out.println("el sueldo no tiene cambios. sueldo a pagar:"+ sueldo);
            
           }
            
           }
           scanner.close();
        }
        }
        

