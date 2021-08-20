
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    private static final Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        ListaPromedio listaPromedioMayorA5 = null;
        ListaPromedio listaPromedioMayorA10 = null;
        ListaPromedio listaPromedioVacia = null;
        try {
            listaPromedioMayorA5 = new ListaPromedio(Arrays.asList(1, 2, 3, 4, 5, 6));
            listaPromedioMayorA10 = new ListaPromedio(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
            listaPromedioVacia = new ListaPromedio(new ArrayList<>());
        } catch (Exception e) {
            logger.error("La lista es igual a cero ", e);
        }
    }
}
