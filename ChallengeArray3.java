import java.util.Scanner; 
public class ChallengeArray3{
    private static float[] nilai;

    static void inputData(int paramLength){
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan data pada nilai array: ");
        nilai = new float[paramLength];
        for (int i=0; i<paramLength; i++){
            System.out.print("Nilai ke-"+(i+1)+": ");
            nilai[i] = in.nextFloat();
        }
        // in.close();
    }
    static void tampilkanData(float nilai[]){
        System.out.println("\nMenampilkan data dari array");
        for (int i=0; i<nilai.length; i++){
            System.out.print("Nilai ke-"+(i+1)+": "+nilai[i]+"\n");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ChallengeArray3 dataNilai = new ChallengeArray3();
        // Input 1
        for(int i=1; i<=2; i++){
            System.out.print("Masukkan panjang array ke-"+i+": ");
            int length = in.nextInt();
            inputData(length);
        }
        
        // Input 2
        // System.out.print("Masukkan panjang array kedua: ");
        // int length2 = in.nextInt();
        // inputData(length2);
        
        System.out.print("\n============================");
        tampilkanData(nilai);

        in.close();
    }
}