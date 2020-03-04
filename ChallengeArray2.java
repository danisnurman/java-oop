import java.util.Scanner; 
public class ChallengeArray2{
    private static int length;
    static void tampilkanData(float nilai[]){
        System.out.println("\nMenampilkan data dari array");
        for (int i=0; i<nilai.length; i++){
            System.out.print("Nilai ke-"+(i+1)+": "+nilai[i]+"\n");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float[] nilai1, nilai2;
        System.out.print("Masukkan panjang array pertama: ");
        length = in.nextInt();
        nilai1 = new float[length];
        System.out.println("Masukkan data pada nilai: ");
        for (int i=0; i<nilai1.length; i++){
            System.out.print("Nilai ke-"+(i+1)+": ");
            nilai1[i] = in.nextFloat();
        }

        System.out.print("\nMasukkan panjang array kedua: ");
        length = in.nextInt();
        nilai2 = new float[length];
        System.out.println("Masukkan data pada nilai: ");
        for (int i=0; i<nilai2.length; i++){
            System.out.print("Nilai ke-"+(i+1)+": ");
            nilai2[i] = in.nextFloat();
        }

        System.out.print("\n============================");
        tampilkanData(nilai1);
        tampilkanData(nilai2);
        
        in.close();
    }
}