public class Sunkvezimis extends Automobilis{
    double krovinioTalpa;
    double krovinioSvoris;

    @Override
    public String spausdink() {
        return "Sunkvezimis{" +
                "krovinioTalpa=" + krovinioTalpa +
                ", krovinioSvoris=" + krovinioSvoris +
                '}';
    }

    public double getKrovinioTalpa() {
        return krovinioTalpa;
    }

    public void setKrovinioTalpa(double krovinioTalpa) {
        this.krovinioTalpa = krovinioTalpa;
    }

    public double getKrovinioSvoris() {
        return krovinioSvoris;
    }

    public void setKrovinioSvoris(double krovinioSvoris) {
        this.krovinioSvoris = krovinioSvoris;
    }

    public Sunkvezimis(int ratuSk, String spalva, double variklioTuris, int cilindruSk, double krovinioTalpa, double krovinioSvoris) {
        super(ratuSk, spalva, variklioTuris, cilindruSk);
    }



}
