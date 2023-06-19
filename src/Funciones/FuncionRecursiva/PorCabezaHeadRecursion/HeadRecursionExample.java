package Funciones.FuncionRecursiva.PorCabezaHeadRecursion;
//Se dice que una funcion recursiva es por cabeza cuando lo primero que hacemos es invocar a la funcion recursiva


    public class HeadRecursionExample {
        public static int sum(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n + sum(n - 1);
            }
        }
//En este ejemplo, la función sum() realiza la llamada recursiva antes de realizar la suma.
//Si el valor de n es 1, se devuelve 1 como caso base. De lo contrario, se suma n con el resultado de sum(n - 1).
        public static void main(String[] args) {
            int n = 5;
            int result = sum(n);
            System.out.println("La suma de los números de 1 a " + n + " es: " + result);
        }
    }


