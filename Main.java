public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor(1, "Scott Cawton", "scott@example.com");
        Autor autor2 = new Autor(2, "Joseph Kosinski", "joseph@example.com");
        Autor autor3 = new Autor(3, "J.R.R. Tolkien", "tolkien@example.com");

        Libro libro1 = new Libro("Five Nights at Freddy's The Silver Eyes", autor1, 2018, "978-1338134377", true);
        Libro libro2 = new Libro("Oblivion", autor2, 2011, "978-0980233575", false);
        Libro libro3 = new Libro("El Señor de los Anillos", autor3, 1954, "456-789-123", true);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addBook(libro1);
        biblioteca.addBook(libro2);
        biblioteca.addBook(libro3);

        System.out.println("Todos los libros en la biblioteca:");
        for (Libro libro : biblioteca.getLibros()) {
            displayBook(libro);
        }

        System.out.println("\nBuscando el libro 'Oblivion':");
        Libro libroBuscado = biblioteca.searchBookByTitle("Oblivion");
        if (libroBuscado != null) {
            displayBook(libroBuscado);
        } else {
            System.out.println("No se encontró el libro con el título: Oblivion");
        }

        System.out.println("\nLibros prestados:");
        for (Libro libro : biblioteca.getLibrosPrestados(true)) {
            displayBook(libro);
        }

        System.out.println("\nLibros no prestados:");
        for (Libro libro : biblioteca.getLibrosPrestados(false)) {
            displayBook(libro);
        }
    }

    public static void displayBook(Libro libro) {
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Correo del autor: " + libro.getAutor().getCorreo());
        System.out.println("Año de Publicación: " + libro.getAñoPublicacion());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Es prestado: " + (libro.isPrestado() ? "Sí" : "No"));
        System.out.println("Es antiguo: " + (libro.isOld() ? "Sí" : "No"));
        System.out.println("------------------------");
    }
}