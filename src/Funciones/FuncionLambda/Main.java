package Funciones.FuncionLambda;

//Una función lambda en Java es una característica introducida en Java 8 que permite crear y utilizar funciones anónimas
// de forma más concisa y expresiva. Las funciones lambda son especialmente útiles en la programación funcional y en el
// uso de interfaces funcionales. Se define utilizando una sintaxis especial que permite especificar una expresión de
// función de una manera más compacta. Se compone de los siguientes elementos:

//1- Parámetros: Son los valores de entrada de la función lambda, se especifican entre paréntesis y separados por comas.
// Si la función no tiene parámetros, se utilizan paréntesis vacíos.
//
//2- Flecha ->: Se utiliza para separar los parámetros de la función lambda del cuerpo de la función.
//
//3- Cuerpo: Es la implementación de la función lambda, que puede ser una expresión simple o un bloque de código
// más complejo.

interface Saludo {
    void saludar();
}

public class Main {
    public static void main(String[] args) {
        Saludo saludo = () -> System.out.println("¡Hola, mundo!");
        saludo.saludar();
    }
}
// En este ejemplo, se define una interfaz funcional Saludo que declara un método saludar() sin parámetros. Luego, se
// utiliza una función lambda para implementar ese método en una sola línea. La función lambda () -> System.out.println("¡Hola, mundo!")
// representa una función que no toma ningún argumento y simplemente imprime el mensaje "¡Hola, mundo!" en la consola.
//
// La función lambda se asigna a la variable saludo de tipo Saludo, y se llama al método saludar() a través de esa
// variable.
// Las funciones lambda ofrecen una forma más concisa y legible de implementar interfaces funcionales en comparación
// con las clases anónimas tradicionales. Además, permiten el uso de técnicas de programación funcional, como el paso
// de funciones como argumentos o el uso de funciones como valores de retorno en métodos.