import java.util.Scanner;
public class ContohMenu{
    static void inputNilai(){
        System.out.println("Ini menu input");
    }
    static void tampilkanNilai(){
        System.out.println("Ini menu tampilkan nilai");
    }

    private static boolean x, y;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        x = true;
        do{
            System.out.println("\nContoh Menu");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampilkan Nilai");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");
            int pilihan = in.nextInt();
            in.nextLine();
            
            switch(pilihan){
                case 1:
                    inputNilai();
                    y = true;
                    break;
                case 2:
                    tampilkanNilai();
                    y = true;
                    break;
                case 3:
                    System.exit(0);
            }
        } while(x == y);
        in.close();
    }
}