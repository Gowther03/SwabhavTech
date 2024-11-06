package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager{
	List<Movie> movies = new ArrayList<Movie>();
	List<Movie> fileMovies = new ArrayList<Movie>();
	
	static final String filePath = "MovieData.txt";

	public MovieManager(List<Movie> movies) {
		this.movies = movies;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void addMovies(Movie movie) {
		movies.add(movie);
	}
	public void clearMovies() {
		movies.clear();
	}
	public int getMovieId(Movie movie) {
		return movie.getMovieid();
	}
	public void loadMovies() {
		try(FileInputStream fileOut = new FileInputStream(filePath);
				ObjectInputStream ois = new ObjectInputStream(fileOut)){
			List<Movie> moviesToRead = (List<Movie>) ois.readObject();
			int index = 1;
			for(Movie movie: moviesToRead) {
				System.out.println("\nMovie " + index + "[" + movie.getMovieid() + "]: ");
				movie.display();
				index++;
			}
		}catch(IOException exception) {
			exception.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayMovies() {
		int index = 1;
		for(Movie movie: movies) {
			System.out.println("\nMovie " + index + "[" + movie.getMovieid() + "]: ");
			movie.display();
			index++;
		}
	}
	public static void saveMovies(List<Movie> movies) {
		try(FileOutputStream fileOut = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fileOut)){
			oos.writeObject(movies);
		}catch(IOException exception) {
			exception.printStackTrace();
		}
	}
	public void deleteAllMovied() {
		
	}
}
