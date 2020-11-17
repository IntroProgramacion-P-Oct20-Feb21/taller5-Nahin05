/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
/**
 *
 * @author Usuario
 */
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio1 {
    //1. Inicio
    public static void main(String[] args) {
        //2. Declaro las variables
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
         //3. kilovatioHora, d[0, n]
         double kilovatioHora;
         //4. valorConsumido, i[0, n]
         int valorConsumido ;
         //5. valorTotal, d[0, n]
         double valorTotal;
         //6. edad, i[0, n]
         int edad;
         //7. descuento, d[0, n]
         double descuento;
         //8. valorPorcentaje, i[0, n]
         int valorPorcentaje = (10);
         //9. pido datos por teclado - entradas
         //10. Escribir "Ingrese el valor de costo del kilovatio por hora" 
         System.out.println("Ingrese el valor de costo del kilovatio por hora");
         //11. leer kilovatioHora
         kilovatioHora=entrada.nextDouble();
         //12.Escribir "Ingrese los kilovatios consumidos en el mes"
         System.out.println("Ingrese los kilovatios consumidos en el mes");
         //13. leer valorConsumido
         valorConsumido=entrada.nextInt();
         //14.Escribir "Ingrese la edad del cliente"
         System.out.println("Ingrese la edad del cliente");
         //15. leer edad
         edad=entrada.nextInt();
         //16. proceso
         valorTotal = kilovatioHora * valorConsumido ;
         if (edad > 65) {
             descuento = (valorTotal * valorPorcentaje)/100 ;
             valorTotal = valorTotal - descuento ;
         }
         System.out.println ("El costo total es: " + valorTotal);
         //17. Fin
    }
    
}
