/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
/**
 *
 * @author Usuario
 */
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio2 {
    //1. Inicio
    public static void main(String[] args) {
        //2. Declaro las variables
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
        //3.costo, d[0, n]
        double costo;
        //4.cantidad, i[0, n]
        int cantidad;
        //5.precioUnitario, d[0,n]
        double precioUnitario;
        //6.valorDescuento, i[0, n]
        int valorDescuento = (15);
        //7.descuento
        double descuento;
        //pido datos por teclado - entradas
        //8.Escribir "Ingrese el costo por unidad"
        System.out.println("Ingrese el costo por unidad");
        //9.Leer precioUnitario
        precioUnitario=entrada.nextDouble();
        //10.Escribir "Ingrese el numero de unidades"
        System.out.println("Ingrese el numero de unidades");
        //11.Leer cantidad
        cantidad=entrada.nextInt();
        //12.proceso
        costo = (precioUnitario * cantidad);
        if (cantidad > 50) {
            descuento = (costo*valorDescuento)/100;
            costo = costo - valorDescuento;
        }
        System.out.println("El costo con 15% de descuento: " + costo);
        //13.Fin
    }
    
}
