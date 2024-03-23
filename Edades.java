/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edades;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USUARIO
 */class Persona {
    int edad;

    public Persona( int edad) {
        this.edad = edad;
    }

    
}
public class Edades {

     public static void main(String[] args) {
    int[] lista={15,17,18,20,21};
        int sumaMayor = 0;
        int sumaMenor = 0;
        int cantidadMayores = 0;
        int cantidadMenores = 0;
        double promedioMayor = 0;
        double promedioMenor = 0;
        for(int i=0;i<lista.length; i++){
            switch(lista[i]>=18 ?1 :0){
                case 0:
                    sumaMenor=+lista[i];
                    cantidadMenores++;
                    break; 
                case 1:
                    sumaMayor=+lista[i];
                    cantidadMayores++;
            }
           
            
        }
         double promedioMayores = sumaMayor / cantidadMayores;

        double promedioMenores = sumaMenor / cantidadMenores;
        System.out.println("el promedio es: " + promedioMayores);
        System.out.println("el promedio es: " + promedioMenores);
    }
}
}
