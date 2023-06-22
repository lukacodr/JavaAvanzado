package Funciones.FuncionRecursiva.Factorial;

public class Main {

    public static void main(String[] args) {
        System.out.println("Factorial iterativa: " + factorial(5));
        System.out.println("Factorial recursiva: " + factorialRecursivo(5));
        System.out.println("Factorial funcional: " + factorialFuncional(5));
    }

    private static String factorialFuncional(int numero) {
        return null;
    }

    public static int factorial ( int numero){
            int resultado = 1;

            for (int i = 1; i <= numero; i++) {
                resultado = resultado * i;
            }

            return resultado;
        }

        public static int factorialRecursivo ( int numero){
            if (numero == 0) {
                return 1;
            }

            return numero * factorialRecursivo(numero - 1);
            //esta funcion es TailRecursion ya que lo ultimo que hago es invocar a la funcion recursiva

        }
    }
