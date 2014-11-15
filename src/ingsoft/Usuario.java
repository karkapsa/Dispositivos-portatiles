/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ingsoft;

public class Usuario {
    private int id_Usuario;
    private String nombre="";
    private String apellido="";
    private int tipo_Doc;
    private String contraseña;
    private byte tipo_Usuario;

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTipo_Doc() {
        return tipo_Doc;
    }

    public void setTipo_Doc(int tipo_Doc) {
        this.tipo_Doc = tipo_Doc;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public byte getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(byte tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }
    
    
    
    
    
}
