/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

/**
 *
 * @author Rodri
 */
public class Veterinaria {
    private Cliente[] clientes; //creo array clientes de tipo Cliente

    public Veterinaria() {
        clientes = new Cliente[100];
    }

    public void addCliente(Cliente cliente){
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] != null){
            clientes[i]= cliente;
            }
            break;
        }
    }
    
    public int cantClientes(){
        int clientesContados = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i]!= null) {
                clientesContados++;
            }
            else break;
        }
        return clientesContados;
    }
        
    public float promEdadMascotas(){
        float sumaEdadesMascotas = 0f;
        float promEdadesMascotas = 0f;
        for (int i = 0; i <clientes.length; i++) {
            if (clientes[i]!= null) {
                //sumaEdadesMascotas = sumaEdadesMascotas + clientes[i].getMascota().getEdad();
                sumaEdadesMascotas += clientes[i].getMascota().getEdad();
            } 
            else break;            
        }
        promEdadesMascotas = sumaEdadesMascotas/cantClientes();
        return promEdadesMascotas; 
    }
    
    public int masAntiguedad(){
        int masviejos = 0;
        for (int i = 0; i < clientes.length ; i++) {
            if (clientes[i]!=null && clientes[i].getAntiguedad() >= 5) {
                masviejos ++;
            }
            else break;
        }
    return masviejos;
}
}
