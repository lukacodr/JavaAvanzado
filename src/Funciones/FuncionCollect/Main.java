package Funciones.FuncionCollect;
// la función .collect() se utiliza en el contexto de la programación funcional y las operaciones de transmisión (stream) para acumular elementos de un flujo (stream) en una colección o estructura de datos específica.
// La función .collect() toma un colector (Collector) como argumento y realiza una operación de reducción terminal en el flujo (stream) original, acumulando los elementos en una colección mutable o aplicando otras operaciones personalizadas.
// Un colector (Collector) define cómo se deben acumular los elementos y en qué estructura de datos se almacenarán. Java proporciona varios colectores predefinidos en la clase Collectors que cubren casos comunes, como crear una lista, un conjunto, un mapa, concatenar cadenas, calcular sumas, etc.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class Main {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            List<Integer> collectedList = numbers.stream()
                    .filter(n -> n % 2 == 0) // Filtrar números pares
                    .collect(Collectors.toList()); // Acumular en una lista

            System.out.println(collectedList); // Imprimir la lista resultante
        }
    }
        // En este ejemplo, se crea un flujo (stream) de números y se aplica un filtro para seleccionar solo los números pares. Luego, la función .collect() se utiliza con el colector Collectors.toList() para acumular los números filtrados en una lista mutable. Finalmente, se imprime la lista resultante.

        // La función .collect() es una operación de reducción terminal, lo que significa que produce un resultado final y termina el flujo (stream). Proporciona una forma poderosa y flexible de acumular elementos en una colección o realizar otras operaciones personalizadas en los flujos (streams) de Java.
