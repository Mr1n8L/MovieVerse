package movies.api.movies.service;


import movies.api.movies.entity.Movie;
import movies.api.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> allMovies() {
        return repository.findAll();

    }

    public Optional<Movie> singleMovie(String imdbId){
        return repository.findMovieByImdbId(imdbId);
    }

//    public Optional<Movie> findMovieByImdbId(String imdbId) {
//        return repository.findMovieByImdbId(imdbId);
//    }
}