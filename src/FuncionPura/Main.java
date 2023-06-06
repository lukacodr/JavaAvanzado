package FuncionPura;
// las funciones puras son aquellas que se tomaron de lenguajes
// clasicos y se aplicarion a java
// Para ser puras deben hacer exactamente lo que dicen
// si dice suma tiene que sumar y nada mas. Debe devolver el
//valor siempre acorde a los parametros de entrada

public class Main {

    public static void main(String[] args){

        int result = suma(1, 2);
        int result2 = suma(1, 2);
        System.out.println(result + " " + result2);
    }
    public static void suma(int a, int b) {
        return a + b;
    }
//-57
}
