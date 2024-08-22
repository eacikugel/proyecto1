import java.time.LocalDate;

public class Libro {
String titulo;
String autor;
int añopublicacion;

public Libro(String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    this.añopublicacion = LocalDate.now().getYear();
}

public Libro(String titulo, String autor, int añopublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    this.añopublicacion = añopublicacion;
}
public void mostrar(){
    System.out.println("libro: " + titulo + ", Autor: " + autor + ", Año de publicación: " + añopublicacion);
}
public static void main(String[] args){
    Libro libro1 = new Libro("la casa de los espíritus", "isabele allende");
    Libro libro2 = new Libro("vida", "sol", 2002);
    libro1.mostrar();
    libro2.mostrar();
}
}