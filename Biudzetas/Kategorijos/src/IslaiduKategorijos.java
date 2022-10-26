public enum IslaiduKategorijos {

    MOKESCIAI(1, "Mokesciai"),
    TRANSPORTAS(2, "Transportas"),
    MAISTAS(3, "Maistas"),
    KOMUNALINIAI(4, "Komunaliniai"),
    NUOMA(5, "Nuoma");


    private int numeris;
    private String paaiskinimas;

    IslaiduKategorijos(int i, String description) {
        numeris = i;
        paaiskinimas = description;
    }

    public static IslaiduKategorijos katPagalNum(int i) {
        for (IslaiduKategorijos ik : values()) {
            if (ik.getNumeris() == i){
                return ik;
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