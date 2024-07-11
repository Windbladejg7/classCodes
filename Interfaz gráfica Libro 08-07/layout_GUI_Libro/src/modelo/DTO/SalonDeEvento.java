package modelo.DTO;
public class SalonDeEvento {
    private String nombre;
    private float precio;
    private int capacidadPersonas;
    private String tipo;

    public SalonDeEvento() {
    }

    public SalonDeEvento(String nombre, float precio, int capacidadPersonas, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidadPersonas = capacidadPersonas;
        this.tipo = tipo;
    }

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
        this.precio = precio;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "SalonDeEvento{" + "nombre=" + nombre + ", precio=" + precio + ", capacidadPersonas=" + capacidadPersonas + ", tipo=" + tipo + '}';
    }
   public String toArchivo() {
        return  nombre + ";" + precio + ";" + capacidadPersonas + ";" + tipo;
    }
}
