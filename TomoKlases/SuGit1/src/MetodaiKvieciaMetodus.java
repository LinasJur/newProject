public class MetodaiKvieciaMetodus {

    public static void main(String[] args) {
    int a = 5;
    int b = 2;

    trikampis(a,b);

    }
    public static double trikampis ( int a , int b){
        double S = (a * b)/2;
        double x = (a*a + b*b);
        double c = Math.sqrt(x);
        double P = a + b + c;
        System.out.println("Trikampio plotas: " + S + "\n" + "Trikampio perimetras: " + P);
        return S + P;

    }
}
