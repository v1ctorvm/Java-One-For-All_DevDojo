package javaoneforall.javacore.Gassociation.test;

import javaoneforall.javacore.Gassociation.domain.Player;
import javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    static void main() {

        Player player = new Player("Pelé");
        Player player2 = new Player("Kaka");
        Team team = new Team("Brazil");
        Player[] players = {player,player2};

        player.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("----- Player -----");
        player.print();
        player2.print();

        System.out.println("----- Team -----");
        team.print();

    }
}
