package PatronesDeDiseño.PatronesCreacionales.Singleton;

public class Main {
    public static void main(String []args) {
        Singleton singleton = singleton.getInstance();
        singleton.setContador(15);
        System.out.println(singleton.getContador());
        System.out.println(singleton);

        Singleton singleton2 = singleton.getInstance();
        singleton2.setContador(10);
        System.out.println(singleton2.getContador());
        System.out.println(singleton2);


    }
}
