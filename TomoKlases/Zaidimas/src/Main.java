public class Main {


//sukurti abstrakcia klase Player.
//klase Player turi tureti kintamaji - name.
//sukurti keleta Player implementaciju - FootballPlayer, BasketballPlayer etc.
//sukurti klase Team, kuri priima Player tipo objektus.(geriau naudoti implementacijas)
//Team klase turi tureti laukus: String name, int played, won, lost, tied ir sarasa su zaidejais.
//Team klase turi tureti metoda, kuris leidzia prideti zaideju.
//Team klase turi tureti metoda playMatch, kuris priima parametra of type Team class, int ourScore, int theirScore.
//Jeigu ourScore yra didesnis, tada padidinam 'won' kintamaji, jeigu ne - padidinam 'lost' (nepamirskit to padaryti abiem komandom)
//klase Team turi implementuoti Comparable ir nurodyti atitinkama tipa.
//compareTo metodas turi tikrinti, kuri komanda laimejo daugiau zaidimu.


    public static void main(String[] args) {
        Team<BasketballPlayer> team1 = new Team();
        Team<BasketballPlayer> team2 = new Team();
        Team<FootballPlayer> team3 = new Team();


        team1.playMatch(team2, 14 , 12);
        team1.compareTo(team2);
    }
}
