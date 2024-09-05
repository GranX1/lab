import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void addBook(Libro libro) {
        libros.add(libro);
        System.out.println("Libro añadido: " + libro.getTitulo());
    }

    public void showBooks() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            for (Libro libro : libros) {
                libro.showInformation();
                System.out.println("Es antiguo: " + (libro.isOld() ? "Sí" : "No"));
                System.out.println("------------------------");
            }
        }
    }

    public void searchBookByTitle(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.showInformation();
                return;
            }
        }
        System.out.println("No se encontró el libro con el título: " + titulo);
    }
}