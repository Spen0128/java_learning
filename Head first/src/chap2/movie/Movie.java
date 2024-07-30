package chap2.movie;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt (){
        System.out.println("$ Playing the movie {" + title + "}");
    }

    void showRating (){
        System.out.println("$ Rating of {" + title + "} is " + rating);
    };
}