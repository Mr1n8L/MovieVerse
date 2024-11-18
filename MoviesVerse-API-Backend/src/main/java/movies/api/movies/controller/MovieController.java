package movies.api.movies.controller;
//importing
import movies.api.movies.entity.Movie;
import movies.api.movies.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController

@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;


    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>> (movieService.singleMovie(imdbId), HttpStatus.OK);

    }
}


