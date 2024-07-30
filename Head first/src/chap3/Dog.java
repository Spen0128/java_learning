package chap3;

public class Dog {
    int size;
    String name;

    void bark (){
        System.out.println("Ruff! Ruff!");
    }

    void show (){
        System.out.println();
        System.out.println("$ Name : " + name);
        System.out.println("$ size : " + size);
    }
}
