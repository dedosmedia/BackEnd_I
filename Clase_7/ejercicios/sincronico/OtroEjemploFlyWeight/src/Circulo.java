public class Circulo {
    //El color NO lo cambio en las diferentes instancias
    private String color;

    //El radio y tamano si... por eso tengo sus getters y setters
    private double radio;
    private String tamano;


    public Circulo(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void dibujar(){
        System.out.println("Dibujamos (reutilizamos un objeto ya creado) de color: "+color+ " y radio: "+radio);
    }
}
