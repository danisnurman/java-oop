import java.util.Scanner;
public class HurufVokalKonsonanV2{
    static String HapusHurufVokal(String paramTeks){
        String konsonan = "";
        // System.out.println("Isi paramTeks : "+paramTeks);
        for(char karakter:paramTeks.toCharArray()){
            // System.out.println(karakter);
            if(karakter!='a' && karakter!='e' && karakter!='i' && karakter!='o' && karakter!='u' && karakter!=' '){
                konsonan+=karakter;
            }
        }
        return konsonan;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = in.nextLine();
        System.out.println("\nTeks Asli : "+teks);
        
        // Mengubah menjadi lowercase disimpan dalam variabel yang sama untuk menghemat alokasi memori
        teks = teks.toLowerCase();
        System.out.println("Teks Lower : "+teks);
        System.out.println("Tanpa Vokal : "+HapusHurufVokal(teks));
        in.close();
    }
}