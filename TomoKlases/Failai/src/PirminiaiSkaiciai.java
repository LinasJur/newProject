import java.util.Scanner;

public class PirminiaiSkaiciai {


    public static void main(String[] args) {

        String s1 = "Labas";
        String s2 = "Vakaras";







    }
    public static String mixStrigs(String s1 , String s2){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }

        System.out.println(sb.toString());
        return sb.toString();
    }
}

