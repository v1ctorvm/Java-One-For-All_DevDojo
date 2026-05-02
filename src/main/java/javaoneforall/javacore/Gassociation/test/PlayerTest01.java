package javaoneforall.javacore.Gassociation.test;

import javaoneforall.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    static void main() {

        Player p1 = new Player("Pelé");
        Player p2 = new Player("Romario");
        Player p3 = new Player("Cafu");

        Player[] players = {p1,p2,p3};

        System.out.println(players[0]);
        for (Player player : players) {
            player.print();
        }

    }
}
