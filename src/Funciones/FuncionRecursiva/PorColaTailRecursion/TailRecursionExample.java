package Funciones.FuncionRecursiva.PorColaTailRecursion;
//Una Funcion Recursiva de cola se llama asi porque el ultimo paso que se realiza es invocar a la funcion
//es un tipo de recursión donde la llamada recursiva se realiza al final de la función, después de realizar
//todas las operaciones necesarias. Esto significa que no hay operaciones adicionales después de la llamada recursiva.
//En esencia, la recursión por cola se asemeja a un bucle iterativo.

public class TailRecursionExample {
    public static int factorial(int n) {
        return factorialHelper(n, 1);
    }

    private static int factorialHelper(int n, int accumulator) {
        if (n == 0) {
            return accumulator;
        }

        return factorialHelper(n - 1, n * accumulator);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("El factorial de " + n + " es: " + result);
    }
}
//En este ejemplo, la función factorial() llama a la función auxiliar factorialHelper() pasando el número n
//y un acumulador inicializado en 1. La función factorialHelper() realiza los cálculos necesarios para calcular
//el factorial y se llama a sí misma con n - 1 y n * accumulator. La llamada recursiva es la última instrucción
//dentro de la función y no hay operaciones adicionales después de ella.

//La recursión por cola es especialmente útil en casos donde se necesita una recursión muy profunda,
//ya que no se acumula una pila de llamadas y no hay riesgo de desbordamiento de la pila.
//Además, algunos compiladores o intérpretes pueden optimizar la recursión por cola para que ocupe
//un espacio constante en la pila de ejecución.
