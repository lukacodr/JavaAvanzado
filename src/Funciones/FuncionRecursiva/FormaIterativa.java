package Funciones.FuncionRecursiva;

public class FormaIterativa {

    public static void main(String[] args) {
      //  1 + 2 + 3 + 4 + 5 => 15
        System.out.println(suma(5));
    }

    public static int suma(int max) {

        int resultado = 0;
        for (int i = 0; i <= max; i++) {
            resultado = resultado + i;
        }

        return resultado;
    }
}
