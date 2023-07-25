package PatronesDeDiseño.PatronesCreacionales.Singleton;

public class Singleton {
    private Singleton singleton;
    int contador;

    public static Singleton getInstance() {
        return new Singleton();
    }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
//min8:::
    ////

}
