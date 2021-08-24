import java.util.ArrayList;
import java.util.List;

public class Ejecutable {

    private static final String colores[]={"Rojo", "Azul", "Verde", "Negro"};

    public static void main(String[] args) {

        List<Circulo> lista = new ArrayList<>();

        Circulo circulo1 = FlyWeightFactory.obtenerCirculo("Azul");
        Circulo circulo2 = FlyWeightFactory.obtenerCirculo("Rojo");
        Circulo circulo3 = FlyWeightFactory.obtenerCirculo("Verde");
        Circulo circulo4 = FlyWeightFactory.obtenerCirculo("Rojo");
        Circulo circulo5 = FlyWeightFactory.obtenerCirculo("Azul");
        Circulo circulo6 = FlyWeightFactory.obtenerCirculo("Verde");

        circulo1.setRadio(10);
        circulo1.dibujar();

        circulo2.setRadio(20);
        circulo2.dibujar();

        circulo3.setRadio(30);
        circulo3.dibujar();

        circulo4.setRadio(40);
        circulo4.dibujar();

        circulo5.setRadio(50);
        circulo5.dibujar();

        circulo6.setRadio(60);
        circulo6.dibujar();




    }
}
