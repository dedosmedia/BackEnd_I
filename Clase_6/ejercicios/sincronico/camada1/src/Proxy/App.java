package Proxy;

import Proxy.interf.ICuenta;
import Proxy.interf.impl.CuentaBancoAImpl;
import Proxy.model.Cuenta;
import Proxy.proxy.CuentaProxy;

public class App {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1,"William",1000);

        ICuenta cuentaProxy = new CuentaProxy();

        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c,3000);
        c = cuentaProxy.retirarDinero(c,1200);
        cuentaProxy.mostrarSaldo(c);
    }
}
