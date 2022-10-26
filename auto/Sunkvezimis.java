import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sunkvezimis {

    LocalDateTime registracijosData = LocalDateTime.now();
    Integer maksimalusKrovinioDydis;
    String spalva;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Sunkvezimis() {}

    public void važiuoti(){
        System.out.println("vaziuoja");
    }

    @Override
    public String toString() {
        return "Sunkvezimis{" +
                "registracijosData=" + registracijosData.format(formatter) +
                ", maksimalusKrovinioDydis=" + maksimalusKrovinioDydis +
                ", spalva='" + spalva + '\'' +
                '}';
    }
}
