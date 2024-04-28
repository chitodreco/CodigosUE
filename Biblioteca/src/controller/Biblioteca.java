package controller;

import model.Catalogo;
import model.Libro;

import javax.xml.catalog.Catalog;

public class Biblioteca {

    private String nombre, director;
    private Catalogo catalogo;

    public void crearCatalogo (Catalogo catalogo){}

    public Biblioteca() {
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
