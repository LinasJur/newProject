import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
            metodukas(i);
        }


    }
     public static void metodukas(int i) {
        List<String> listas = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            listas.add(String.valueOf(i));
        }

        long startTime = System.nanoTime();
        codeExecute(listas);
        long estimatedTime = System.nanoTime() - startTime;


    }

    private static void codeExecute (List < String > c) {
        int size = c.size();
        Object o = c.get(size / 2);

    }
}