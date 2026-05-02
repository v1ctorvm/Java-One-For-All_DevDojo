package javaoneforall.javacore.Gassociation.domain;

public class Player {
    private String name;
    private Team team;

    public void print(){
        System.out.println("Name: "+ this.name);
        if (this.team != null) {
            System.out.println("Team: " + this.team.getName());
        }
    }



    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
