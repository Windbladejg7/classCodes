package entidades;

import interfaces.InterfaceOperacionesEntidad;
import java.util.Scanner;
//clase abstracta (tiene métodos abstractos, no
//sirve para crear objetos)
public abstract class Persona  implements InterfaceOperacionesEntidad{
    private String nombres;
    private String apellidos;
    private String cedula="9999";
    protected String email;

    // constructores
    public Persona() {
    }

    public Persona(String cedula) {
        this.cedula = cedula;
    }

    public Persona(String nombres, String apellidos, String cedula, String email) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.email = email;
    }

    // getters y setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        boolean valido = true;
        char[] arreglo = nombres.toCharArray();//convertir nombres en un arreglo de char
        for (char c : arreglo) { // revisar cada caracter del arreglo
            if (!Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                //si hay un caracter que no se alfabetico o que no sea espacio en blanco
                System.out.println("Nombre no valido");
                valido = false;
                break; //salir del lazo for
            }
        }
        if (valido==true) {// si valido es verdadero
            this.nombres = nombres;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;//falta verificar
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        String cedulaRegex = "^[0-9]{10}$";
        if (cedula.length() != 10) {
            System.out.println("cedula debe tener 10 digitos");
        } else if (!cedula.matches(cedulaRegex)) {
            System.out.println("cedula debe tener solo digitos");
        } else {
            this.cedula = cedula;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;//falta verificar
    }

    @Override
    public String toString() {
        return "Persona:" + "nombres=" + nombres + 
                ", apellidos=" + apellidos + 
                ", cedula=" + cedula + ", email=" + email;
    }
    
    public void mostrarInfo() {
        System.out.println("**********************");
        System.out.println("Nombres " +this.getNombres());
        System.out.println("Apellidos " + this.getApellidos());
        System.out.println("Cedula "+this.getCedula());
        System.out.println("Email " + this.getEmail());
        
    }

   public void ingresarDatos(Scanner scan) {
        System.out.print("Cédula:");
        this.setCedula(scan.nextLine());
        System.out.println("Nombres: ");
        this.setNombres(scan.nextLine());
        System.out.print("Apellidos:");
        this.setApellidos(scan.nextLine());
        System.out.print("Email:");
        this.setEmail(scan.nextLine());
    }
   //metodo abstracto
   // metodo que no tiene cuerpo (no esta implementado)
    public abstract void saludar();
    public abstract void realizarActividad();
    
    public String obtenerIdentificador(){
        return this.cedula;
    }
}
