import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String frase = teclado.nextLine();
        int vocals=0;
        int contadordeo=0;
        String[] fraseseparada= frase.split("");
        String[] vocales= {"a","e","i","o","u","A","E","I","O","U"};
        for (int i = 0; i < frase.length() ; i++) {
            if (fraseseparada[i].equals("o")){
                contadordeo++;
            }
            if (fraseseparada[i].equals("O")){
                contadordeo++;
            }
            for (int j = 0; j <vocales.length ; j++) {
                if (fraseseparada[i].equals(vocales[j])){
                    vocals++;
                }
            }
        }
        System.out.println("El numero de vocals es: "+vocals);
        System.out.println("EL numero de O es: "+contadordeo);
    }
}
