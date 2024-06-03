package interfaz;

public interface interfaceCurso {
    float IVA = 0.15f;
    
    //metodos abstractos
    //en una interfaz implicitamente son public abstract
    public abstract double calcularPrecioFinal(int horas);
    void calcularPrecioFinal(float desc);
    void calcularPrecioFinal(int horas, int temas);
}
