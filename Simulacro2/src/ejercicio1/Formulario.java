package ejercicio1;

import ejercicio1.utils.TipoDatoIncorrectoException;

import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;
        String nombre = "";
        String apellido = "";
        String dni = "";
        String email = "";

        do {
            System.out.println("1. Rellenar nombre");
            System.out.println("2. Rellenar apellidos");
            System.out.println("3. Rellenar DNI");
            System.out.println("4. Rellenar email");
            System.out.println("5. Finalizar");
            System.out.println("Seleccione una opción: ");
            option = scanner.nextInt();
            switch (option) {

                case 1:
                    System.out.println("Introduzca su nombre: ");
                    nombre = scanner.nextLine();
                    for (int i = 0; i < nombre.length(); i++) {
                        boolean esDigito = Character.isDigit(nombre.charAt(i));
                        if (esDigito){
                            try{
                                throw new TipoDatoIncorrectoException("El dato no es correcto");
                            }catch (TipoDatoIncorrectoException e){
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduzca su apellido: ");
                    apellido = scanner.nextLine();
                    for (int i = 0; i < apellido.length(); i++) {
                        boolean esDigito = Character.isDigit(apellido.charAt(i));
                        if(esDigito){
                            try{
                                throw new TipoDatoIncorrectoException("El dato no es correcto");
                            }catch (TipoDatoIncorrectoException e){
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduzca su DNI: ");
                    dni = scanner.nextLine();
                    if (dni.length() != 9){
                        try{
                            throw new LongitudDNINoValidaException("Longitud incorrecta");
                        } catch (LongitudDNINoValidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    boolean esDigitoUlt = Character.isDigit(dni.charAt(dni.length()-1));
                    if (esDigitoUlt){
                        try{
                            throw new UltimoDigitoNoLetraException("El último caracter es un dígito");
                        } catch (UltimoDigitoNoLetraException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    for (int i = 0; i < dni.length()-2; i++) {
                        boolean esDigito = Character.isDigit(dni.charAt(i));
                        if (!esDigito){
                            try{
                                throw new NumeracionContieneLetrasException("DNI erroneo");
                            } catch (NumeracionContieneLetrasException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Introduzca su emaiL: ");
                    email = scanner.nextLine();
                    if (!(email.contains("@") && email.contains("."))){
                        try{
                            throw new EmailIncorrectoExcepcion("Email incorrecto");
                        } catch (EmailIncorrectoExcepcion e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 5:
                    if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || email.isEmpty()){
                        System.out.println("Faltan datos por rellenar");
                        option = 1;
                    }
                    break;
            }
        }while (option!=5);
    }




}
