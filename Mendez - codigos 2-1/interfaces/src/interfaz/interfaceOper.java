package interfaz;

public interface interfaceOper {
    //variables por defecto son public static y final (constantes)
    //variables estaticas y final
    //float IVA; (da error porque no es una variable estatica)
    float IVA = 0.15f;
    String CATEGORIA = "General";//implicitamente es public static final
    
    //metodos abstractos
    public abstract String obtenerIdentificador();
    public abstract void mostrarIdentificador();
    
    //una interfaz no puede tener metodos implementados
    // public void xd(){}
    
}
