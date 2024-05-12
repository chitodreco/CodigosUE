package model;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Usuario> listausuario;

    public Sistema() {
        listausuario = new ArrayList<>();
    }

    public void darAltaUsurio(Usuario usuario){
        listausuario.add(usuario);
    }

    public boolean loginUsuario(String correo, String password) {
        for (Usuario usuario:listausuario) {
            if (correo.equals(usuario.getCorreo()) && password.equals(usuario.getPassword())){
                System.out.println("Usuario registrado");
                return true;
            }
        }
        System.out.println("Usuario no resgristrado");
        return false;
    }
}
