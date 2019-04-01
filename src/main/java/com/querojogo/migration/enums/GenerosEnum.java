package com.querojogo.migration.enums;

/**
 * Created by Familia on 06/11/2018.
 */
public enum GenerosEnum {


    PUZZLE(9 , "Puzzle"),
    TBS(16 , "Turn-based strategy (TBS)"),
    SHOOTER(5 , "Shooter"),
    PINBALL(30 , "Pinball"),
    RACING(10 , "Racing"),
    ADVENTURE(31 , "Adventure"),
    SPORT(14 , "Sport"),
    QUIZ_TRIVIA(26 , "Quiz/Trivia"),
    RPG(12 , "Role-playing (RPG)"),
    TACTICAL(24 , "Tactical"),
    POINT(2 , "Point-and-click"),
    SIMULATOR(13 , "Simulator"),
    PLATFORM(8 , "Platform"),
    INDIE(32 , "Indie"),
    RTS(11 , "Real Time Strategy (RTS)"),
    FIGHTING(4 , "Fighting"),
    MUSIC(7 , "Music"),
    STRATEGY(15 , "Strategy"),
    HACK_SLASH(25 , "Hack and slash/Beat 'em up"),
    ARCADE(33 , "Arcade");


    private String genero_nome;
    private int genero_id;

    GenerosEnum(int id, String nome){
        this.genero_nome = nome;
        this.genero_id = id;

    }

    public String getGenero_nome() {
        return genero_nome;
    }

    public void setGenero_nome(String genero_nome) {
        this.genero_nome = genero_nome;
    }

    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }




}
