import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine();

        if(palabra.length() < 4){
            System.out.println(palabra.toUpperCase());
        } else if (palabra.length() < 8) {
            System.out.println(palabra.toLowerCase());            
        } else if (palabra.length() < 11) {
            palabra = palabra.replaceAll("a","á")
                    .replaceAll("e","é").replaceAll("i","í")
                    .replaceAll("o","ó").replaceAll("u","ú");
        } else {
            String palabraTransformada = "";
            for (int i = palabra.length()-1; i >= 0; i--) {
                palabraTransformada += palabra.charAt(i);
            }
            System.out.println(palabraTransformada);

        }
    }

}


