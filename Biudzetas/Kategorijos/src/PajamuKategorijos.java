public enum PajamuKategorijos {

    ATLYGINIMAS(1, "Atlyginimas"),
    STIPENDIJA(2, "Stipendija"),
    PARDAVIMAI(3, "Pardavimai");

     private int numeris;
     private String paaiskinimas;


    PajamuKategorijos(int i, String description) {
        numeris = i;
        paaiskinimas = description;
    }

    public static PajamuKategorijos katPagalNum(int i) {
        for (PajamuKategorijos pk : values()) {
            if (pk.getNumeris() == i){
                return pk;
            }

        }
        return null;
    }
    public String toString(){
        return String.format("[%d] - %s", numeris, paaiskinimas);
    }


    public int getNumeris() {
        return numeris;
    }

    public String getPaaiskinimas() {
        return paaiskinimas;
    }
}
