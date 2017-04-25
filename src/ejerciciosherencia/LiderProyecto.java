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
public class LiderProyecto extends Programador{
    private ArrayList<Programador> programadores;

    public LiderProyecto(ArrayList<Programador> programadores, String lenguaje, String nombre, double salario, int id) {
        super(lenguaje, nombre, salario, id);
        this.programadores = new ArrayList<>();
    }
    public void addProgramador(Programador p){
        this.programadores.add(p);
    }
    @Override
    public double calcularSalario() {
        double salarioTotal = 0;
        salarioTotal+=super.calcularSalario()*(super.calcularSalario()*this.programadores.size()*0.1);
        return salarioTotal;
    }

    @Override
    public String ListarIformacion() {
        String informacion=super.ListarIformacion();
        for(Programador programador : programadores){
            informacion+=programador.ListarIformacion();
        }
        return informacion;
    }
    
}
