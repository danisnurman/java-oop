import java.util.Scanner;
public class GanjilGenap{
    static int apakahGanjil(int inputBil){
        return inputBil%2;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input bilangan : ");
        int inputBil = in.nextInt();
        in.nextLine();

        int hasil = apakahGanjil(inputBil);
        if(hasil==0){
            System.out.println("Bilangan genap");
        } else if(hasil==1){
            System.out.println("Bilangan ganjil");
        } else{
            System.out.println("Error input");
        }
        in.close();
    }
}