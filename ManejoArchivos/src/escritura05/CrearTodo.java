/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import escritura04.AlmacenarDatos;
import java.util.Scanner;

/**
 *
 * @author Sexxxrvio
 */
public class CrearTodo {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        String nombre = "";
        boolean bandera = true;
        while (bandera) {

            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese la marca del vehiculo");
            String marca = entrada.nextLine();
            System.out.println("Ingrese la placa");
            String placa = entrada.nextLine();
            String mayus = placa.toUpperCase();

            cadenaFinal = String.format("%s %s %s %s %s \n", cadenaFinal,
                    nombre,
                    cedula,
                    marca,
                    mayus);

            AlmacenarDatos.agregarRegistro(cadenaFinal, cedula);
            String inicial = mayus.substring(0, 1);

            if (inicial.equals("G")) {
                AlmacenarPlacas.guayas(cadenaFinal);
            } else {
                if (inicial.equals("P")) {
                    AlmacenarPlacas.pichincha(cadenaFinal);
                } else {
                    if (inicial.equals("L")) {
                        AlmacenarPlacas.loja(cadenaFinal);
                    } else {
                        AlmacenarPlacas.varios(cadenaFinal);
                    }
                }
            }
            cadenaFinal = "";

            System.out.println("Ingrese s para continuar");
            String opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = true;
            } else {
                bandera = false;
            }
        }
    }
}
