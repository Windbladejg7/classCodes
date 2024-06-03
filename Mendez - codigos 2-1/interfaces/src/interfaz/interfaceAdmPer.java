package interfaz;
import java.util.Scanner;
import entidades.Persona;

public interface interfaceAdmPer {
    //constantes
    
    //metodos abstractos
    public void menu(Scanner scan);
    public void agregarLista(Persona pers);
    public void mostrarLista();
    Persona buscarXcedula(String ced);
    
}
