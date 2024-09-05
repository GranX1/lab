public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    public void showInformation() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("ISBN: " + isbn);
    }

    public boolean isOld() {
        int añoActual = java.time.Year.now().getValue();
        return (añoActual - añoPublicacion) > 20;
    }

    public String getTitulo() {
        return titulo;
    }
}