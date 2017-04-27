/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosherencia.DAO;

import ejerciciosherencia.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author Estudiante
 */
public class ArchivoDB {
    
    public void guardarInformacion(Empresa e) throws FileNotFoundException{
        File archivo = new File("empresa.txt");
        PrintStream salida = new PrintStream(archivo);
        for(Trabajador t : e.getTrabajadores())
            if(t instanceof Consultor){
                Consultor c = (Consultor)t;
                salida.print("C, " + c.getId() + ", " + c.getLabor()+",");
            }
            else if(t instanceof Administrador){
                Administrador a = (Administrador)t;
                salida.print("A, "+ a.getId() + ", " + a.getNombre() + ", " +a.getSalario()+ ", ");
            }
            else if(t instanceof LiderProyecto){
                LiderProyecto l = (LiderProyecto)t;
                salida.print("P, "+ l.getId() + ", " + l.getNombre() + ", " +l.getSalario()+ ", " + l.getLenguaje()+ ", ");
                salida.print(l.getProgramadores().size()+ ", " );
                for(Programador p: l.getProgramadores()){
                    salida.print(p.getId() + ", ");
                }
            }
            else if(t instanceof Programador){
                Programador p = (Programador)t;
                salida.print("P, "+ p.getId() + ", " + p.getNombre() + ", " +p.getSalario()+ ", " + p.getLenguaje()+ ", ");
            }
        salida.close();
    }
}
