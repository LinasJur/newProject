import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Programa {


    public static void main(String[] args) {


        ArrayList<Integer> listas = new ArrayList<>();
        int kiekis;


        Programa prog = new Programa();


        prog.readElement(prog.readInteger());

    }
    public int  readInteger () {
        System.out.println("Iveskite bet koki sveika skaiciu: ");
        Scanner sc = new Scanner(System.in);
        int kiekis = 0;
        kiekis = sc.nextInt();
        return kiekis;
    }
    public ArrayList<Integer> readElement (int kiekis){
        System.out.println("iveskite skaicius");
        ArrayList<Integer> listas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < kiekis; i++) {
            listas.add(sc.nextInt());
        }
        System.out.println(listas);
        return listas;
    }
    public void finMin(ArrayList<Integer>) {
        ArrayList<Integer>listas = new ArrayList<>();
        listas.sort(listas, listas);
    }
}