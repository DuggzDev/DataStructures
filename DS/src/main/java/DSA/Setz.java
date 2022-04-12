package DSA;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.function.BiConsumer;

public class Setz {
    Setz() {
        //Hashtables cannot contain duplicate elements
        Hashtable<Integer, String> hash = new Hashtable<>(10);


        hash.put(22, "james");
        hash.put(30, "chris");

        for (Integer keys : hash.keySet()) {
            System.out.println(hash.get(keys));
            System.out.println(keys.hashCode() % 10);
        }

        //Hashsets/tables store unique data in a hashtable, this hashtable can be shown by getting the hashcode of a key and modulus of 10 to see which
        //bucket the key sits in from 0 - 9
        //if a hash function generates the same index for a key then a linked list is created to the next node for that hash
    }


}
