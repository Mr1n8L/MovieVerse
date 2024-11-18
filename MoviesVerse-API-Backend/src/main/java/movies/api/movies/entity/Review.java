package movies.api.movies.entity;
//Impotring necessary libraries
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import java.time.LocalDateTime;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;

    public Review(String body) {
        this.body = body;
    }
//    private LocalDateTime created;
//    private LocalDateTime updated;
//
//    public Review(String body, LocalDateTime created, LocalDateTime updated) {
//        this.body = body;
//        this.created = created;
//        this.updated = updated;
//    }
}