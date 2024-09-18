import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void addBook(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Libro> getLibrosPrestados(boolean prestados) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isPrestado() == prestados) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
    
    public Libro searchBookByTitle(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}