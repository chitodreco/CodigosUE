package controller;

import model.Libro;

import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca <L extends Libro> {

    private String nombre, director;
    private Catalogo catalogo;

    public void mostrarDatosBiblio(){
        System.out.println();
        System.out.println("nombre = " + nombre);
        System.out.println("director = " + director);
        System.out.println();
    }


    public void crearCatalogo (int numLibros){
        this.catalogo = new Catalogo(numLibros);
    }


    public void consultarEspacio(){
        catalogo.espacioLibre();
    }

    public void consultarNumLibros(){
        if (catalogo == null){
            System.out.println("Catálogo vacío");
        } else {
            catalogo.consultarNumLibros();
        }
    }

    public void agregarLibrosCat(L libro){
        if (catalogo == null){
            System.out.println("Catálogo no existe en la biblioteca");
        }else {
            catalogo.agregarLibro(libro);
        }
    }

    public void listarLibrosCat(){
        if (catalogo == null){
            System.out.println("No hay lista");
        } else {
            catalogo.listaLibros();
        }
    }

    public void quitarLibros(){
        if (catalogo == null){
            System.out.println("Sin libros en el catálogo");
        } else {
            catalogo.sacarLibro();
        }
    }

    public void buscarLibro(){
        if (catalogo == null){
            System.out.println("Catálogo vacío");
        } else {
            catalogo.buscarDatosLibro();
        }
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

        public Catalogo (int maxLibros){
            this.maxLibros = maxLibros;
            listaLibros = new ArrayList<>();
        }

        public void crearCatalogo (int maxLibros){
            this.maxLibros = maxLibros;
        }

        public void consultarNumLibros(){
            int resultado = listaLibros.size();
            System.out.println();
            System.out.println("Hay "+resultado+" libros en el catálogo");
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

        public void sacarLibro(){
            Scanner scanner = new Scanner((System.in));
            System.out.println("Introduce ISBN: ");
            String borrar = scanner.nextLine();
            boolean encontrado = false;
            for (L libro:listaLibros){
                if (libro.getISBN().equals(borrar)) {
                    listaLibros.remove(libro);
                    System.out.println("Libro eliminado");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("No se encuentra en el catálogo");
            }
        }

        public void listaLibros(){
            for (L item:listaLibros){
                System.out.println();
                System.out.println("Libro en catálogo");
                item.mostrarDatos();
                System.out.println();
            }
        }

        public void buscarDatosLibro(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce ISBN del libro: ");
            String isbnlibro = scanner.nextLine();
            boolean buscar = false;
            for (L item: listaLibros){
                if (item.getISBN().equals(isbnlibro)){
                    buscar = true;
                    item.mostrarDatos();
                    break;
                }
            }
            if (!buscar){
                System.out.println("No está en catálogo");
            }
        }

    }

}


