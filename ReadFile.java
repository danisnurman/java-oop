import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    private static String string;
    public static void readFile() {
        try {
            File hasilSurvei = new File("survei.txt");
            Scanner scan = new Scanner(hasilSurvei);
            while (scan.hasNextLine()) {
                string = scan.nextLine().toLowerCase();
            }
            scan.close();
        }
        catch (FileNotFoundException e) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        readFile();
        int hitungKalimat = 0, hitungKata = 0, hitungAngka = 0, kataMuncul;
        String delimiters = "?!.";
        String[] kata = string.split("\\s+");

        // Soal A
        // [!?.:]+ is the sentence delimiter in java
        for (int i = 0; i < string.length(); i++) {
            // If the delimiters string contains the character
            if (delimiters.indexOf(string.charAt(i)) != -1) {
                hitungKalimat++;
            }
        }
        // End of Soal A
        
        // Soal D
        String[] angka = string.split("\\s+[0123456789]");
        hitungAngka += angka.length;
        hitungAngka -= 1;
        // End of Soal D

        // Soal B
        hitungKata += kata.length;
        hitungKata -= hitungAngka;
        // End of Soal B

        System.out.println("a. Jumlah kalimat\t= " + hitungKalimat); // Output A
        System.out.println("b. Jumlah kata\t\t= " + hitungKata); // Output B

        // Soal C
        System.out.println("c. Frekuensi kemunculan setiap kata sebanyak 3 kali");
        string = string.replaceAll("[0123456789,.]", " ");
        String [] kataString = string.split("\\s+");
        for (int i = 0; i < kataString.length; i++) {
            kataMuncul = 1;
            for (int j = i+1; j < kataString.length; j++) {
                if (kataString[i].equals(kataString[j])) {
                    kataMuncul += 1;
                    // Set words[j] to 0 to avoid printing visited word  
                    kataString[j] = "0";  
                }
                kataString[j] = kataString[j].toLowerCase();
            }                      
            // Displays the duplicate word if count is greater than 1
            if (kataMuncul == 3 && kataString[i] != "0") {
                System.out.println("   - " + kataString[i]); // Output C
            }
        }
        // End of Soal C
        System.out.println("d. Jumlah bilangan\t= " + hitungAngka); // Output D
    }
}
