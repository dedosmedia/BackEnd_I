package templateM;

public abstract class CuentaBancaria {
    private String cuenta;
    private int saldo = 0;

    private void setCuenta(String c){
        this.cuenta = c;
    }

    private void depositar(int i){
        System.out.println("Depositando...");
        this.saldo += i;
    }

    private void retirar(int i){
        System.out.println("Retirando...");
        if(i<=this.saldo-100){
            this.saldo -= i;
        }else{
            System.out.println("No se puede retirar ese monto");
        }
    }

    private void consultarSaldo(){
        System.out.println("El saldo es:  " + this.saldo);
    }

    protected void auditoria(){
        System.out.println("Se ha procesado la cuenta " + this.cuenta);
    }

    public abstract void saludar();

    public void procesar(String c, int i, int t){
        saludar();
        setCuenta(c);
        switch (t){
            case 1:
                depositar(i);
                break;
            case 2:
                retirar(i);
                break;
            default:
                System.out.println("Opción no válida");
        }
        consultarSaldo();
        auditoria();
    }

}
