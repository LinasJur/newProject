import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Automobilis {

    LocalDateTime registracijosData = LocalDateTime.now();
    Integer bagazinesTalpa;
    String spalva;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Automobilis() {}

    public void važiuoti(){
        System.out.println("vaziuoja");
    }

    @Override
    public String toString() {
        return "Automobilis{" +
                "registracijosData=" + registracijosData.format(formatter) +
                ", bagazinesTalpa=" + bagazinesTalpa +
                ", spalva='" + spalva + '\'' +
                '}';
    }
}
