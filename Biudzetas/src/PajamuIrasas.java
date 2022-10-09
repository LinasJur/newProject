import java.time.LocalDateTime;

public class PajamuIrasas {

    private double suma;
    private String data = String.valueOf(LocalDateTime.now());
    private String kategorija;
    private String papildomaInfo;
    private String atsiskaitymoBudas;

    public PajamuIrasas(double suma, String data, String kategorija, String papildomaInfo, String atsiskaitymoBudas) {
    }

    public double getSuma() {
        return suma;
    }

    private void setSuma(double suma) {
        this.suma = suma;
    }

    private String getKategorija() {
        return kategorija;
    }

    private void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    private String getPapildomaInfo() {
        return papildomaInfo;
    }

    private void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    private void setData(String data) {
        this.data = data;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    @Override
    public String toString() {
        return "PajamuIrasas[" +
                "suma: " + suma +
                ", data: '" + data + '\'' +
                ", kategorija: '" + kategorija + '\'' +
                ", papildomaInfo: '" + papildomaInfo + '\'' +
                ", atsiskaitymoBudas: '" + atsiskaitymoBudas + '\'' +
                ']';
    }
}
