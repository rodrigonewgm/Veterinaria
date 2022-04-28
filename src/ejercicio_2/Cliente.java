/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

/**
 *
 * @author Rodri
 */
public class Cliente {
    private int id;
    private String nombre;
    private int antiguedad;
    private Mascota mascota;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
        public Cliente(int id, String nombre, int antiguedad, Mascota mascota) {
        this.id = id;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.mascota = mascota;
    }
    
    @Override
    public String toString(){
        return "Id: " + id + "Nombre: " + nombre + "Antiguedad: " + antiguedad + "Mascota: " + mascota.toString();
    }
}
