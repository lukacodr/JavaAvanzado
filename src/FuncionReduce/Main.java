package FuncionReduce;

//La función .reduce() en Java es un método utilizado en las secuencias de elementos (como Stream o List) para reducir
// la secuencia a un solo valor aplicando una operación binaria acumulativa a los elementos sucesivos.

//La sintaxis básica de la función .reduce() es la siguiente:

//T reduce(T identity, BinaryOperator<T> accumulator)

//Aquí, T representa el tipo de datos de los elementos en la secuencia. identity es el valor inicial o identidad que se
// utiliza como primer argumento para el acumulador. El acumulador (accumulator) es una función binaria que se aplica
// a los elementos sucesivos de la secuencia.

//El método .reduce() realiza el siguiente proceso:

//Utiliza el valor identity como el acumulador inicial.
//Aplica el acumulador a los elementos sucesivos de la secuencia, comenzando desde el primer elemento.
//Repite el paso 2 hasta que todos los elementos de la secuencia se hayan procesado.
//Devuelve el resultado final del acumulador.
//Ejemplo para ilustrar cómo funciona .reduce() en Java:

import java.util.Arrays;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            int suma = numeros.stream()
                    .reduce(0, (a, b) -> a + b);

            System.out.println("Suma: " + suma);
        }
    }


//En este ejemplo, tenemos una lista de números [1, 2, 3, 4, 5]. Utilizamos el método .stream() para convertir la lista
//en un flujo de elementos. Luego, usamos .reduce() para sumar todos los elementos de la lista. El valor inicial
//(identity) es 0, y el acumulador es una función lambda (a, b) -> a + b, que suma dos elementos sucesivos.
//El resultado impreso será Suma: 15.
//La función .reduce() también se puede utilizar con otros tipos de operaciones acumulativas, como encontrar el máximo,
//mínimo o concatenar cadenas, entre otros. Simplemente debes proporcionar el acumulador adecuado que implemente
//la operación deseada.