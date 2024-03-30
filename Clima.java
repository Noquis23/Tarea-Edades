/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.clima;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author USUARIO
 */
public class Clima {
    public static void main(String[] args) {
        Map<String, RangoTemperatura> rangosTemperatura = inicializarRangosTemperatura();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora del día (mañana, tarde, noche): ");
        String momentoDelDia = scanner.nextLine().toLowerCase();

        if (rangosTemperatura.containsKey(momentoDelDia)) {
            System.out.print("Ingrese la temperatura actual: ");
            int temperatura = scanner.nextInt();
            evaluarTemperatura(temperatura, rangosTemperatura.get(momentoDelDia));
        } else {
            System.out.println("Hora del día inválida. Por favor ingrese 'mañana', 'tarde' o 'noche'.");
        }
        
        scanner.close();
    }

    private static Map<String, RangoTemperatura> inicializarRangosTemperatura() {
        Map<String, RangoTemperatura> rangosTemperatura = new HashMap<>();
        rangosTemperatura.put("mañana", new RangoTemperatura(10, 20, 25));
        rangosTemperatura.put("tarde", new RangoTemperatura(20, 30, 35));
        rangosTemperatura.put("noche", new RangoTemperatura(10, 15, 20));
        return rangosTemperatura;
    }

    private static void evaluarTemperatura(int temperatura, RangoTemperatura rango) {
        if (temperatura < rango.getLimiteInferiorNormal()) {
            System.out.println("La temperatura es MUY BUENA.");
        } else if (temperatura < rango.getLimiteSuperiorNormal()) {
            System.out.println("La temperatura es NORMAL.");
        } else if (temperatura < rango.getLimiteInferiorPeligroso()) {
            System.out.println("La temperatura es PELIGROSA.");
        } else {
            System.out.println("La temperatura es EXTREMADAMENTE PELIGROSA.");
        }
    }
}

class RangoTemperatura {
    private final int limiteInferiorNormal;
    private final int limiteSuperiorNormal;
    private final int limiteInferiorPeligroso;

    public RangoTemperatura(int limiteInferiorNormal, int limiteSuperiorNormal, int limiteInferiorPeligroso) {
        this.limiteInferiorNormal = limiteInferiorNormal;
        this.limiteSuperiorNormal = limiteSuperiorNormal;
        this.limiteInferiorPeligroso = limiteInferiorPeligroso;
    }

    public int getLimiteInferiorNormal() {
        return limiteInferiorNormal;
    }

    public int getLimiteSuperiorNormal() {
        return limiteSuperiorNormal;
    }

    public int getLimiteInferiorPeligroso() {
        return limiteInferiorPeligroso;
    }
}
