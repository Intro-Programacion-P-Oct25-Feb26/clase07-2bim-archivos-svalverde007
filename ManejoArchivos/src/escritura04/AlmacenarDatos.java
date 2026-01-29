/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

import java.util.Formatter;

/**
 *
 * @author Sexxxrvio
 */
public class AlmacenarDatos {
    
     public static void agregarRegistro(String mensaje, String cedula ) {
         String ruta =String.format ("data/"+ cedula +".txt");
         
        try {
            
            Formatter salida = new Formatter(ruta);
            salida.format("%s", mensaje);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }
    }
    
}
