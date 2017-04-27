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
public class Programador extends Empleados{
    protected String lenguaje;

    public Programador(String lenguaje, String nombre, double salario, int id) throws ExcepcionNombre, ExcepcionSalario, ExcepcionLenguaje {
        super(nombre, salario, id);
        if(lenguaje.contentEquals("go"))
            throw new ExcepcionLenguaje();
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = this.salario;
        if(this.lenguaje.equals("java")){
            salarioTotal+=(this.salario*0.2);
        }
        return salarioTotal;
    }

    @Override
    public String ListarIformacion() {
        return "Programador: "+ this.id + " " + this.nombre;
    }

    private void ExcepcionLenguaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
