import java.util.Scanner;
class HurufVokalKonsonan{
    // Deklarasi method -> <modifier> <tipedata> <namamethod>
    // Modifier static agar bisa dipanggil di main method tanpa membuat objek
    static String HapusHurufVokal(String paramTeks){
        return paramTeks.replaceAll("[AEIOUaeiou ]", ""); // return bisa menangkap nilai atau print sesuatu
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = in.nextLine();
        System.out.println(HapusHurufVokal(teks));
        in.close();
    }
}