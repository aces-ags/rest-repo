package com.rest.spring.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "album")
public class Album implements Serializable {

	private static final long serialVersionUID = 1L;

	private String albumName;
	private String artistName;
	private String relaseDate;
	private String genre;
	private BigDecimal price = BigDecimal.ZERO;

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getRelaseDate() {
		return relaseDate;
	}

	public void setRelaseDate(String relaseDate) {
		this.relaseDate = relaseDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
