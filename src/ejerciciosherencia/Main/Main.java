/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosherencia.Main;

import ejerciciosherencia.Administrador;
import ejerciciosherencia.Consultor;
import ejerciciosherencia.DAO.ArchivoDB;
import ejerciciosherencia.Empresa;
import ejerciciosherencia.ExcepcionLenguaje;
import ejerciciosherencia.ExcepcionNombre;
import ejerciciosherencia.ExcepcionSalario;
import ejerciciosherencia.LiderProyecto;
import ejerciciosherencia.Programador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Empresa emp = new Empresa();
        Consultor c = new Consultor("ing", 153);
        emp.addTrabajador(c);
        try {
            Administrador a = new Administrador("Adfgtusdfghf", 1220000, 235);
        } catch (ExcepcionNombre ex) {
            ex.printStackTrace();
        } catch (ExcepcionSalario ex) {
            ex.printStackTrace();
        }
        try {
            Programador p = new Programador("C++","rtcvnfsdgs",15680020,356);
            
            LiderProyecto l = new LiderProyecto("Java", "fdagdfgfdg", 3000000, 301);
            l.addProgramador(p);
            
            emp.addTrabajador(l);
        } catch (ExcepcionNombre ex) {
            ex.printStackTrace();
        } catch (ExcepcionSalario ex) {
            ex.printStackTrace();
        } catch (ExcepcionLenguaje ex) {
            ex.printStackTrace();
        }
        ArchivoDB arc =new ArchivoDB();
        try{
            arc.guardarInformacion(emp);
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public  Empresa cargarInformacio(){
        File archivo = new File("empresa.txt5");
        String tipo = "";
        try{
            Scanner lectura = new Scanner(archivo);
            lectura.useDelimiter(",");
            while(lectura.hasNext()){
                tipo = lectura.next();
                if(tipo.equals("C")){
                    System.out.println("ID "+lectura.nextInt());  
                    System.out.println("Labor "+lectura.next());
                }
                else if(tipo.equals("A")){
                    System.out.println("ID "+ lectura.nextInt());  
                    System.out.println("Nombre "+lectura.next());
                    System.out.println("Salario "+ lectura.nextDouble());
                }
            }
        lectura.close();
        }catch(FileNotFoundException ex){
            
        }
    }
}
 