import java.time.LocalDate;
import java.time.LocalDateTime;

public class PajamuIrasas extends Irasas {


    private PajamuKategorijos kategorijos;




    public PajamuIrasas(double suma, LocalDate data, String komentaras, PajamuKategorijos kategorijos){
        super(suma, data, komentaras);
        this.kategorijos = kategorijos;
    }

    public PajamuIrasas() {
        super();
    }

    public PajamuKategorijos getKategorijos() {
        return kategorijos;
    }

    public void setKategorijos(PajamuKategorijos kategorijos) {
        this.kategorijos = kategorijos;
    }

    @Override
    public String toString() {
        return String.format("Pajamos:" + "kategorija: %s, %s", kategorijos, super.toString());
    }


}
