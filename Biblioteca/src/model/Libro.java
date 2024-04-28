package model;

public abstract class Libro {

    private String autor, ISBN;
    private int numPaginas;

    public void mostrarDatos(){
        System.out.println("autor = " + autor);
        System.out.println("ISBN = " + ISBN);
        System.out.println("numPaginas = " + numPaginas);
    }

    public Libro() {
    }

    public Libro(String autor, String ISBN, int numPaginas) {
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
