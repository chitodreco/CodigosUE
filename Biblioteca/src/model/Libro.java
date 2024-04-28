package model;

public class Libro {

    private String autor, titulo, ISBN;
    private int numPaginas;

    public void mostrarDatos(){
        System.out.println("autor = " + autor);
        System.out.println("titulo = " + titulo);
        System.out.println("ISBN = " + ISBN);
        System.out.println("numPaginas = " + numPaginas);
    }

    public Libro() {
    }

    public Libro(String autor, String titulo, String ISBN, int numPaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
