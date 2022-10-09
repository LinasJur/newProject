import java.time.LocalDateTime;

public class IslaiduIrasas {

    private String data = String.valueOf(LocalDateTime.now());
    private double suma;
    private String kategorija;
    private String papildomaInfo;
    private String atsiskaitymoBudas;



    public IslaiduIrasas(double suma, String data, String kategorija, String papildomaInfo, String atsiskaitymoBudas) {
    }

    public double getSuma() {
        return suma;
    }

    private void setSuma(int suma) {
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

    private String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    private void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    private void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "IslaiduIrasas[" +
                "data: '" + data + '\'' +
                ", suma: " + suma +
                ", kategorija: '" + kategorija + '\'' +
                ", papildomaInfo: '" + papildomaInfo + '\'' +
                ", atsiskaitymoBudas: '" + atsiskaitymoBudas + '\'' +
                ']';
    }
}
