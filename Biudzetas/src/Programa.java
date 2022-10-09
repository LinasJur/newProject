import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        Biudzetas biudzetas = new Biudzetas();


        Scanner sc = new Scanner(System.in);

        System.out.println("Pasirinkite funkciją kurią norite atlikti:\n"  +

                "[1] Įrašai:\n" +
                "[2] Balansas:\n" +
                "[3] Gauti iš failo:\n" +
                "[4] Saugoti į failą:\n" +
                "[5] Išeiti iš programos!");

        boolean continueProgram = true;

        while (continueProgram){

            int userInput = sc.nextInt();

            switch (userInput) {

                case 1:
                    System.out.println(
                            "[1] Ivesti irasa:\n" +
                            "[2] Gauti irasa:\n" +
                            "[3] Trinti irasa:\n" +
                            "[4] Redaguoti irasa:");
                    int userInput1 = sc.nextInt();
                    switch (userInput1){
                        case 1:
                            System.out.println(
                                    "[1] Prideti pajamu irasa: \n" +
                                    "[2] Prideti islaidu irasa: ");
                            int userInput2 = sc.nextInt();
                            switch (userInput2) {
                                case 1:
                                    biudzetas.pridetiPajamuIrasa(sc);
                                    biudzetas.gautiPajamuIrasa();
                                    break;
                                case 2:
                                    biudzetas.pridetiIslaiduIrasa(sc);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println(
                                    "[1] Gauti pajamu irasa:\n" +
                                    "[2] Gauti islaidu irasa:");
                            int userInput3 = sc.nextInt();
                            switch (userInput3){
                                case 1:
                                    biudzetas.gautiPajamuIrasa();
                                    break;
                                case 2:
                                    biudzetas.gautiIslaiduIrasa();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Pasirinkite kuri irasa norite istrinti: ");
                            break;
                        case 4:
                            System.out.println("Pasirinkite kuri is irasu norite redaguoti: ");
                            break;
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    continueProgram = false;
                    break;
            }
            break;
        }


    }
    
}