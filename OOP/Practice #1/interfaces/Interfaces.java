package interfaces;
import entidades.Estudiante;
import entidades.Persona;
import interfaz.interfaceOper;
import entidades.Instructor;
import administracion.AdmPersona;
import java.util.Scanner;

public class Interfaces {

    public static void main(String[] args) {
        //aplicar polimorfismo
        Estudiante estu = new Estudiante("Juan", "Abad", "09890", "ju@mog.com", "89078");
        estu.mostrarInfo();
        
        Persona pers = new Estudiante("Benja", "Espinoza", "09890", "ms@dfc.com", "34567");
        pers.mostrarInfo();
        
        interfaceOper ipe = new Instructor("Julio", "Verme", "09890", "jv@ghj.com", "Lic.", 12);
        //ipe.mostrarInfo(); solo puedo mostrar los metodos que el tipo de datos conoce, ipe no conoce mostrarInfo
        ipe.mostrarIdentificador();
        
        ipe = pers;
        ipe.mostrarIdentificador();//llama al metodo de la clase Estudiante, ipe y pers referencian a Estudiante
        
        estu = (Estudiante)pers; //downcasting
        estu.mostrarInfo();
        
        Instructor ins2 = new Instructor();
        pers = ins2; //upcasting
        /*estu = ins2;*/ //es un error, no hay relacion entre los tipos
        //estu = (Estudiante)pers;
        //estu.mostrarInfo();
        
        AdmPersona adm = new AdmPersona();
        Scanner scan = new Scanner(System.in);
        adm.menu(scan);
                
        
    }
    
}
