/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 301-13-265486
 */
public class Participante {
    
    private String Nombre;
    private String Apellido;
    private int Numero;
    private String Llanta;

    public Participante() {
        
        
    }

    
    public Participante(String Nombre, String Apellido, int Numero, String Llanta) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Numero = Numero;
        this.Llanta = Llanta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getLlanta() {
        return Llanta;
    }

    public void setLlanta(String Llanta) {
        this.Llanta = Llanta;
    }

    @Override
    public String toString() {
        return "Participante{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Numero=" + Numero + ", Llanta=" + Llanta + '}';
    }
    
    
    
}
