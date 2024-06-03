package entidades;
import interfaces.InterfaceOperacionesCurso;
import java.util.Scanner;
import interfaces.InterfaceOperacionesEntidad;

public class Curso implements InterfaceOperacionesEntidad, InterfaceOperacionesCurso{
    private String nombre;
    private String descripcion;
    private float precio;
    //constructores
    public Curso() {
        this.nombre = "Por confirmar";
    }
    public Curso(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    // metodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        if (precio < 50 || precio >1000) {
            System.out.println("Precio no valido, debe ser mayor o igual a 50");
        } else {
            this.precio = precio;
        }
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //sobrecarga de metodos
    @Override
    public void calcularPrecioFinal(float porcentajeDescuento) {
         this.precio = this.precio - (this.precio * porcentajeDescuento);
    }
    @Override
    public double calcularPrecioFinal(int horas) {
        if (horas > 100) {
            this.precio = this.precio -(this.precio * 0.10f);
            //aplica 10% de descuento
        }
        return this.precio;
    }
    @Override
    public void calcularPrecioFinal(int horas, int temas){
        if(horas>20 && temas>5){
            this.precio+= 120;
        }
    }

    public void mostrarInfo() {
        System.out.println("\nMostrando Curso:");
        System.out.println("Nombre del curso: " + this.getNombre());
        System.out.println("Decripcion: " + this.getDescripcion());
        System.out.println("Precio Inicial: " + this.getPrecio());
    }

    public void ingresarDatos(Scanner scan) {
        System.out.println("\nIngresando Curso:");
        System.out.println("Nombre:");
        this.setNombre(scan.nextLine());
        System.out.println("Descripcion:");
        this.setDescripcion(scan.nextLine());
        System.out.print("Precio inicial del curso:");
        this.precio = Float.parseFloat(scan.nextLine());
    }
    // modificar un metodo heredado por esta clase (sobreescritura)
    //toString se hereda de Object
    @Override
    public String toString() {
        return "Curso:" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio;
    }   
    @Override
    public String obtenerIdentificador(){
            return this.nombre;
    }
    @Override
    public void mostrarIdentificador(){
        System.out.println("Identificador de curso"+ this.nombre);
    }
}
