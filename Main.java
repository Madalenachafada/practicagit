import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String frase = teclado.nextLine();
        int vocals=0;
        String[] fraseseparada= frase.split("");
        String[] vocales= {"a","e","i","o","u","A","E","I","O","U"};
        for (int i = 0; i < frase.length() ; i++) {
            for (int j = 0; j <vocales.length ; j++) {
                if (fraseseparada[i].equals(vocales[j])){
                    vocals++;
                }
            }
        }
        System.out.println(vocals);
    }
}
