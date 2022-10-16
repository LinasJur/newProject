import java.time.LocalDate;
import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas {



    private IslaiduKategorijos kategorijos;

    public IslaiduIrasas(double suma, LocalDate data, String komentaras, IslaiduKategorijos kategorijos) {
        super(suma, data, komentaras);
        this.kategorijos = kategorijos;
    }

    public IslaiduIrasas() {
        super();
    }

    public IslaiduKategorijos getKategorijos() {
        return kategorijos;
    }


    public void setKategorijos(IslaiduKategorijos kategorijos) {
        this.kategorijos = kategorijos;
    }

    @Override
    public String toString() {
        return String.format("Islaidos:" + "kategorija: %s, %s", kategorijos, super.toString());
    }


}
