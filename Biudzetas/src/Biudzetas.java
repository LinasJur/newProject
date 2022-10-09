import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biudzetas {



    Scanner sc = new Scanner(System.in);
    int pridekPajamas = 0;
    int pridekIslaidas = 0;
    List<PajamuIrasas> pajamuSarasas = new ArrayList<>();
    List<IslaiduIrasas> islaiduSarasas = new ArrayList<>();


    public void pridetiPajamuIrasa(Scanner sc){
        System.out.println("Iveskite suma:");
        double suma = sc.nextDouble();
        System.out.println("Iveskite kategorija:");
        String kategorija = sc.nextLine();
        System.out.println("Iveskite papildoma informacija");
        String papildomaInfo = sc.nextLine();
        System.out.println("Iveskite atsiskaitymo buda (grynais/pavedimu)");
        String atsiskaitymoBudas = sc.nextLine();
        String data = String.valueOf(LocalDateTime.now());
        PajamuIrasas pridekPajamas = new PajamuIrasas(suma, data, kategorija, papildomaInfo, atsiskaitymoBudas);
        pajamuSarasas.add(pridekPajamas);
    }

    public void pridetiIslaiduIrasa(Scanner sc){
        System.out.println("Iveskite suma:");
        double suma = sc.nextDouble();
        System.out.println("Iveskite kategorija:");
        String kategorija = sc.nextLine();
        System.out.println("Iveskite papildoma informacija");
        String papildomaInfo = sc.nextLine();
        System.out.println("Iveskite atsiskaitymo buda (grynais/pavedimu)");
        String atsiskaitymoBudas = sc.nextLine();
        String data = String.valueOf(LocalDateTime.now());
        IslaiduIrasas pridekIslaidas = new IslaiduIrasas(suma, data, kategorija, papildomaInfo, atsiskaitymoBudas);
        islaiduSarasas.add(pridekIslaidas);
    }

    public void gautiPajamuIrasa(){
        pajamuSarasas.toString();

    }
    public void gautiIslaiduIrasa() {
        islaiduSarasas.toString();

    }
    //public void pridetiPajamuIrasa(double suma, String data, String kategorija, String papildomaInfo, String atsiskaitymoBudas){


       // PajamuIrasas[] pajamos = new PajamuIrasas[100];
       // PajamuIrasas pridekPajamas = new PajamuIrasas(suma, data, kategorija, papildomaInfo);
       // pajamuSarasas.add(pridekPajamas);

}
    //public void pridetiIslaiduIrasa(String data, double suma, String kategorija, String papildomaInfo, String atsiskaitymoBudas ){

        //   IslaiduIrasas[] islaidos = new IslaiduIrasas[0];
        //  islaidos[pridekIslaidas] = new IslaiduIrasas(data, suma, kategorija, papildomaInfo, atsiskaitymoBudas);
        // //  pridekIslaidas++;
        // }



