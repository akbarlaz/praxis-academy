package kasus;

public class MovieRented {
    private Integer member_id;
    private String movie_rented;

    public MovieRented() {}

    public MovieRented(Integer member_id, String movie_rented) {
        this.member_id = member_id;
        this.movie_rented = movie_rented;
    }

    public Integer getId() {
        return member_id;
    }

    public String getMovieRented() {
        return movie_rented;
    }
}