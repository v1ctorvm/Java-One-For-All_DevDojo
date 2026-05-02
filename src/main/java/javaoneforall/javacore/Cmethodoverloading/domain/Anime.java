package javaoneforall.javacore.Cmethodoverloading.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;

    public void init(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    // Overloading, voce tem o mesmo atributo, mas com diferentes parametros
    public void init(String name, String type, int episodes, String status){
        this.init(name,type,episodes);
        this.status = status;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

}
