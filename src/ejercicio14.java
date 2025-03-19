public class ejercicio14 {
    public static void main(String[] args) {
         // 1. Definimos el número base de la tabla (5)
         int numero = 5;

         // 2. Mostramos un mensaje inicial
         System.out.println("Tabla de multiplicar del " + numero + " (del 5 al 50):");
 
         // 3. Usamos un bucle for para iterar del 1 al 10
         for (int i = 1; i <= 10; i++) {
             // 4. Calculamos el resultado de la multiplicación
             int resultado = numero * i;
 
             // 5. Mostramos la operación y el resultado
             System.out.println(numero + " x " + i + " = " + resultado);
         }
     }
 
    }

