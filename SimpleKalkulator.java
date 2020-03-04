import java.util.Scanner;
public class SimpleKalkulator{
    static double penjumlahan(double paramBil1, double paramBil2){
        return paramBil1 + paramBil2;
    }
    static double pengurangan(double paramBil1, double paramBil2){
        return paramBil1 - paramBil2;
    }
    static double perkalian(double paramBil1, double paramBil2){
        return paramBil1 * paramBil2;
    }
    static double pembagian(double paramBil1, double paramBil2){
        return paramBil1 / paramBil2;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input angka pertama : ");
        double bil1 = in.nextDouble();
        in.nextLine();

        System.out.print("Operasi? (+,-,*,/) : ");
        String operator = in.next();

        System.out.print("Input angka kedua : ");
        double bil2 = in.nextDouble();
        in.nextLine();

        double hasil = 0;
        switch(operator){
            case "+":
                hasil = penjumlahan(bil1, bil2);
                break;
            case "-":
                hasil = pengurangan(bil1, bil2);
                break;
            case "*":
                hasil = perkalian(bil1, bil2);
                break;
            case "/":
                hasil = pembagian(bil1, bil2);
                break;
        }
        System.out.println("Hasil : "+hasil);
        in.close();
    }
}