public class Skaiciuokle {
    public static void main(String[] args) {

        double a = 47;
        saknis(a);
        kvadratu(a);

    }

    public static double kvadratu(double a){
        double rezultatas = a * a;
       System.out.println("Skaicius " + a + " kvadratu yra: " +rezultatas);
        return rezultatas;
    }

    public static double saknis(double a){
        double rezultatas = Math.sqrt(a);
       System.out.println("Skaiciaus " + a + " saknis yra: " +rezultatas);
        return rezultatas;
    }
}
