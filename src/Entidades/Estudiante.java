/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author mco_a
 */
public class Estudiante extends Persona{
    
    private String codigo;
    
    public Estudiante(String nombre, String codigo){
        super(nombre);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTexto(){
        return this.codigo + " | " + super.getNombre(); 
    }
}
