package chap2.guess_number_;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame (){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1;
        int guessp2;
        int guessp3;

        int winner = 0;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("$ I'm thinking of a number between 0 and 9...");

        while (true){
            System.out.println("Number to guess is " + targetNumber);

            guessp1 = p1.guess();
            guessp2 = p2.guess();
            guessp3 = p3.guess();

            if (guessp1 == targetNumber)
                winner += 4;
            if (guessp2 == targetNumber)
                winner += 2;
            if (guessp3 == targetNumber)
                winner += 1;
            if (winner != 0) 
                break;
            System.out.println("All of them got wrong!!");
        }

        System.out.println("$ We have a winner!");
        System.out.print("$ Winner is ");
        if (winner >= 4){
            System.out.print("player1, ");
            winner -= 4;
        }
        if (winner >= 2){
            System.out.print("player2, ");
            winner -= 2;
        }
        if (winner == 1)
            System.out.print("player3, ");
        System.out.println("\b\b ");
            
    }
}
