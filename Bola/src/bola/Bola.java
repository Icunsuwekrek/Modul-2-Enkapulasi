/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;

/**
 *
 * @author ichsan sani al azmi
 */
public class Bola {
private double jarijari;

public double setjarijari(double jari){
        return this.jarijari = jari;
}
public double showDiameter(){
    return jarijari * 2;
}
public double showluaspermukaan(){
    return  4 * Math.PI * Math.pow (jarijari,2  );
}
public double showVolume(){
    return 4/3 * Math.PI * Math.pow(jarijari,3);
}
public void cetak(){
    System.out.println("Diameter\t : " + showDiameter());
    System.out.println("Luas permukaan\t : " + showluaspermukaan());
    System.out.println("Volume\t : " + showVolume());
}
}


