/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author CAMILO
 */
public class Dispensador10 implements Dispensador {

    private Dispensador siguiente;

    @Override
    public void setSiguiente(Dispensador dis) {
        this.siguiente = dis;
    }

    @Override
    public void Dispensar(Cantidad can) {

        if (can.GetCantidad() >= 10000) {
            int num = can.GetCantidad() / 10000;
            int residuo = can.GetCantidad() % 10000;

            System.out.println("Dispensar " + num + " billetes de $10.000");

            if (residuo != 0) {
                System.out.println("El cajero no maneja una denominacion menor de billete para completar el retiro de los $" + residuo);
            }

        } else {
            
            System.out.println("El cajero no maneja una denominacion menor de billete para completar el retiro de los $" + can.GetCantidad());
        }
    }

}
