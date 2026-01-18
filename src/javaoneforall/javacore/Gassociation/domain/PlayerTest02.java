package javaoneforall.javacore.Gassociation.domain;

public class PlayerTest02 {
    static void main() {

        Player player1 = new Player("Pelé");
        Team team1 = new Team("Brazil`s Nation Team");
        player1.setTeam(team1);

        player1.print();

    }
}
