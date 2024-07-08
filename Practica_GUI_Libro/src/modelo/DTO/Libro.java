package modelo.DTO;
// DTO: data transfer object

import java.util.Calendar;
import java.util.Date;

public class Libro {

    private String titulo, genero;
    private int anioPublicacion;
    private double precio;
    private boolean esBoN, esAColores, tieneImagenes;

    private Autor autor;// relacion de asociacion

    public Libro() {
    }

    public Libro(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo==null || titulo.isEmpty() || titulo.length()<5) {
            throw new IllegalArgumentException("El titulo es incorrecto");
        } else {
            this.titulo = titulo;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);//obtener año actual
        if (anioPublicacion > year) {
            throw new IllegalArgumentException("El año de publicación debe ser menor a 1000");
        } else if (anioPublicacion < 1900) {
            throw new IllegalArgumentException("El año de publicación minimo es de 5");
        } else {
            this.anioPublicacion = anioPublicacion;
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 1000) {
            throw new IllegalArgumentException("El precio debe ser menor a 1000");
        } else if (precio < 5) {
            throw new IllegalArgumentException("El precio minimo es de 5");
        } else {
            this.precio = precio;
        }

    }

    public boolean getEsAColores() {
        return esAColores;
    }

    public void setEsAColores(boolean esAColores) {
        this.esAColores = esAColores;
    }

    public boolean getTieneImagenes() {
        return tieneImagenes;
    }

    public void setTieneImagenes(boolean tieneImagenes) {
        this.tieneImagenes = tieneImagenes;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean getEsBoN() {
        return esBoN;
    }

    public void setEsBoN(boolean esBoN) {
        this.esBoN = esBoN;
    }

    @Override
    public String toString() {
        return "Libro:" + "titulo=" + titulo + ", genero=" + genero + ", anio de Publicacion=" + anioPublicacion + ", precio=" + precio + ", es A Colores=" + esAColores + ", es Blanco o Negro=" + esBoN + ", tiene Imagenes=" + tieneImagenes + ", autor=" + autor.toString() + '}';
    }

    public String toArchivo() {
        return titulo + ";" + genero + ";" + anioPublicacion
                + ";" + precio + ";" + esAColores + ";" + esBoN + ";" + tieneImagenes + ";"
                + autor.getCedula();
    }

}
