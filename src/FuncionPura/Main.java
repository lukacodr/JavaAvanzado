package FuncionPura;
// No tiene efectos secundarios: Una función pura no modifica ningún estado externo ni tiene efectos secundarios
// observables fuera de la función. Esto significa que no altera variables globales, no realiza operaciones de
// entrada o salida (E/S), no realiza cambios en archivos, bases de datos u otros recursos externos.

// Produce el mismo resultado para los mismos argumentos: Una función pura siempre devuelve el mismo resultado
// cuando se le pasan los mismos argumentos. Esto implica que no depende de variables mutables o estados cambiantes,
// sino únicamente de los valores de entrada.

public class Main {

    public static void main(String[] args){

        int result = suma(1, 2);
        int result2 = suma(1, 2);
        System.out.println(result + " " + result2);
    }
    public static int suma(int a, int b) {
        return a + b;
    }

}
