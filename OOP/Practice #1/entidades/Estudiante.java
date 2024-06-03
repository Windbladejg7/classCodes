package entidades;

import java.util.Scanner;

public class Estudiante extends Persona{
    private String credencial;
    
    public Estudiante(){
        super();
        this.credencial = "9999999999";
    }
    public Estudiante(String nom, String ape, String ced,
            String email, String cred){
        super(nom, ape, ced, email);
        this.credencial= cred;
        
    }
    //metodos get y set
    public String getCredencial() {
        return credencial;
    }
    
    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }
    
    //metodos sobreescritos(metodos heredados que 
    //las clases hijas deciden modificar)
    @Override
    public void saludar(){
        System.out.println("Hola, bienvenido "
        + this.getNombres());
    }
    @Override
    public void realizarActividad(){
        System.out.println("Estudiar");
    }
    
    @Override
    public String toString() {
        return "Estudiante:"+ super.toString()+ ", credencial=" + credencial;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Mostrando Esrudiante");
       // this.mostrarInfo(); //llama a metodo mostrarInfo de esta(this) clase
        super.mostrarInfo();//llama a metodo mostrarInfo de la clase padre(super)
        System.out.println("Credencial: " + this.credencial);   
        //ojo con el uso de this y super (no es lo mismo)
//        Scanner scan = new Scanner(System.in);
//        this.ingresarDatos(scan);
//        super.ingresarDatos(scan);
    }
    
    @Override
    public void ingresarDatos(Scanner scan){
        System.out.println("\nIngresando Estudiante");
        super.ingresarDatos(scan);
        System.out.println("Ingrese credencial:");
        this.setCredencial(scan.nextLine());
    }
    
    @Override
    public void mostrarIdentificador(){
        System.out.println("Identificador del estudiante: " + this.getCredencial());
    }
}
