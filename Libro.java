public class Libro {
    private String titulo;
    private Autor autor;
    private int añoPublicacion;
    private String isbn;
    private boolean prestado;

    public Libro(String titulo, Autor autor, int añoPublicacion, String isbn, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public boolean isOld() {
        int añoActual = java.time.Year.now().getValue();
        return (añoActual - añoPublicacion) > 20;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}