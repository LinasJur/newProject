import java.util.Random;

public class LyginisSkaicius extends Skaicius{


    public void generuok(){
        int counter=0;
        while (true) {
            while (true){
                Random rand = new Random();
                int atsitiktinis = rand.nextInt(200-1)+1;
                if (atsitiktinis % 2 == 0) {
                skaiciai[counter] = atsitiktinis;
                break;
            }
        }
        counter++;
        if (counter == skaiciai.length){
            break;
        }
    }
}

}
