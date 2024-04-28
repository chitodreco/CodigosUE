package controller;

import model.Libro;

import java.util.ArrayList;


public class Biblioteca <L extends Libro> {

    private String nombre, director;
    private Catalogo catalogo;

    public void crearCatalogo (int numLibros){
        this.catalogo = new Catalogo(numLibros);
    }

    public void mostrarDatosBiblio(){
        System.out.println();
        System.out.println("nombre = " + nombre);
        System.out.println("director = " + director);
        System.out.println();
    }

    public void agregarLibroCatalogo(L Libro){
        catalogo.agregarLibro(libro);
    }


    public Biblioteca() {
    }

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    class Catalogo {
        private int maxLibros;
        private ArrayList<L> listaLibros;

        public void crearCatalogo (int maxLibros){
            this.maxLibros = maxLibros;
        }

        public int espacioLibre(){
            int espacio = maxLibros - listaLibros.size();
            System.out.println("Espacio de: "+espacio);
            return espacio;
        }

        public Libro estaLibro (String ISBN) {
            for (L libro : listaLibros) {
                if (libro.getISBN().equals(ISBN)) {
                    return libro;
                }
            }
            return null;
        }

        public void agregarLibro(L libro) {
            int espacioLibre = espacioLibre();
            if (estaLibro(libro.getISBN()) != null){
                System.out.println("El libro "+libro.getISBN()+" ya está en catálogo");
            } else if (espacioLibre <= 0) {
                System.out.println("Catálogo lleno");

            } else {
                listaLibros.add(libro);
                System.out.println("Libro agregado al catálogo");
            }

        }

    }

}


