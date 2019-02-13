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
public class Dispensador50 implements Dispensador{
    
    private Dispensador siguiente;

    @Override
    public void setSiguiente(Dispensador dis) {
        this.siguiente=dis;
    }

    @Override
    public void Dispensar(Cantidad can) {
        
        if(can.GetCantidad()>= 50000){
            int num=can.GetCantidad()/50000;
            int residuo=can.GetCantidad()%50000;
            
            System.out.println("Dispensar "+num+ " billetes de $50.000");
            
            if(residuo!=0)this.siguiente.Dispensar(new Cantidad(residuo));
            
        }else{
            this.siguiente.Dispensar(can);
        }
    }
    
}
