/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocongit.entidades;

/**
 *
 * @author gae
 */
public class Perro {
    private int edad;
    private String nombre;
    private String raza;
    private String color;

    public Perro() {
    }

    public Perro(int edad, String nombre, String raza, String color) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" + "edad=" + edad + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + '}';
    }
    
    
}
