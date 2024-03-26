//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        System.out.println("introduceti textul");
       String text=scanner.nextLine();

        String[] cuvinte = text.split("[^a-zA-ZăâîșțĂÂÎȘȚ]+");
        String[] cuvinteUnice = new String[cuvinte.length]; // Alocare array pentru cuvintele unice
        int index = 0; // Indexul pentru cuvintele unice

        for (String cuvant : cuvinte) {
            if (cuvant.length() > 1 && cuvant.charAt(0) == cuvant.charAt(cuvant.length() - 1)) {
                // Verifica daca cuvantul este unic
                if (!contains(cuvinteUnice, cuvant.toLowerCase(), index)) {
                    cuvinteUnice[index++] = cuvant.toLowerCase();
                }
            }
        }

        System.out.println("Cuvintele din text care incep si se termina cu aceeasi litera, fara repetare:");

        // Afisare cuvinte unice
        for (int i = 0; i < index; i++) {
            System.out.println(cuvinteUnice[i]);
        }
    }
    // Metoda pentru verificarea existentei unui cuvant intr-un array
    public static boolean contains(String[] array, String cuvant, int index) {
        for (int i = 0; i < index; i++) {
            if (array[i] != null && array[i].equals(cuvant)) {
                return true;
            }
        }
        return false;
    }
}
