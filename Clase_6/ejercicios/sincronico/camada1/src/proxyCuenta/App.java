package proxyCuenta;

import proxyCuenta.inter.ICuenta;
import proxyCuenta.inter.impl.CuentaBancoAImpl;
import Proxy.model.Cuenta;
import proxyCuenta.inter.impl.CuentaBancoBImpl;
import proxyCuenta.proxy.CuentaProxy;

public class App {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1,"Agustín",3000);

        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c,500);
        c = cuentaProxy.retirarDinero(c,200);
        cuentaProxy.mostrarSaldo(c);

    }
}
