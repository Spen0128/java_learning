import java.util.Scanner;
public class guess_game {

    public static void main(String[] args) {
        int choice;
        int target = (int) (Math.random() * 100 + 1);

        System.out.println();
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("$ Guess an number between 1 and 100, press \"-1\" to quit:");
            while (true) {
                try {
                    System.out.print("& ");
                    choice = sc.nextInt();
                    if (choice == target){
                        System.out.println("$ Bingo!!");
                        return;
                    }
                    else if (choice < target)
                        System.out.println("$ too small!!");
                    else 
                        System.out.println("$ too large!!");
                    System.err.println();
                }
                catch (java.util.InputMismatchException e) {
                    System.out.println("$ Please enter the valid positive integer...");
                    sc.next();
                }
            }   
        }
    }
}
