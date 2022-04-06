import java.util.Random;
import java.util.Stack;

public class Stacks {
   private Stack<String> names;
    void stacking(){

       names = new Stack<String>();
       for(int i = 0; i < 10; i++){
           names.push(String.valueOf((char) new Random().nextInt()));

       }


    }
    void popStacking(){
        for(int i =0; i < names.capacity();i++){
            names.pop();
        }
    }
    void isEmpty(){
        if(names.isEmpty()){
            System.out.println("This stack is now empty");
        }
    }
    void peekTopStack(){
        System.out.println(names.peek());
    }
    void viewStacking(){
        names.forEach(System.out::println);
    }



}
