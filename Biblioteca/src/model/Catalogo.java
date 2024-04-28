package model;

import controller.Biblioteca;

import java.util.ArrayList;

public class Catalogo extends Biblioteca {

    private ArrayList<Libro> listaLibros;

    public void agregarLibro(Libro libro){
        this.listaLibros.add(libro);
    }

    public void listarLibros(){
        for (Libro item: listaLibros) {
            item.mostrarDatos();
        }
    }

    public void buscarLibro(int ISBN){
        for (Libro item :listaLibros) {
            if (item.getISBN() == ISBN){
                System.out.println("Libro encontrado");
                item.mostrarDatos();
                break;
            }
        }
    }

    public Catalogo() {
        listaLibros = new ArrayList<>();
    }

    public Catalogo(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
}
