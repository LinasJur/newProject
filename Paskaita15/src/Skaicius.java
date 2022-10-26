import java.util.Random;

public abstract class Skaicius {



    protected final int [] skaiciai;



   public Skaicius(){

       Random random = new Random();
       int min = 20;
       int max = 200;
       int dydis = random.nextInt(max-min)+min;
       skaiciai = new int [dydis];
   }
   public abstract void generuok();

   public int suma(){
       long sum=0;
       int i;
       for (i =0; i< skaiciai.length; i++)
            sum+= skaiciai[i];
       return (int) sum;

   }
   public int[] getSkaiciai() {
        return skaiciai;
   }
}