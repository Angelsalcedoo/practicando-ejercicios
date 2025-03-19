public class ejercicio2 {
    public static void main(String[] args) {

        int PrimeraNota = 2;
        System.out.println("ingresando primera nota del alumno:  " + PrimeraNota);

        int SegundaNota = 3;
        System.out.println("ingresasndo segunda nota del alumno:  " + SegundaNota);

        int TerceraNota = 3;
        System.out.println("ingresando la tercera nota del alumno : " + TerceraNota);

        int promedio = (PrimeraNota + SegundaNota + TerceraNota);
        System.out.println("promedio : " + promedio);
        if (promedio >= 7) {
            System.out.println(" promorcionado ");

        }

    }
}
