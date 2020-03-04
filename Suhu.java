// Referensi https://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner
import java.util.Scanner;
class Konversi{
    Scanner in = new Scanner(System.in);
    public void getMenu(){
        System.out.print("\033\143");
        System.out.println("KALKULATOR SUHU");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Keluar Aplikasi");
        System.out.print("Pilihan (1-4) : ");
        while(!in.hasNextInt()){
            System.out.println("Error input!");
            System.out.print("Please input between 1 and 4 : ");
            in.next();
        }
        int pilihSuhu = in.nextInt();
        switch(pilihSuhu){
            case 1:
                getCelcius();
                break;
            case 2:
                getFahrenheit();
                break;
            case 3:
                getKelvin();
                break;
            case 4:
                System.out.println("\nGood Bye!\n");
                System.exit(0);
            default:
                getMenu();
        }
    }
    public float getCelcius(){
        System.out.print("Suhu dalam Celcius : ");
        float Cel = in.nextFloat();
        System.out.println("\nKonversi ke?");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.print("Pilihan (1-2) : ");
        while(!in.hasNextInt()){
            System.out.println("Error input!");
            System.out.print("Please input between 1 and 2 : ");
            in.next();
        }
        int pilihKonversi = in.nextInt();
        switch(pilihKonversi){
            case 1:
                float CtoF = (Cel*9/5)+32;
                System.out.println("Suhu "+Cel+" C dalam Fahrenheit = "+CtoF+" F");
                break;
            case 2:
                float CtoK = Cel+273;
                System.out.println("Suhu "+Cel+" C dalam Kelvin = "+CtoK+" K");
                break;
            default:
                System.out.println("===========");
                System.out.println(">>> ERROR INPUT");
        }
        return Cel;
    }
    public float getFahrenheit(){
        System.out.print("Suhu dalam Fahrenheit : ");
        float Fah = in.nextFloat();
        System.out.println("\nKonversi ke?");
        System.out.println("1. Celcius");
        System.out.println("2. Kelvin");
        System.out.print("Pilihan (1-2) : ");
        while(!in.hasNextInt()){
            System.out.println("Error input!");
            System.out.print("Please input between 1 and 2 : ");
            in.next();
        }
        int pilihKonversi = in.nextInt();
        switch(pilihKonversi){
            case 1:
                float FtoC = (Fah-32)*5/9;
                System.out.println("Suhu "+Fah+" F dalam Celcius = "+FtoC+" C");
                break;
            case 2:
                float FtoK = (Fah-32)*5/9+273;
                System.out.println("Suhu "+Fah+" F dalam Kelvin = "+FtoK+" K");
                break;
            default:
                System.out.println("===========");
                System.out.println(">>> ERROR INPUT");
        }
        return Fah;
    }
    public float getKelvin(){
        System.out.print("Suhu dalam Kelvin : ");
        float Kel = in.nextFloat();
        System.out.println("\nKonversi ke?");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.print("Pilihan (1-2) : ");
        while(!in.hasNextInt()){
            System.out.println("Error input!");
            System.out.print("Please input between 1 and 2 : ");
            in.next();
        }
        int pilihKonversi = in.nextInt();
        switch(pilihKonversi){
            case 1:
                float KtoC = Kel-273;
                System.out.println("Suhu "+Kel+" K dalam Celcius = "+KtoC+" C");
                break;
            case 2:
                float KtoF = (Kel-273)*9/5+32;
                System.out.println("Suhu "+Kel+" K dalam Fahrenheit = "+KtoF+" F");
                break;
            default:
                System.out.println("===========");
                System.out.println(">>> ERROR INPUT");
        }
        return Kel;
    }
}
public class Suhu{
    public static void main(String[] args){
        Konversi suhu = new Konversi();
        Scanner in = new Scanner(System.in);
        String ulang;
        do{
            suhu.getMenu();
            boolean x = true;
            boolean y = true;
            do{            
                System.out.println("==================================================");
                System.out.print("Apakah Anda ingin menghitung suhu lagi? (Y/N) : ");
                ulang = in.next();
                if(ulang.equals("Y") || ulang.equals("y")){
                    y = true;
                } else if (ulang.equals("N") || ulang.equals("n")){
                    y = true;
                } else {
                    y = false;
                    System.out.println(">>> Please input 'y' or 'n'!");
                }
            } while(x!=y);
        } while(ulang.equals("Y") || ulang.equals("y"));
        System.out.println("\nTERIMA KASIH TELAH MENGGUNAKAN KALKULATOR INI\n");
        in.close();
    }
}