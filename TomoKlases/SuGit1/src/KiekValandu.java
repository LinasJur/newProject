public class KiekValandu {

    public static void main(String[] args) {


    float [] laikas = {4 , 10, 6, 5 , 6, 4, 1 };

        System.out.println("Masyvas yra  tokio ilgio: " + laikas.length);
        System.out.println("Pirmas elementas yra: " + laikas[0]);
        System.out.println("Paskutinis elementas yra: " + laikas[6]);
        System.out.println("Elementai yra sie: ");
        for ( int i = 0 ; i < laikas.length; i++){

            System.out.println(laikas[i]);
        }

    }
}
