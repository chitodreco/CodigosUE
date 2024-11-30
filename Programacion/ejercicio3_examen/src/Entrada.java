import model.Sistema;
import model.Usuario;

public class Entrada {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        Usuario usuario1 = new Usuario("Rober", "roberto.panizo@gmail.com", "123KCV");
        Usuario usuario2 = new Usuario("Elena", "elena.panizo@gmail.com", "323KCV");
        Usuario usuario3 = new Usuario("Jorge", "jorge.panizo@gmail.com", "144WCV");

        sistema.darAltaUsurio(usuario1);
        sistema.darAltaUsurio(usuario2);
        sistema.darAltaUsurio(usuario3);

        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        usuario3.mostrarDatos();

        sistema.loginUsuario("antonio@gmail.com", "123456");
        sistema.loginUsuario("jorge.panizo@gmail.com", "144WCV");

    }
}
