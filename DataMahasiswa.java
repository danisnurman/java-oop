import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DataMahasiswa{
    static ArrayList<String> mhsNIM = new ArrayList<>();
    static ArrayList<String> mhsNama = new ArrayList<>();
    static ArrayList<String> mhsMerged = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    private static String nim, nama, ulang;
    private static boolean x = true, y = true;
    private static int mhsIndex = 0;

    public static void lihatMenu(){
        System.out.println("\n## Database Mahasiswa PTI UNY ##");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Tampilkan Data");
        System.out.println("4. Keluar");
        System.out.print("Pilih: ");
        char pilihMenu = scan.next().charAt(0);
        switch(pilihMenu){
            case '1':
                tambahMhs();
                break;
            case '2':
                hapusMhs();
                lihatMenu();
                break;
            case '3':
                lihatMhs();
                lihatMenu();
                break;
            case '4':
                System.exit(0);
            default:
                System.out.println("Input tidak valid!");
                lihatMenu();
                break;
        }
    }

    public static void tambahMhs(){
        do{
            System.out.println("\n----- 1. Tambah data -----");
            System.out.print("Masukkan NIM: ");
            nim = scan.next();
            scan.nextLine();
            System.out.print("Masukkan Nama: ");
            nama = scan.nextLine();
            setMhs(nim, nama);
            
            do{
                System.out.print("\nApakah Anda mau input data lagi? (y/n): ");
                ulang = scan.next();
                ulang = ulang.toLowerCase();
                scan.nextLine();
                if (ulang.equals("y")){
                    y = true;
                } else if (ulang.equals("n")){
                    lihatMenu();
                    y = true;
                } else {
                    y = false;
                    System.out.println(">> Please input: 'y' or 'n'!");
                }
            } while(x!=y);
        } while(ulang.equals("y"));
    }

    public static void setMhs(String paramNIM, String paramNama){
        char[] charName = paramNama.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < charName.length; i++) {
            if(Character.isLetter(charName[i])){
                if(!found){
                    charName[i] = Character.toUpperCase(charName[i]);
                }
                found = true;
            } else {
                found = false;
            }
        }
        mhsNIM.add(paramNIM);
        mhsNama.add(String.valueOf(charName));
        mhsMerged.add(mhsNIM.get(mhsIndex) + "  " + mhsNama.get(mhsIndex));
        mhsIndex++;
    }

    public static void hapusMhs(){
        int presensi;
        System.out.println("\n----- 2. Hapus data -----");
        System.out.print("Masukkan Nomor Presensi: ");
        presensi = scan.nextInt();
        scan.nextLine();
        mhsMerged.remove(presensi-1);
    }

    public static void lihatMhs(){
        int numbering = 1;
        System.out.println("\n----- 3. Tampilkan data -----");
        System.out.println("No | NIM       | Nama");
        Collections.sort(mhsMerged);
        for (String listMhs : mhsMerged) {
            System.out.println(numbering + ".  " + listMhs);
            numbering++;
        }
    }
    public static void main(String[] args) {
        lihatMenu();
    }
}