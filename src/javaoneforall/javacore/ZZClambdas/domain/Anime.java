package javaoneforall.javacore.ZZClambdas.domain;

public class Anime {
    private String title;
    private int episode;

    public Anime(String title, int episodes) {
        this.title = title;
        this.episode = episodes;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episode;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episode +
                '}';
    }
}
