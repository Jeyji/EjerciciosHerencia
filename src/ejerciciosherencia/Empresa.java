/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosherencia;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Trabajador> trabajadores;
    public Empresa(){
        this.trabajadores = new ArrayList<>();
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }
    
    
    public void addTrabajador(Trabajador t){
        this.trabajadores.add(t);
    }
    public double calcularSararioTotal(){
       double salarioTotal = 0;
       for(Trabajador trabajador : trabajadores){
           salarioTotal+= trabajador.calcularSalario();
       }
       return salarioTotal;
    }
    public String listarInformacion(){
        String informacion = "";
        for (Trabajador trabajador : trabajadores){
            informacion+=trabajador.ListarIformacion();
        }
        return informacion;
    }
}
