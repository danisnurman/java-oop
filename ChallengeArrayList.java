import java.util.ArrayList;
import java.util.Scanner;
public class ChallengeArrayList{
    public static ArrayList<Float> nilai = new ArrayList<Float>();
    static Scanner in = new Scanner(System.in);

    static void menu(){
        System.out.println("\n========== MENU ==========");
        System.out.println("1. Input data nilai");
        System.out.println("2. Lihat data nilai");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
        char menu = in.next().charAt(0);
        switch(menu){
            case '1':
                inputData();
                break;
            case '2':
                lihatData();
                break;
            case '3':
                System.exit(0);
            default: 
                System.out.println("Input tidak valid!");
                break;
        }
        in.close();
    }

    static void inputData(){
        boolean x = true;
        boolean y = true;
        String ulang;

        do{
            System.out.println("----- 1. Input data -----");
            System.out.print("Masukkan data: ");
            float addNilai = in.nextFloat();
            nilai.add(addNilai);

            do{
                System.out.print("Apakah Anda mau input data lagi? (y/n): ");
                ulang = in.next();
                if (ulang.equals("Y") || ulang.equals("y")){
                    y = true;
                } else if (ulang.equals("N") || ulang.equals("n")){
                    menu();
                    y = true;
                } else {
                    y = false;
                    System.out.println(">>> Error. Input Y/N.");
                }
            } while(x!=y);
        } while(ulang.equals("Y") || ulang.equals("y"));    
        in.close();
    }
    static void lihatData(){
        System.out.println("----- 2. Lihat data -----");
        for(int i = 0; i < nilai.size(); i++){
            System.out.println("Data ke-"+(i+1)+": "+nilai.get(i));
        }
        menu();
    }
    public static void main(String[] args) {
        menu();        
    }
}