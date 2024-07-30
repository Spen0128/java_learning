package chap5.warship_Game_;

import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        int loc_start = (int) (Math.random() * 8) + 1;
        int[] loc = {loc_start, loc_start+1, loc_start+2};
        String dataString;
        Scanner sc = new Scanner(System.in);

        SimpleDotCom theDotCom = new SimpleDotCom(loc);

        System.out.println("");
        System.out.println("$ Welecome to DotComGame, now there's a location from 1 to 10, an DotCom is hiding in a continuous place (size:3), please find it and win the game\n");
        do {
            System.out.print("=> ");
            dataString = theDotCom.checkYourself(sc.next());
            System.out.println(dataString + "\n");
            numOfGuess++;
        } while(!dataString.equals("kill"));
        System.out.println("$ You finally took " + numOfGuess + " times to guess");
    }
}
