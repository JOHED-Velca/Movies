package dev.johed.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Movie {
    @Id
    @JsonProperty("id")  // Force serialization
    private ObjectId id;

    @JsonProperty("imdbId")
    private String imdbId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("releaseDate")
    private String releaseDate;

    @JsonProperty("trailerLink")
    private String trailerLink;

    @JsonProperty("poster")
    private String poster;

    @JsonProperty("genres")
    private List<String> genres;

    @JsonProperty("backdrops")
    private List<String> backdrops;

    @JsonProperty("reviewIds")
    @DocumentReference
    private List<Review> reviewIds;
//    private ObjectId id;
//    private String imdbId;
//    private String title;
//    private String releaseDate;
//    private String trailerLink;
//    private String poster;
//    private List<String> genres;
//    private List<String> backdrops;
//    @DocumentReference
//    private List<Review> reviewIds;
//
//    public String testGetter() {
//        return this.title;
//    }

}

