package com.barterownia.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name= "video_games")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class VideoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
    private long price;
    private String genre;
    private String platform;
    private String publisher;
    private boolean isNew;
    private int pegi;

}