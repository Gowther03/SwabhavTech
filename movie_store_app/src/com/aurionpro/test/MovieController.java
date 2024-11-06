package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

import com.aurionpro.model.Genre;
import com.aurionpro.model.Movie;
import com.aurionpro.model.MovieManager;

public class MovieController {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("-----Movie Controller-----");
		MovieManager manager;
		System.out.println("Start ---> ");
		manager = listOfMovies();
		int flag = 1;
		while(flag == 1) {
			flag = mainMenu(manager);
		}
	}

	public static Supplier<Integer> randomNumberSupplier = ()->{
		return (new Random()).nextInt(500) + 100;
	};
	
	public static MovieManager listOfMovies() {
		List<Movie> movies = new ArrayList<Movie>();
		List<Movie> fileMovies = new ArrayList<Movie>();
		MovieManager manager = new MovieManager(movies);
		int movieCount = 0;
		while(true) {
			movieCount++;
			System.out.println("\nEnter Movie Details -->");
			Movie movie = movieDetails(movieCount, manager);
			manager.addMovies(movie);;
			System.out.print("Save Movie to the File?(0 -> No) : ");
			String save = scanner.next();			
			if(!save.equals("0")) {
				fileMovies.add(movie);
				System.out.println("Movies added Succesfully in the File");
			}
			System.out.print("Enter More Movies?(0 -> No): ");
			String more = scanner.next();
			if(more.equals("0")) {
				System.out.println("All Movies added in the List succesfullly");
				break;
			}
		}
		saveToFile(fileMovies, manager);
		return manager;
	}
	
	public static Movie movieDetails(int movieCount, MovieManager manager) {
		System.out.println("Movie No. " + movieCount + ": ");
		int movieId = randomNumberSupplier.get();
		System.out.print("Movie Name: ");
		String movieName = scanner.next();
		System.out.print("Movie Genre: ");
		Genre genre = genreSelection();
		System.out.print("Year Of Release: ");
		String yearOfRelease = scanner.next();
		System.out.println("\nMovie Added Succesfully to the List!");
		Movie movie = new Movie(movieId, movieName, genre, yearOfRelease);
		return movie;
	}
	
	public static void saveToFile(List<Movie> fileMovies, MovieManager manager) {
		MovieManager.saveMovies(fileMovies);
	}
	public static Genre genreSelection() {
		System.out.println("1. Comedy"
				+" 2. Romance"
				+" 3. Action"
				+" 4. Thriller"
				+" 5. Drama"
				+" 6. Horror");
		while(true) {
			System.out.print("Enter Index: ");
			String input = scanner.next();
			switch(input) {
			case "1": return Genre.Comedy;
			case "2": return Genre.Romance;
			case "3": return Genre.Action;
			case "4": return Genre.Thriller;
			case "5": return Genre.Drama;
			case "6": return Genre.Horror;
			default: System.out.println("Invalid Selection");
			}
		}
	}
	public static int mainMenu(MovieManager manager) {
		System.out.println("\nMain Menu");
		System.out.println("1. Display Movies List");
		System.out.println("2. Display Loaded Movies");
		System.out.println("3. Exit");
		System.out.print("Enter  Index: ");
		String input = scanner.next();
		switch(input) {
		case "1":
			manager.displayMovies();
			return 1;
		case "2":
			manager.loadMovies();
			return 1;
		case "3":
			System.out.println("Thank You");
			return 0;
		default:
			System.out.println("Inavlid Input");
			return 1;
		}
	}
}
