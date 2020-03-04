import java.util.Scanner; 
public class ChallengeArray{
    public static void main(String[] args) {
        int length1, length2;
        float[] nilai1, nilai2;
        Scanner in = new Scanner(System.in);

        // Array 1
        System.out.print("Masukkan panjang array ke-1: ");
        length1 = in.nextInt();
        nilai1 = new float[length1];
        System.out.println("Masukkan data pada nilai1: ");
        for (int i = 0; i < length1; i++){
            System.out.print("Nilai ke-"+(i+1)+": ");
            nilai1[i] = in.nextFloat();
        }

        // Array 2
        System.out.print("\nMasukkan panjang array ke-2: ");
        length2 = in.nextInt();
        nilai2 = new float[length2];
        System.out.println("Masukkan data pada nilai2: ");
        for (int i = 0; i < length2; i++){
            System.out.print("Nilai ke-"+(i+1)+": ");
            nilai2[i] = in.nextFloat();
        }

        // Output
        System.out.println("\n===================================");
        System.out.println("\nMenampilkan data dari array nilai1");
        for (int i=0; i<length1; i++){
            System.out.print("Nilai ke-"+(i+1)+": "+nilai1[i]+"\n");
        }
        System.out.println("\nMenampilkan data dari array nilai2");
        for (int i=0; i<length2; i++){
            System.out.print("Nilai ke-"+(i+1)+": "+nilai2[i]+"\n");
        }
        in.close();
    }
}