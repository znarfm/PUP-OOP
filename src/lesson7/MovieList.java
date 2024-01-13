package lesson7;

import java.util.Scanner;

/**
 *
 * @author nard
 */

public class MovieList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Movie List");

        // Create 3 objects
        // First movie
        Movie movie1 = new Movie();
        movie1.title = "Avengers: Endgame";
        movie1.genre = "Action, Sci-Fi";
        movie1.year = 2019;
        movie1.isWatched = true;

        // Second movie
        Movie movie2 = new Movie();
        movie2.title = "The Marvels";
        movie2.genre = "Action, Fantasy";
        movie2.year = 2023;
        movie2.isWatched = false;

        // Third movie
        Movie movie3 = new Movie();
        movie3.title = "Spider-Man: No Way Home";
        movie3.genre = "Action, Sci-Fi, Drama";
        movie3.year = 2021;
        movie3.isWatched = true;

        // Print all movie titles and their release date
        System.out.println("\nMovies and their release dates");
        System.out.println(movie1.title + " (" + movie1.year + ")");
        System.out.println(movie2.title + " (" + movie2.year + ")");
        System.out.println(movie3.title + " (" + movie3.year + ")");

        // Print all movies that are already watched
        System.out.println("\nMovies that are already watched:");
        if (movie1.isWatched) {
            System.out.println(movie1.title);
        }
        if (movie2.isWatched) {
            System.out.println(movie2.title);
        }
        if (movie3.isWatched) {
            System.out.println(movie3.title);
        }
        
        // Print all movies that are still unwatched
        System.out.println("\nMovies that are unwatched:");
        if (!movie1.isWatched) {
            System.out.println(movie1.title);
        }
        if (!movie2.isWatched) {
            System.out.println(movie2.title);
        }
        if (!movie3.isWatched) {
            System.out.println(movie3.title);
        }
        
        // Print all movie genres
        System.out.println("\nMovie genres:");
        System.out.println(movie1.genre);
        System.out.println(movie2.genre);
        System.out.println(movie3.genre);

        console.close();
    }
}
