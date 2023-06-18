package Funciones.FuncionMap;

import java.util.ArrayList;
import java.util.stream.Stream;

//La funcion .map aplica lo que yo le indico sobre cada elemento que recibo de un string
public class Main {

    public static void main(String[] args)  {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");

        Stream<String> valores = nombres.stream().map(x -> x.toUpperCase());
        valores.forEach(x -> System.out.println(x));
       



    }
}
