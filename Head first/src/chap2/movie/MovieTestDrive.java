package chap2.movie;

public class MovieTestDrive {
    public static void main(String[] args) {

        Movie one = new Movie();
        one.title = "Mission Impossible";
        one.genre = "action";
        one.rating = 7;

        Movie two = new Movie();
        two.title = "Minions";
        two.genre = "comedy";
        two.rating = 9;

        Movie three = new Movie();
        three.title = "The Tomb Raider";
        three.genre = "adventure";
        three.rating = 2;

        one.playIt();
        one.showRating();
        two.playIt();
        two.showRating();
        three.playIt();
        three.showRating();
    }
}
