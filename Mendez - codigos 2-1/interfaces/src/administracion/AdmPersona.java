package administracion;
import entidades.Persona;
import entidades.Instructor;
import entidades.Estudiante;
import interfaz.interfaceAdmPer;
import java.util.Scanner;

public class AdmPersona implements interfaceAdmPer{

    @Override
    public void menu(Scanner scan) {
        int opcion = 0;
        Persona pers;
        do{
            System.out.println("1: Crear Instructor");
            System.out.println("2: Crear Estudiante");
            System.out.println("0: Salir");
            opcion = Integer.parseInt(scan.nextLine());
            
            switch(opcion){
                case 1:
                    pers = new Instructor(); //upcasting
                    pers.ingresarDatos(scan); //enlace dinamico de metodos
                    break;
                case 2:
                    pers = new Estudiante(); //upcasting
                    pers.ingresarDatos(scan); //enlace dinamico de metodos
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
            }
        }while (opcion!=0);
    }

    @Override
    public void agregarLista(Persona pers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mostrarLista() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persona buscarXcedula(String ced) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
