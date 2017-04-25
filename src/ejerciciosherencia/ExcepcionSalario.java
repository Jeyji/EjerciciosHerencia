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
public class ExcepcionSalario extends Exception{
    
    public ExcepcionSalario(){
        super("Salarioo debe ser mayor al mínimo");
    }
}
