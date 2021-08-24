import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    private static final Map<String, Computadora> computadores =new HashMap<>();

    public Computadora getComputer(int ram, int disco){
        String clave="key: "+ram+ ":" +disco;
        System.out.println(clave);
        if (!computadores.containsKey(clave)){
            computadores.put(clave, new Computadora(ram, disco));
            System.out.println("PC creada como objeto nuevo... una instancia en memoria...");
            return computadores.get(clave);
        }
        System.out.println("PC obtenida de memoria... no se ha creado un objeto nuevo");
        return computadores.get(clave);
    }
}