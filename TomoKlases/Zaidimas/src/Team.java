import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
   private String name;
   private int played = 0;
   private int won = 0;
   private int lost = 0;
   private int tied = 0;
   private List<T> playerList = new ArrayList<>();


    public void addPlayer (T player){
        playerList.add(player);

    }
    public void playMatch (Team <T> team, int ourScore, int theyrScore){

        if (ourScore > theyrScore) {
            won++;
        } else {
            lost++;
        }

        if (team != null) {

            team.playMatch(null, theyrScore, ourScore);
        }
    }

    public int compareTo (Team<T> o){
        if (o.won> this.won){
            System.out.println("mes pralaimejom");
            return 1;
        }
        if (o.won< this.won){
            System.out.println("mes laimejom");
            return -1;
        }
        return 0;
        }


}
