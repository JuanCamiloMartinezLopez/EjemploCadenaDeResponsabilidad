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
public interface Dispensador {
    
    void setSiguiente(Dispensador dis);
    
    void Dispensar(Cantidad can);
    
}
