import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ingrese un numero  entero positivo: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <=99) {
            System.out.println("el numero tiene dos dijitos. ");
            
        }else if (numero >= 1 && numero <= 9) {
            System.out.println("tiene un digito. ");

            
        }else{
            System.out.println("Error:el numero esta fuera del rango valido! ");
            return;
        }
        scanner.close();

        }
        

    }


