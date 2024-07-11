package modelo.DTO;


public class Autor {
    private String cedula;
    private String nombres,apellidos, paisOrigen;
    private boolean esGanadorDeNobel;

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public boolean isEsGanadorDeNobel() {
        return esGanadorDeNobel;
    }

    public void setEsGanadorDeNobel(boolean esGanadorDeNobel) {
        this.esGanadorDeNobel = esGanadorDeNobel;
    }
    
    public Autor() {
    }

    public Autor(String cedula, String nombres, String apellidos, String paisOrigen) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.paisOrigen = paisOrigen;
    }

   

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPasiOrigen() {
        return paisOrigen;
    }

    public void setPasiOrigen(String pasiOrigen) {
        this.paisOrigen = pasiOrigen;
    }

   
    @Override
    public String toString() {
        return  apellidos + " " +nombres;
    }

    public String toArchivo(){
      return cedula + ";" + nombres + ";" + apellidos + ";" 
                 + paisOrigen +";"  + esGanadorDeNobel ;
   
    }
    
    
}
