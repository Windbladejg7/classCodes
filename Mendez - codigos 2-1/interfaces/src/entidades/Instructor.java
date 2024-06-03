package entidades;

import java.util.Scanner;
public class Instructor extends Persona {
    private String tituloAcademico;
    private int aniosExperiencia;

    public Instructor() {
        super();// llamando al cosntructor por defecto
        // de la clase padre
    }

    public Instructor(String tituloAcademico, int aniosExperiencia) {
        this.tituloAcademico = tituloAcademico;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Instructor(String nombres, String ape, String ced,
            String email, String titulo, int anios) {
        super(nombres, ape, ced, email);
        this.tituloAcademico = titulo;
        this.aniosExperiencia = anios;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;//falta verificar
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;//falta verificar
    }

    //sobreescritura de metodos(modificar un metodo heredado)
    @Override
    public String toString() {
        return "Instructor:"
                + super.toString()
                + ", tituloAcademico=" + this.getTituloAcademico() 
                + ", aniosExperiencia=" + this.getAniosExperiencia();
    }

    @Override
    public void mostrarInfo() {
        System.out.println("**********************");
        System.out.println("Datos de Instructor");
        super.mostrarInfo();
        System.out.println("Titulo Academico: "+this.tituloAcademico);
        System.out.println("Años de experiencia: " +this.aniosExperiencia);
   }

    @Override
    public void ingresarDatos(Scanner scan) {
        System.out.println("\nIngresando Instructor:");
        super.ingresarDatos(scan);
        System.out.print("Titulo académico:");
        this.setTituloAcademico(scan.nextLine());
        System.out.print("Años de experiencia:");
        this.setAniosExperiencia(Integer.parseInt(scan.nextLine()));
    }

    @Override
    public void saludar() {
        System.out.println("Buenos días, "
                + this.getTituloAcademico() + this.getNombres() + " "
                + this.getApellidos());
    }
    
    @Override
    public void realizarActividad(){
        System.out.println("Enseñar");
    }
    
    // metodo propio de la clase Instructor
    //(no esta en la clase padre)
    public void darClases(String tema){
        System.out.println("Enseñando el tema "+
                tema);
    }
    
    @Override
    public void mostrarIdentificador(){
        System.out.println("Identificador del instructor: " + this.getCedula());
    }
}
