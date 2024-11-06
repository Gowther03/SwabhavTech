package com.aurionpro.model;

import java.io.Serializable;

public class Movie implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int movieid;
	private String movieName;
	private String yearOfRelease;
	private Genre genre;
	
	public Movie(int movieid,String movieName, Genre genre,String yearOfRelease) {
		this.movieid = movieid;
		this.movieName = movieName;
		this.genre = genre;
		this.yearOfRelease =yearOfRelease;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public void display() {
		System.out.println("Name: " + movieName);
		System.out.println("Genre: " + genre);
		System.out.println("Year Of Release: " + yearOfRelease);
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
}
