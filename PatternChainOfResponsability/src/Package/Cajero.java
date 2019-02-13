/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.Scanner;

/**
 *
 * @author CAMILO
 */
public class Cajero {
    
    private Dispensador D1;
    
    public Cajero(){
        
        this.D1=new Dispensador100();
        Dispensador D2=new Dispensador50();
        Dispensador D3=new Dispensador20();
        Dispensador D4=new Dispensador10();
        
        D1.setSiguiente(D2);
        D2.setSiguiente(D3);
        D3.setSiguiente(D4);
        
    }
    
    public static void main(String[] args) {
		Cajero cajero = new Cajero();
		while (true) {
			int monto = 0;
			System.out.println("\n\nIngrese la cantidad a dispensar");
			Scanner input = new Scanner(System.in);
			monto = input.nextInt();
			if (monto % 10 != 0) {
				System.out.println("El monto debe ser multiplo de diez");
				return;
			}
			// process the request
                        
			cajero.D1.Dispensar(new Cantidad(monto));
		}

	}
}
