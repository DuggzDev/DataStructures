package DataStructures;

import java.util.LinkedList;

public class Linked {
    LinkedList<String> games;
    Linked(){
        games = new LinkedList<>();
        games.offer("Lego Star Wars");
        games.offer("Witcher 3");
        games.offer("GTA V");
        games.offer("Yugioh Master Duel");
        games.add(3,"Fortnite");

        System.out.println(games.indexOf("GTA "));


    }
}
