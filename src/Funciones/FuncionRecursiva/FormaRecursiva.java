//La recursion consiste en que una funcion se va a llamar a si misma
// la vamos a usar en casos que haga mas claro al algoritmo
package Funciones.FuncionRecursiva;

public class FormaRecursiva {

    public static void main(String[] args) {
        //  1 + 2 + 3 + 4 + 5 => 15
        System.out.println(suma(5));
    }
    public static int sumaRecursiva(int numero) {
        return numero + sumaRecursiva(numero -1);
}

    public static int suma(int max) {

        int resultado = 0;
        for (int i = 0; i <= max; i++) {
            resultado = resultado + i;
        }

        return resultado;
    }
}
//min12