package javaoneforall.javacore.Einitializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

    // 1 - Memory allocated
    // 2 - Each Class Atribtute is Initialized
    // 3 - Init Block is Executed
    // 4 - The Contructor is executed

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {


        for (int episode : episodes) {
            System.out.print(episode + " ");
        }

    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
