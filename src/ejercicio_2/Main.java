/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;
import java.util.Scanner;

/**
 *
 * @author Rodri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
       Veterinaria veterinaria = new Veterinaria();
       
       
       
        System.out.println("Desea ingresar un cliente? (Y/N)");
        String crearCliente = sc.next();
        while(crearCliente.equals("y")){
            System.out.println("Ingrese Número de cliente");
            int id = sc.nextInt();
            System.out.println("Ingrese Nombre del cliente");
            String nombreCliente = sc.next();
            System.out.println("Ingrese Número de años de antigüedad");
            int antiguedad = sc.nextInt();
            System.out.println("Ingrese Nombre de la mascota");
            String nombreMascota = sc.next();
            System.out.println("Ingrese edad de la mascota");
            int edadMascota = sc.nextInt();
         Mascota m = new Mascota(nombreMascota, edadMascota);   
        
            Cliente c = new Cliente(id,nombreCliente,antiguedad,m);
            veterinaria.addCliente(c);
            
            

            
            System.out.println("Desea ingresar cliente? (Y/N)");
            crearCliente = sc.next();
        }
        
        System.out.println("Clientes antiguos y promedio de edades de mascotas:");
        System.out.println("Cantidad de clientes con antiguedad mayor a 5 años: " + veterinaria.cantClientes());
        System.out.println("Promedio de Edades de Mascotas: " + veterinaria.promEdadMascotas());
        

    }
    
}
