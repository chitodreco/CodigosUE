import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine();

        if(palabra.length() < 4){
            System.out.println(palabra.toUpperCase());
        } else if ((palabra.length() >= 4) && (palabra.length()<8)) {
            System.out.println(palabra.toLowerCase());            
        } else if ((palabra.length() > 8) && (palabra.length() < 11)) {
            String[] letras = palabra.split("");
            for (String item:letras) {
                if (item.equals("a")){
                    item = "á";
                } else if (item.equals("e")) {
                    item = "é";
                } else if (item.equals("i")) {
                    item = "í";
                } else if (item.equals("o")) {
                    item = "ó";
                } else if (item.equals("u")) {
                    item = "ú";
                }
                    System.out.print(item);
            }
        } else {
            String[] letras = palabra.split("");
            for (int i = 0; i < palabra.length()-1; i++) {
                palabra.
            }

            }
        }

    }


