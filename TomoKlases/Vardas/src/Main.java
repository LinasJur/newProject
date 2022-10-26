import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String a = "MadaM";

        System.out.println(arTinka("maddam"));

    }

    public static boolean arTinka(String zodis) {
        StringBuilder sb = new StringBuilder(zodis);
        sb.reverse();
        String originalus = sb.toString();
        if (zodis.equals(kazkas)) {
            return true;
        } else {
            return false;
        }
    }
}