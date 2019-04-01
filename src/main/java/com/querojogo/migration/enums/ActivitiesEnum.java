package com.querojogo.migration.enums;

/**
 * Created by Familia on 06/11/2018.
 */
public enum ActivitiesEnum {

    MAIN(1),
    MEUS_JOGOS(2),
    CONVERSAS(3),
    FAVORITOS(4),
    CADASTRO_USUARIO(5),
    CADASTRO_ANUNCIO(6),
    LOGIN(7);

    private int activity_id;

    ActivitiesEnum(int id){
        this.activity_id = id;
    }

    public int getActivityId() {
        return activity_id;
    }

}
