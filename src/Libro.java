public class Libro {
    public int anio;
    public String autor;
    public String titulo;
    public String editorial;
    public String isbn;

    public Libro(int anio, String autor, String titulo, String editorial, String isbn) {
        this.anio = anio;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public void imprimir() {
        System.out.println("Año: " + anio);
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
        System.out.println("Editorial: " + editorial);
        System.out.println("ISBN: " + isbn);
    }

    public void prestar() {
        System.out.println("El libro " + titulo + " ha sido prestado.");
    }

    public void devolver() {
        System.out.println("El libro " + titulo + " ha sido devuelto.");
    }

    public void reservar() {
        System.out.println("El libro " + titulo + " ha sido reservado.");
    }


}
