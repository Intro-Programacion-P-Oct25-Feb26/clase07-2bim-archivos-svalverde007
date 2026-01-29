/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author Sexxxrvio
 */
public class AlmacenarPlacas {

    public static void guayas(String placas) {

        try {
            FileOutputStream fos = new FileOutputStream("data/PlacasGuayas.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", placas);
            salida.close();
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public static void pichincha(String placas) {

        try {
            FileOutputStream fos = new FileOutputStream("data/PlacasPichincha.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", placas);
            salida.close();
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public static void loja(String placas) {

        try {
            FileOutputStream fos = new FileOutputStream("data/PlacasLoja.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", placas);
            salida.close();
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public static void varios(String placas) {

        try {
            FileOutputStream fos = new FileOutputStream("data/PlacasVarios.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", placas);
            salida.close();
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }

    }

}
