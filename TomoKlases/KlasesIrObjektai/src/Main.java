import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String meniu = "A - sugeneruoti atsitiktini skaiciu nuo 1 iki 100\n" +
                       "B - sugeneruoti 10 atsitiktiniu skaiciu\n" +
                       "C -baigti darba";
        System.out.println(meniu);

        Scanner sc = new Scanner(System.in);
        int randomSkaicius;

        boolean veikiam = true;

           while (veikiam) {
               String variantas = sc.nextLine();

               int min = 1;
               int max = 100;

               switch (variantas) {

                   case "A":
                       randomSkaicius = (int) (Math.random()*(max-min+1)+min);
                       System.out.println("Atsitiktinis skaicius:" + randomSkaicius);
                       break;

                   case "B":
                       for (int i = 0; i < 10; i++){
                           randomSkaicius = (int) (Math.random()*(max-min+1)+min);
                           System.out.println(randomSkaicius);
                       }
                       break;

                   case "C":
                       veikiam = false;
               }
           }
       }
}
