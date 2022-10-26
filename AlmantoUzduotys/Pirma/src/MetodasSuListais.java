import java.util.ArrayList;
import java.util.List;

public class MetodasSuListais {

    public static void main(String[] args) {

        List<Integer> skaiciuksai = new ArrayList<>();


    }

    static void suma(List<Integer> skaiciuksai, int a, int b) {
        int skaiciuSuma = 0;
        for (int i = a; i <= b; i++) {
            skaiciuksai.add(i);
            skaiciuSuma += skaiciuksai.get(i);

            System.out.println(skaiciuSuma);

        }

}



