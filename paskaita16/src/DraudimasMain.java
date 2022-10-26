public class DraudimasMain {

    public static void main(String[] args) {

        Draudimas tpvcaDraudimas = new TPVCADraudimas("Linas" , 150, "abc484" , "Lietuva" );
        Draudimas kaskoDraudimas = new KaskoDraudimas("petras", 160, "DDD123", "Estija");




        Draudimas draudimas = new TPVCADraudimas("Linas", 150);
        System.out.println(draudimas.getApdraustojoVardas());
        System.out.println(draudimas.getDraudimoSuma());





    }
}
