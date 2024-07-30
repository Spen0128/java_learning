package chap1;

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("$ Before the loop\n");
        while(x<4) {
            System.out.println("$ In the loop");
            System.out.println("$ Value of x is " + x++);
        }
        System.out.println();
        System.out.println("$ After the loop");
    }
}
