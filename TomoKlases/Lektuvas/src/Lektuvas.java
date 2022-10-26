import java.util.Random;

public class Lektuvas {

    Random random = new Random();


    public void isskleistiVaziuokle() {


        int randomInt = random.nextInt(10);
        int randomIntDenominator = random.nextInt(10);
        int result = 0;

        try {

            result = randomInt / randomIntDenominator;

            if (randomIntDenominator == 5) ;
            "Skrendu".charAt(20);




        } catch (ArithmeticException e) {

            System.out.println("Error: vaziuokles isskleisti nepavyko!");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: nepavyko isskleisti vaziuokles del kitos klaidos");
        }
        System.out.println("ok: vaziuokle sekmingai isskleista" + result);
    }

}

