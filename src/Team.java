import java.util.ArrayList;

public class Team {
    public ArrayList<Player> players;
    private String nameTeam;
    private int numberOfPlayer;

    public Team(String nameTeam){
        this.nameTeam=nameTeam;
        this.players=new ArrayList<>();
        this.numberOfPlayer=0;
    }

    public String getName() {
        return nameTeam;
    }

    public void addPlayer(Player player){
        players.add(player);
        this.numberOfPlayer++;
    }

    public ArrayList<Player> findPlayerByName(String name){
        ArrayList<Player> foundPlayer=new ArrayList<>();
        for(int c=0; c< this.numberOfPlayer;c++) {
            if(players.get(c).getName().equals(name))
                foundPlayer.add(players.get(c));
        }
        return foundPlayer;

    }

    public ArrayList<Player> findPlayerByRole(String role){
        ArrayList<Player> foundPlayerRole=new ArrayList<>();
        for(int c=0; c< this.numberOfPlayer;c++) {
            if(players.get(c).getRole().equals(role))
                foundPlayerRole.add(players.get(c));
        }
        return foundPlayerRole;

    }

}
