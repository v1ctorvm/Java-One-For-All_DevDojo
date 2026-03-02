package javaoneforall.javacore.ZZDoptional.domain;

public class Manga {
    private String title;
    private Integer ID;
    private int chapters;

    public Manga(Integer ID,String name, int chapters) {
        this.ID = ID;
        this.title = name;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public Integer getID() {
        return ID;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "name='" + title + '\'' +
                ", ID=" + ID +
                ", chapters=" + chapters +
                '}';
    }
}
