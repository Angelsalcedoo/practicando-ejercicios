import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("ingrese la tercera nota: ");
        int nota3 = scanner.nextInt();

        int promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println(promedio+":Promocionado. ");
            
        }else if (promedio  >= 4 && promedio < 7 ) {
            System.out.println(promedio+":Regular. ");
            
        }else if (promedio  < 4 ) {
            System.out.println(promedio+":Reprobado");
            
        }
        scanner.close();
    }
}
