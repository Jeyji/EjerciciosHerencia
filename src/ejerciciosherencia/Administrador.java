/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosherencia;

/**
 *
 * @author Estudiante
 */
public class Administrador extends Empleados{

    public Administrador(String nombre, double salario, int id) {
        super(nombre, 100, id);
    }


    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String ListarIformacion() {
        return "Administrador: "+ this.id + " " + this.nombre;
    }
    
    
}
