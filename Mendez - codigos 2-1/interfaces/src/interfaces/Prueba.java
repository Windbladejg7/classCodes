package interfaces;
import entidades.Curso;
import entidades.Instructor;
import entidades.Estudiante;
import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args){
        Curso curso = new Curso("POO con Java", 300);
        curso.setDescripcion("POO con Java todo");
        Instructor ins = new Instructor("Karla", "Abad", "092", "kj@gm.com", 
                "Ing.", 12);
        curso.setInstructor(ins);
        
        ArrayList<Estudiante> list = new ArrayList();
        Estudiante est = new Estudiante("Pepe", "Suarez", "123", "p@hj.com", "234");
        list.add(est);//agregar coleccion
        
        est = new Estudiante("Juan", "Nagua", "123", "p@hj.com", "234");
        list.add(est);//agregar coleccion
        
        curso.setListaEstudiantes(list);
        curso.mostrarInfo();
        
        
    }
}
