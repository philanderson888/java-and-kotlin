package com.example.helloworld;


import java.util.ArrayList;

public class DeadFish {
    static int[] DeadFishMethod(String data) {
    /*
    Initial value = 0
    i increments   d decrements  s squares  o outputs
     */
        System.out.println("\n\nDeadFish\n");
        System.out.println("Instructions are " + data);

        // turn string into an array of characters
        var charArray = data.toCharArray();

        // create output list
        var list = new ArrayList<Integer>();

        // iterate and act
        int value = 0;
        for (var c : charArray) {
            if (c == 'i') value++;
            else if (c == 'd') value--;
            else if (c == 's') value = (int) Math.pow(value, 2);
            else if (c == 'o') list.add(value);
        }

        return list.stream().mapToInt(item -> item).toArray();
    }
}
