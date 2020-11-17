/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
/**
 *
 * @author Usuario
 */
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio3 {
    //1. Inicio
    public static void main(String[] args) {
        //2.Declaro las variables
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
        //3.costo, d[0,n]
        double costo;
        //4.marca
        String marca;
        //5.origen,  
        double origen; 
        //6.pais1
        String pais1;
        //6.pais2
        String pais2 = null;
        //6.pais3
        String pais3;
        //6.pais4
        String pais4;
        pais1 = ("Alemania");
        pais2 = ("Japon");
        pais3 = ("Italia");
        pais4 = ("USA");
        //6. valorVenta, [0,n]
        double valorVenta = 0;
        //7.valorDescuento, i[0, n]
        int impuestoAlemania = (20);
        //8.valorDescuento, i[0, n]
        int impuestoJapon = (30);
        //9.valorDescuento, i[0, n]
        int impuestoItalia = (15);
        //10.valorDescuento, i[0, n]
        int impuestoUsa = (8);
        //11.valorAlemania, d[0,n]
        double valorAlemania;
        //11.valorJapon, d[0,n]
        double valorJapon;
        //11.valorItalia, d[0,n]
        double valorItalia;
        //11.valorUsa, d[0,n]
        double valorUsa;
        //11.impuesto
        double impuesto;
        //12. Pedimos los datos por teclado - entrada
        //13. Escribe "Ingrese el precio del auto"
        System.out.println("Ingrese el precio del auto");
        //14. leer costo
        costo=entrada.nextDouble();
        //15. Escribe "Ingrese la marca del auto"
        System.out.println("Ingrese la marca del auto");
        //16. leer marca
        marca=entrada.nextLine();
        //17. Escribe "Ingrese el origen del auto"
        System.out.println("Seleccione el numero del pais de origen \n1."
                + "Alemania\n2.Japon\n3.Italia\n4.USA\n");
        entrada.nextLine();
        //18. leer origen
        origen=entrada.nextDouble();
        //19. proceso
            if (origen == 1) {
               impuestoAlemania=20;
               valorVenta=0;
               impuesto = (impuestoAlemania * costo/100);
               valorVenta = (costo + impuesto);
            System.out.printf ("El impuesto a pagar es: " + impuesto,"El precio"
                + "de venta: "+valorVenta ); 
            }   
            if (origen == 2) {
               impuestoJapon=30;
               valorVenta=0;
               impuesto = (impuestoJapon * costo/100);
               valorVenta = (costo + impuesto);
            System.out.printf ("El impuesto a pagar es: " + impuesto,"El precio"
                + "de venta: "+valorVenta ); 
            }   
            if (origen == 3) {
               impuestoItalia=15;
               valorVenta=0;
               impuesto = (impuestoItalia * costo/100);
               valorVenta = (costo + impuesto);
            System.out.printf ("El impuesto a pagar es: " + impuesto,"El precio"
                + "de venta: "+valorVenta ); 
            }   
            if (origen == 4) {
               impuestoUsa=8;
               valorVenta=0;
               impuesto = (impuestoUsa * costo/100);
               valorVenta = (costo + impuesto);
            System.out.printf ("El impuesto a pagar es: " + impuesto,"El precio"
                + "de venta: "+valorVenta ); 
            }
        //20.Fin
        
          
        
    }
    
}

