import java.util.Arrays;
import java.util.Scanner;

public class FirstPRogram {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] skaiciai = new int[100];

        int [] skaiciai






    }



    static int[] getInt (String reiksmes){
        System.out.println("Iveskite bet kokį kiekį skaičių: ");

        String[] skaldyk = reiksmes.split(" ");
        int[] skaiciai = new int[skaldyk.length];
        for ( int i = 0 ; i < skaldyk.length ; i++){
            skaiciai[i] = Integer.parseInt(skaldyk[i]);
        }
        return skaiciai;
    }


    public void printArray (int[]skaiciai) {
        int i;
        for (i = 0 ; i < skaiciai.length; i++) {
            System.out.println(skaiciai[i]);
        }

    }

    public void sortInteger (int[]skaiciai) {
        int i;
        Arrays.sort(skaiciai);
        for ( i = 0 ; i < skaiciai.length; i++);{
            System.out.println(skaiciai[i]);
        }

    }









}
