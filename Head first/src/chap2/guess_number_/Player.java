package chap2.guess_number_;

public class Player {
    private int number = 0;

    public int guess (){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
        return number;
    }
}
