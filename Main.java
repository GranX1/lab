public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Five Nights at Freddy's The Silver Eyes", "Scott Cawton", 2018, "978-1338134377");
        Libro libro2 = new Libro("Oblivion", "Joseph Kosinski", 2011, "978-0980233575");
        Libro libro3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954, "456-789-123");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addBook(libro1);
        biblioteca.addBook(libro2);
        biblioteca.addBook(libro3);

        System.out.println("Todos los libros en la biblioteca:");
        biblioteca.showBooks();

        System.out.println("\nBuscando el libro 'Oblivion':");
        biblioteca.searchBookByTitle("Oblivion");
    }
}