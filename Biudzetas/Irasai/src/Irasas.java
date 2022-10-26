import java.time.LocalDate;

public class Irasas {

    static int counter = 0;
    private double id;
    private double suma;
    private LocalDate data;
    private String komentaras;

    public Irasas() {
        this.id = counter++;
    }

    @Override
    public String toString() {
        return String.format("id:%s, suma:%s, data: %s, papildoma informacija: %s", id, suma, data, komentaras);
    }
    public boolean equals(Object o){
        if (o instanceof Irasas && id == ((Irasas)o).getId()){
            return true;
        } else {
            return false;
        }
    }
    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
    }
    public Irasas(double suma, LocalDate data, String komentaras) {
        this();
        this.suma = suma;
        this.data = data;
        this.komentaras = komentaras;
    }
    public double getSuma() {
        return suma;
    }
    public void setSuma(double suma) {
        this.suma = suma;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getKomentaras() {
        return komentaras;
    }
    public void setKomentaras(String komentaras) {
        this.komentaras = komentaras;
    }

    public String toCsv() {
        return String.format("%s,%s,%s,%s", id, suma, data,komentaras);
    }
}
