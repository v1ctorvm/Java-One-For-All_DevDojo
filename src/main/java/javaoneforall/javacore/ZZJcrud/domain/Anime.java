package javaoneforall.javacore.ZZJcrud.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Anime {
    private Integer id;
    private String name;
    int episodes;
    Producer producer;
}



