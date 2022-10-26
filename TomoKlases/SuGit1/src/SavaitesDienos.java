import java.util.Scanner;

public class SavaitesDienos {


    public static void main(String[] args) {

        String[]dienos = {"Pirmadienis", "Antradienis", "Treciadienis", "Ketvirtadienis", "Penktadienis", "Sestadienis", "Sekmadienis"};

        System.out.println(dienos.length);
        System.out.println("Paskutinis masyvo elementas yra: " + dienos[6]);
        System.out.println("Iveskite skaiciu tarp 1 ir 7");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a-1;
        System.out.println("Pasirinkta diena yra: " + dienos[b]);
    }
}
