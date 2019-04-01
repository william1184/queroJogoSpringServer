package com.querojogo.migration.entity;

/**
 * Created by tcc2018 on 07/03/2018.
 */

public class Cover {
//    private final String URL_IMAGEM = "https://images.igdb.com/igdb/image/upload/t_{size}/{hash}.jpg";
    private String url ;
    private String cloudnaryId;

    //cover_small,screenshot_med,cover_big,logo_med,screenshot_big,screenshot_huge,thumb,micro,720p,1080p


    public String getUrl() {
        return url;
    }

    public String getCloudnaryId() {
		return cloudnaryId;
	}

	public Cover setCloudnaryId(String cloudnaryId) {
		this.cloudnaryId = cloudnaryId;
		return this;
	}

	public void setUrl(String url) {
        this.url = url;
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


}
