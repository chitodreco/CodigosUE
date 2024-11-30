package ejercicio3.model;

import java.util.ArrayList;

public class Pizza {

    private String nombre;
    private int precio;
    private ArrayList<Ingrediente> ingredientes;

    public void mostrarPizza(){
        for (Ingrediente item : ingredientes) {
            System.out.println(item.getNombre());
        }
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
        this.precio+= ingrediente.getPrecio();
    }

    public Pizza() {
    }

    public Pizza(String nombre) {
        this.nombre = nombre;
        this.ingredientes = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
