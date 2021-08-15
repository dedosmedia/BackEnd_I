package templateM;

public class App {
    public static void main(String[] args) {
        CajeroAutomatico ca = new CajeroAutomatico("AA5690",3000,1);
        System.out.println("------------------------------------------------");
        ca.procesar("AA5690",1000,2);
        System.out.println("------------------------------------------------");
        Cajero c = new Cajero("AA5566",5000,1);
        c.procesar("AA5566",1000,2);
    }

}
