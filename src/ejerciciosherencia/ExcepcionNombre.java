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
public class ExcepcionNombre extends Exception{
    public ExcepcionNombre(){
        super("Nombre debe tener mas de 10 caracteres");
    }
    
}