/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Sexxxrvio
 */
public class Datos {

    static Scanner entrada = new Scanner("data/datosDos.txt");

    public static void archivoDos() {
        double suma = 0;
        double prom = 0;
        double contador = 0;
        try {
            while (entrada.hasNext()) {

                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);

                System.out.println(linea_partes.get(3));

                String linea2 = linea_partes.get(3);
                double variableC = Double.parseDouble(linea2);
                suma = suma + variableC;
                contador = contador + 1;

            }
            prom = suma / contador;
            
            entrada.close();
        } catch (Exception e) {
            System.err.println("Error al leer el archivo");
            System.exit(1);
        }
        System.out.printf("El promedio es: %.2f", prom);
    }
}
