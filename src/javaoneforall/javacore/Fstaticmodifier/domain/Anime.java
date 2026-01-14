package javaoneforall.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    // 0 - Static Init Bock is executed when JVM loads the class and only once
    // 1 - Memory allocated
    // 2 - Each Class Atribtute is Initialized
    // 3 - Init Block is Executed
    // 4 - The Contructor is executed

    static {
        System.out.println("Inside init block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i;
        }
    }

    static {
        System.out.println("Inside init block 2");
    }

    static {
        System.out.println("Inside init block 3");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {


        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();

    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
