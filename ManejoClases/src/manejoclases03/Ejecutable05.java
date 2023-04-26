/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Ejecutable05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale (Locale.US);
        Hospital miHospital = new Hospital();
        // Dar valores a los atributos
        // los valores ingresados por teclado 
        String nombre;
        int numeroCamas;
        double presupuesto;
        
        System.out.println("Ingrese el nombre del hospital");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el numero de camas");
        numeroCamas = entrada.nextInt();
        System.out.println("Ingrese el presupuesto");
        presupuesto = entrada.nextDouble();
        
        miHospital.establecerNombre(nombre); 
        miHospital.establecerNumeroCamas(numeroCamas);
        miHospital.establecerPresupuesto(presupuesto);
        
        
        System.out.printf("%s - %d - %.1f\n", miHospital.obtenerNombre(),
                miHospital.obtenerNumeroCamas(), miHospital.obtenerPresupuesto());
    }
    
}
