import java.util.Scanner;
public class BalokV2{
    Scanner in = new Scanner(System.in);
    private float panjang, lebar, tinggi;
    public BalokV2(){
        System.out.print("Masukkan panjang : ");
        panjang = in.nextFloat();
        in.nextLine();

        System.out.print("Masukkan lebar : ");
        lebar = in.nextFloat();
        in.nextLine();

        System.out.print("Masukkan tinggi : ");
        tinggi = in.nextFloat();
        in.nextLine();
    }
    private float hitungKeliling(){
        return 4*(panjang+lebar+tinggi);
    }
    private float hitungLuas(){
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    private float hitungVolume(){
        return panjang*lebar*tinggi;
    }
    public static void main(String[] args) {
        System.out.println("===== BALOK =====");
        System.out.println("1. Form input balok kecil");
        BalokV2 balokKecil = new BalokV2();
        System.out.println("\n2. Form input balok sedang");
        BalokV2 balokSedang = new BalokV2();
        System.out.println("\n3. Form input balok besar");
        BalokV2 balokBesar = new BalokV2();

        System.out.println("\n===== Hasil Perhitungan =====");
        System.out.println("1. Balok Kecil");
        System.out.println("Keliling: "+balokKecil.hitungKeliling());
        System.out.println("Luas: "+balokKecil.hitungLuas());
        System.out.println("Volume: "+balokKecil.hitungVolume());
        System.out.println("\n2. Balok Sedang");
        System.out.println("Keliling: "+balokSedang.hitungKeliling());
        System.out.println("Luas: "+balokSedang.hitungLuas());
        System.out.println("Volume: "+balokSedang.hitungVolume());
        System.out.println("\n3. Balok Besar");
        System.out.println("Keliling: "+balokBesar.hitungKeliling());
        System.out.println("Luas: "+balokBesar.hitungLuas());
        System.out.println("Volume: "+balokBesar.hitungVolume());
    }
}