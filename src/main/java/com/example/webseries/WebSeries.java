package com.example.webseries;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ws")
public class WebSeries {

	@Id
	private String id;
	private String name;
	private String seasons;
	private String episodes;
	private String rating;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSeasons() {
		return seasons;
	}
	public String getEpisodes() {
		return episodes;
	}
	public String getRating() {
		return rating;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSeasons(String seasons) {
		this.seasons = seasons;
	}
	public void setEpisodes(String episodes) {
		this.episodes = episodes;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
}
