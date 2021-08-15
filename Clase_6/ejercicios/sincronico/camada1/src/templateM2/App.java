package templateM2;

public class App {
    public static void main(String[] args) {
        CajeroAutomatico ca = new CajeroAutomatico("AB5000", 3000, 1);
        System.out.println("-----------------------------------");
        ca.procesar("AB5000", 1000, 2);
        System.out.println("-----------------------------------");

        Cajero Agus = new Cajero("AC4000",5000,1);
        Agus.procesar("AC4000",3000,2);
    }
}
