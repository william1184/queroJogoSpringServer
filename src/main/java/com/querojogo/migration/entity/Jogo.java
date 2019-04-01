package com.querojogo.migration.entity;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by tcc2018 on 07/03/2018.
 */

@Document
public class Jogo {

    public static final String FIELD_NOME = "name";
    public static final String FIELD_CATEGORY = "category";
    public static final String FIELD_PLATAFORMAS = "plataforms";
    public static final String FIELD_GENEROS = "genres";
    
    @Id
    private String id;
    private String name;
    private List<Integer> platforms;
    private List<Integer> genres;
    private int category;
    private String cloudnaryId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public List<Integer> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Integer> platforms) {
        this.platforms = platforms;
    }

    public List<Integer> getGenres() {
        return genres;
    }

    public void setGenres(List<Integer> genres) {
        this.genres = genres;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    public String getImagemThumb(){
        return "https://images.igdb.com/igdb/image/upload/t_thumb/"+getCloudnaryId()+".jpg";
    }

    public String getImagemMedia(){
        return "https://images.igdb.com/igdb/image/upload/t_logo_med/"+getCloudnaryId()+".jpg";
    }

    public String getImagemGrande(){
        return "https://images.igdb.com/igdb/image/upload/t_cover_big/"+getCloudnaryId()+".jpg";
    }

	public String getCloudnaryId() {
		return cloudnaryId;
	}

	public Jogo setCloudnaryId(String cloudnaryId) {
		this.cloudnaryId = cloudnaryId;
		return this;
	}
}