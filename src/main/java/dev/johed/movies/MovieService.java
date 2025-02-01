package dev.johed.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
//    public List<Movie> allMovies() {
//        List<Movie> movies = movieRepository.findAll();
//
//        // Debug: Print movie data
//        movies.forEach(movie -> System.out.println(movie.testGetter()));
//
//        return movies;
//    }


    public Optional<Movie> singleMovie(ObjectId id) {
        return movieRepository.findById(id);
    }
}
