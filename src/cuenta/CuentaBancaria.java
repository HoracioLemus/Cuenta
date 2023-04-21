/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria extends Cuenta {
    public CuentaBancaria(String titular) {
        super(titular);
    }

    public CuentaBancaria(String titular, double cantidad) {
        super(titular, cantidad);
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            setCantidad(getCantidad() + cantidad);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (getCantidad() - cantidad < 0) {
                setCantidad(0);
            } else {
                setCantidad(getCantidad() - cantidad);
            }
        }
    }
}