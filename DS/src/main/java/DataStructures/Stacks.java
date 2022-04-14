package DataStructures;

import java.util.Random;
import java.util.Stack;

public class Stacks {
    private final Stack<String> names;
    int newValue;


    void pushStacking(String a) {
        names.push(a);
    }

    void popStacking(int number) {

        try {
            for (int i = 1; i <= number; i++) {
                names.pop();

                newValue = names.capacity() - i;

            }


        } catch (Exception e) {
            e.getMessage();
        }
    }

    void peekTopStack() {
        System.out.println(names.peek());
    }

    void viewStacking() {
        names.forEach(System.out::println);
    }

    void hasValues() {


        if ((long) names.capacity() >= 1) {


            System.out.println("The stack has: " + names.size() + " value(s)");

        } else {

            System.out.println("The stack is now empty");
        }

    }

    Stacks() {
        names = new Stack<String>();
        for (int i = 0; i < 30; i++) {
            names.push(String.valueOf((char) new Random().nextInt()));


        }


    }


}
