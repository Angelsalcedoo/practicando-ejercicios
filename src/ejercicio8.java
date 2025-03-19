import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);

        System.out.println("ingrse la cantidad de preguntas: ");
        int totalPreguntas = Scanner.nextInt();
        System.out.println("ingrese la cantidad de respuestas correctas: ");
        int respuestasCorrectas = Scanner.nextInt();

        double porcentaje = (respuestasCorrectas * 100.0)/ totalPreguntas;

        if (	porcentaje >= 90) {
            System.out.println("nivel maximo: "+ porcentaje+"%");
            
        }else if (porcentaje >= 75 && porcentaje < 90 ) {
            System.out.println("nivel medio: "+ porcentaje+"%");
            
        }else if (porcentaje >= 50 && porcentaje <75 ) {
            System.out.println("Nivel regular: " +porcentaje+"%");
            
        }else if (porcentaje < 50) {
            System.out.println("fuera de nivel : "+porcentaje+"%");
            
        }
        Scanner.close();
    } 
}
