package model;

public final class Policiaca extends Libro{
    
    private String personajes;

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("personajes = " + personajes);
    }

    public Policiaca() {
    }

    public Policiaca(String autor, String ISBN, int numPaginas, String personajes) {
        super(autor, ISBN, numPaginas);
        this.personajes = personajes;
    }

    public String getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String personajes) {
        this.personajes = personajes;
    }
}
