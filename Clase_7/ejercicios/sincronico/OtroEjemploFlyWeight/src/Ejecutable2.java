import java.util.ArrayList;
import java.util.List;

public class Ejecutable2 {

    private static final String colores[]={"Rojo", "Azul", "Verde", "Negro"};

    public static void main(String[] args) {

        List<Circulo> lista = new ArrayList<>();

        Circulo circulo1 = FlyWeightFactory.obtenerCirculo("Azul");
        Circulo circulo2 = FlyWeightFactory.obtenerCirculo("Rojo");
        Circulo circulo3 = FlyWeightFactory.obtenerCirculo("Verde");
        Circulo circulo4 = FlyWeightFactory.obtenerCirculo("Rojo");
        Circulo circulo5 = FlyWeightFactory.obtenerCirculo("Azul");
        Circulo circulo6 = FlyWeightFactory.obtenerCirculo("Verde");

        
        // Seteo el radio y lo dibujo
        circulo1.setRadio(10);
        circulo1.dibujar();

        // Seteo el radio y lo dibujo
        circulo2.setRadio(20);
        circulo2.dibujar();

        // Seteo el radio y lo dibujo
        circulo3.setRadio(30);
        circulo3.dibujar();

        // Seteo el radio y lo dibujo
        circulo4.setRadio(40);
        circulo4.dibujar();

        // Seteo el radio y lo dibujo
        circulo5.setRadio(50);
        circulo5.dibujar();

        // Seteo el radio y lo dibujo
        circulo6.setRadio(60);
        circulo6.dibujar();

        System.out.println("---------------------------------------------");
        System.out.println("Los quiero reutilizar nuevamente con los radios seteados previamente");
        circulo1.dibujar();
        circulo2.dibujar();
        circulo3.dibujar();
        circulo4.dibujar();
        circulo5.dibujar();
        circulo6.dibujar();


        // Para finalizar, podemos mencionar que este patrón es utilizado cuando la optimización de los recursos es algo primordial,
        // ya que elimina la redundancia de objetos con propiedades idénticas.



    }
}
