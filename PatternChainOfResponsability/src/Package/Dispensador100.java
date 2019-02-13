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
public class Dispensador100 implements Dispensador{
    
    private Dispensador siguiente;

    @Override
    public void setSiguiente(Dispensador dis) {
        this.siguiente=dis;
    }

    @Override
    public void Dispensar(Cantidad can) {
        
        if(can.GetCantidad()>= 100000){
            int num=can.GetCantidad()/100000;
            int residuo=can.GetCantidad()%100000;
            
            System.out.println("Dispensar "+num+ " billetes de $100.000");
            
            if(residuo!=0)this.siguiente.Dispensar(new Cantidad(residuo));
            
        }else{
            this.siguiente.Dispensar(can);
        }
    }
    
}
