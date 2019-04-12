import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        ArrayList<Player> playersFounded= new ArrayList<>();
        ArrayList<Team> teams=new ArrayList<>();
        int option;
        Scanner scanIn = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        do{
            System.out.println("--------Menù--------");
            System.out.println("--1.Add new player--");
            System.out.println("--2.Add new team--");
            System.out.println("--3.Search player by name--");
            System.out.println("--4.Search player by role--");
            System.out.println("--5.Exit--");
            option=scanner.nextInt();

            switch(option){

                case 1:
                    System.out.println("Insert all specifics of team");
                    String nameOfTeam=scanner.next();
                    for(int c=0; c<teams.size();c++) {
                        if(teams.get(c).getName().equals(nameOfTeam)) {
                            System.out.println("Write name of player:");
                            String namePlayer=scanIn.next();
                            System.out.println("Write surname of Player:");
                            String surname= scanIn.next();
                            System.out.println("Write role of player:");
                            String role=scanIn.next();
                            System.out.println("Write numberOfUniform of player");
                            int number= scanIn.nextInt();
                            Player player=new Player(namePlayer,surname,role,number);
                            teams.get(c).addPlayer(player);
                        }
                    }
                break;
                case 2:
                    System.out.println("Write name of team:");
                    String name=scanner.next();
                    Team team=new Team(name);
                    teams.add(team);
                break;
                case 3:
                    boolean flag= false;
                    System.out.println("Which team do you want to join?");
                    String nameTj=scanIn.next();
                    for(int c=0;c<teams.size();c++) {
                        if(teams.get(c).getName().equals(nameTj)) {
                            System.out.println("Write name of player:");
                            String nameP= scanIn.next();
                            playersFounded= teams.get(c).findPlayerByName(nameP);
                            flag=true;
                            break;
                        }
                    }
                    for(int c=0;c<playersFounded.size();c++) {
                        playersFounded.get(c).toString();
                    }
                    if(flag==false)
                        System.out.println("Team not founded,try again");
                    break;
                case 4:
                    boolean verify= false;
                    System.out.println("Which team do you want to join?");
                    String teamN =scanIn.next();
                    for(int c=0;c<teams.size();c++) {
                        if(teams.get(c).getName().equals(teamN)){
                            System.out.println("Write role of player:");
                            String pRole=scanIn.next();
                            playersFounded= teams.get(c).findPlayerByRole(pRole);
                            verify=true;
                            break;
                        }
                    }
                    for(int c=0; c<playersFounded.size();c++) {
                        playersFounded.get(c).toString();
                    }
                    if(verify==false)
                        System.out.println("Team not founded,try again");
                    break;
                 default:
                     System.out.println("Insert a number between 1 and 4");

            }
        }while(option!=0);
    }
}
