/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import Modelo.*;
        
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Participante A= new Participante("Luis","Perez",1,new Llanta(10));
        Participànte B= new Participante("Carlos","Lopez",2, new Llanta(5));
        Participante C = new Participante("Gorge","Pinto",3, new Llanta(7));
        
        
        Concurso concurso Concurso(A,B);
        concurso.setC(C);
        
        
        System.out.println("Resultado Lanzamiento");
        System.out.println("-----------------------");
        System.out.println("Resultado A: "+ concurso.getA().resultadoLanzamiento);
        System.out.println("Resultado B: " + concurso.getB().resultadoLanzamiento);
        System.out.println("Resultado C: "+ concurso.getC().resultadoLanzamiento);
        System.out.println("");
        
        Participante ganador = concurso.getGanador();
        System.out.println("Ganador: "+ganador);
    }
    
}
