package chap5.warship_Game_;

import java.util.Scanner;

public class SimpleDotCom_TestDrive {
    public static void main(String[] args) {
        int locStart = (int) (Math.random()*10) % 8 + 1;
        int[] loc = {locStart, locStart+1, locStart+2};
        String choice;
        String ans;
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("location: ");
        System.out.print(loc[0] + ", ");
        System.out.print(loc[1] + ", ");
        System.out.print(loc[2] + "\n");
        SimpleDotCom target = new SimpleDotCom(loc);

        do { 
            System.out.print("$ Guess the location of DotCom site => ");
            choice = sc.next();
            ans = target.checkYourself(choice);
            System.out.println(ans + "\n");
        } while (!ans.equals("kill"));
    }
}
