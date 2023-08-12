package Funciones.FuncionFilter;

//La función .filter en Java se utiliza para filtrar elementos de una colección o secuencia de datos según un criterio
//específico. Permite crear una nueva secuencia de elementos que cumplan con ciertas condiciones definidas
//por un predicado.
//La función .filter está disponible en las secuencias de datos proporcionadas por la interfaz Stream en Java 8 y
//versiones posteriores. Toma como argumento un objeto Predicate, que es una interfaz funcional que define una
//condición que debe cumplir cada elemento para ser incluido en el resultado filtrado.
//El flujo de trabajo típico al utilizar .filter implica encadenarla con otras operaciones de secuencia, como .map,
//.forEach, .collect, entre otras, para realizar transformaciones adicionales o realizar acciones
//en los elementos filtrados.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // Imprime [2, 4, 6, 8, 10]
    }
}
// En este ejemplo, se utiliza .filter para filtrar solo los números pares de la lista original de números. El predicado
//number -> number % 2 == 0 verifica si un número es divisible por 2 (es decir, si es par) y devuelve true o false en
//consecuencia. Al final, se recopilan los números filtrados en una nueva lista llamada evenNumbers, que contiene los
//números pares [2, 4, 6, 8, 10].
//En resumen, la función .filter en Java se utiliza para seleccionar elementos de una colección o secuencia de datos
//que cumplan con ciertos criterios definidos por un predicado. Ayuda a simplificar el proceso de filtrado de datos
//en Java de una manera legible y concisa.

//