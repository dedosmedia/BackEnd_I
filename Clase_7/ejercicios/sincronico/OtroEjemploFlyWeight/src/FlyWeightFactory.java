import java.util.HashMap;

public class FlyWeightFactory {

    private static final HashMap<String, Circulo> circuloMap= new HashMap<>();

    //la propiedad color es la propiedad compartida en los objetos
    public static Circulo obtenerCirculo(String color){
        Circulo circulo=circuloMap.get(color);
        if(circulo==null){
            circulo=new Circulo(color);
            circuloMap.put(color, circulo);
            System.out.println("HEMOS CREADO UN CIRCULO DE COLOR: "+color);
        }
        return circulo;

    }
}
