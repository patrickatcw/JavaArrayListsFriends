package com.me;
//http://www.dummies.com/programming/java/use-array-lists-in-java/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //step 1 declaring arraylist variable with capacity
        /*
        To create an array list in Java, you declare an ArrayList variable
        and call the ArrayList constructor to instantiate an ArrayList object
        and assign it to the variable:
        You can optionally specific a capacity in the ArrayList constructor:
         */
        ArrayList<String> friends = new ArrayList<String>(5);

        //step 2 adding objects to array list
        /*
        If you specified a type when you created the array list, the objects
        you add via the add method must be of the correct type.
         */
        friends.add("Teena");
        friends.add("Jim");
        friends.add("Mitch");
        friends.add("Bob");
        friends.add("Sara");

        System.out.println(friends.get(0));
        System.out.println(friends.get(1));
        System.out.println(friends.get(2));
        System.out.println(friends.get(3));
        System.out.println(friends.get(4));
        //results
        /*
        Teena
        Jim
        Mitch
        Bob
        Sara
        */

        System.out.println(Arrays.toString(new ArrayList[]{friends}));
        //results; [[Teena, Jim, Mitch, Bob, Sara]]

    }

}
