/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 560340.43;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.1f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
        // un objeto de tipo hospital 
        
        HospitalDos hospitalDos = new HospitalDos();
        
        hospitalDos.nombre = "Manuel Ignacio";
        hospitalDos.numeroCamas = 154;
        hospitalDos.presupuesto = 4703250.10;
        
        System.out.printf("%s - %d - %.1f\n", hospitalDos.nombre,
                hospitalDos.numeroCamas, hospitalDos.presupuesto);
        
    }
}
