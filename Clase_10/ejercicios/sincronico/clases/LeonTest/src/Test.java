import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {

    private static final Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Leon leon = new Leon();
        leon.setEdad(4);
        leon.setNombre("Simba");
        leon.setEsAlfa(true);
        leon.correr();
        try {
            leon.esMayorA10();
        } catch (Exception e) {
            logger.error("La edad del leon " + leon.getNombre() + " es incorrecta", e);
        }

        Leon leon2 = new Leon();
        leon2.setNombre("Bom");
        leon2.setEsAlfa(false);
        leon2.setEdad(-1);

        leon2.correr();
        try {
            leon2.esMayorA10();
        } catch (Exception e) {
            logger.error("La edad del leon " + leon2.getNombre() + " es incorrecta", e);
        }


        Tigre tigre = new Tigre();
        tigre.setNombre("Tito");
        tigre.setEdad(8);
        tigre.correr();
        try {
            tigre.esMayorA10();
        } catch (Exception e) {
            logger.error("La edad del tigre " + tigre.getNombre() + " es incorrecta", e);
        }

        Tigre tigre2 = new Tigre();
        tigre2.setNombre("Pepe");
        tigre.setEdad(-2);
        try {
            tigre2.esMayorA10();
        } catch (Exception e) {
            logger.error("La edad del tigre " + tigre2.getNombre() + " es incorrecta", e);
        }
        tigre2.correr();



    }

}
