package com.querojogo.migration.enums;

/**
 * Created by Familia on 06/11/2018.
 */
public enum PlataformaEnum {
    VAZIO(-1,"Selecione uma plataforma", "vazio"),
    N3DS(37,"Nintendo 3DS", "N3DS"),
    PS4(48,"PlayStation 4", "PS4"),
    PS3(9,"PlayStation 3", "PS3"),
    XBOX_ONE(49,"Xbox ONE", "XBOX ONE"),
    XBOX_360(12,"Xbox 360", "XBOX 360"),
    WII(5,"Wii", "WII"),
    WII_U(41,"Wii U","WIIU"),
    SWITCH(130,"Nintendo Switch","SWITCH");

    private String plataforma_nome;
    private String plataforma_abr;
    private int plataforma_id;

    PlataformaEnum(int id,String nome, String plataforma_abr){
        this.plataforma_nome = nome;
        this.plataforma_id = id;
        this.plataforma_abr = plataforma_abr;
    }

    public static int getPlataformaIdByName(String nome){
        for (PlataformaEnum p : PlataformaEnum.values()) {
            if(p.plataforma_nome.equals(nome)){
                return p.plataforma_id;
            }
        };
        return -1;
    };

    public static String getPlataformaNameById(int id){
        for (PlataformaEnum p : PlataformaEnum.values()) {
            if(p.plataforma_id == id ){
                return p.plataforma_abr;
            }
        };
        return "";
    };

    public int getPlataforma_id() {
        return plataforma_id;
    }

    @Override
    public String toString() {
        return this.plataforma_nome;
    }


}
