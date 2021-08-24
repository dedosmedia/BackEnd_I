public class App {
    public static void main(String[] args) {
        ComputerFactory computer=new ComputerFactory();

        Computadora mac1=computer.getComputer(16, 500);
        Computadora windows=computer.getComputer(2, 256);
        Computadora mac2= computer.getComputer(16, 500);
        Computadora mac3= computer.getComputer(16, 500);
        Computadora mac4= computer.getComputer(16, 500);
        Computadora mac5= computer.getComputer(16, 500);
        Computadora mac6= computer.getComputer(17, 500);

        System.out.println(mac2.toString());
        System.out.println(mac1.toString());
        System.out.println(windows.toString());

    }
}
