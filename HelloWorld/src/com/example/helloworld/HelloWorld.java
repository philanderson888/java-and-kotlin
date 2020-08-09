package com.example.helloworld;

import java.util.*;
import java.util.LinkedHashSet;


public class HelloWorld {
    // New class com.example.helloworld.HelloWorld and create it
    // Shift and enter to move down a line
    public static void main(String[] args) {
         // control J to see available code templates
        // control dot to complete a word and add a dot (can do tab then .)
        // for the last item, press enter to select it
        // Alt 4 to see the command line window
        // Shift Shift = search everywhere
        // Control Control  = run anything ' hello '
        System.out.println("hello world 2");

        // build a JAR Java Archive  - File, Project Structure or  Shift control alt S
        // File, Structure, Artifacts, Add, Choose class and OK
        // Build => Artifacts and check folder out, artifacts, helloworld.jar

        // not too sure how to create another file so just going to do my coding here for now!
        // 8 August 2020
        // Codewars Capitalise Each Word https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
        String phrase = "This is a sentence";

        // list is an interface
        char[] sentence = phrase.toCharArray();
        boolean spaceExists = false;
        boolean firstLetter = true;
        // sort into words
        for (int i=0;i<sentence.length;i++)
        {
            char c = sentence[i];
            if (firstLetter){
                sentence[i] = Character.toUpperCase(c);
                firstLetter = false;
            }
            if (spaceExists){
                sentence[i] = Character.toUpperCase(c);
                spaceExists = false;
            }
            if (c == ' '){
                spaceExists = true;
            }
        }
        for(Character c : sentence){
            System.out.println(c);
        }
        // convert array of words back into string
        String output = String.valueOf(sentence);
        System.out.println(output);


        /*
         * Find the parity outlier
         *
         * https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
         *
         *
         * https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
         * You are given an array (which will have a length of at least 3,
         * but could be very large) containing integers.
         *
         * The array is either entirely comprised of odd integers
         * or
         * entirely comprised of even integers
         * except for a single integer N.
         *
         * Write a method that takes the array as an argument and returns this "outlier" N.
         *
         * */


        int[] integers = new int[]{10,12,14,20,50,17};
        integers = new int[]{13,15,19,1,-7,24,33};
        integers = new int[] {2,6,8,-10,-3};
        integers = new int[] {2,6,8,-10,3};

        // assume odd is default.
        boolean evenFirstNumber = false;
        boolean evenSecondNumber = false;
        boolean evenThirdNumber = false;
        int evenCount = 0;
        int oddCount = 0;
        boolean evenArray = false;
        int outlier = 0;

        // search for odd/even values
        if(integers[0]%2 ==0) {
            evenFirstNumber = true;
            evenCount++;
        }
        else{
            oddCount++;
        }
        if(integers[1]%2 ==0) {
            evenSecondNumber = true;
            evenCount++;
        }
        else{
            oddCount++;
        }
        if(integers[2]%2 ==0) {
            evenThirdNumber = true;
            evenCount++;
        }
        else{
            oddCount++;
        }


        System.out.println("\n\nFind Outlier In Array");
        System.out.println("even count is " + evenCount);
        System.out.println("odd count is " + oddCount);

        // can now determine if array is odd or even
        if(evenCount>1) evenArray = true;

        for(int item:integers){
            if(evenArray && Math.abs(item)%2==1){
                outlier = item;
                break;
            }
            if(!evenArray && Math.abs(item)%2==0) {
                outlier = item;
                break;
            }
        }

        System.out.println("outlier is " + outlier);


        /*
        Take 2 strings and combine and sort them and make the entries unique
         *


         *
            https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
         */

        System.out.println("\n\n\nJointing 2 Arrays, Sorting And Removing Duplicates");
        String s1 = "this is a string";
        String s2 = "this is another string";
        var combinedString = s1+s2;
        System.out.println("Combined is " + combinedString);

        // sort the string
        var combinedCharArray = combinedString.toCharArray();
        Arrays.sort(combinedCharArray);
        String sortedCombinedString = new String(combinedCharArray);
        System.out.println("Sorted is " + sortedCombinedString);

        // make unique by adding to hash set
        LinkedHashSet<Character> chars = new LinkedHashSet<>();
        for(char c: sortedCombinedString.toCharArray()){
            chars.add(c);
        }

        var stringbuilder = new StringBuilder();
        for(char c : chars){
            stringbuilder.append(c);
        }



        String output2 = stringbuilder.toString();


        System.out.println("Unique letters at " + output2);


        // other solution for learning (more efficient)
        var stringbuilder3 = new StringBuilder();
        combinedString.chars().distinct().sorted().forEach(c -> stringbuilder3.append((char)c));
        var output3 = stringbuilder3.toString();
        System.out.println(output3);





        /*

        Equal Sides Of An Array

        Find the index where the sum of the members to the left and right are the same

        https://www.codewars.com/kata/5679aa472b8f57fb8c000047/java

         */

        int[] inputArray = new int[]{10,20,30,40,30,20,10};
        inputArray = new int[]{1,2,3,4,3,2,1};
        int sum = -1;
        int index = -1;
        for(int i=0;i<inputArray.length;i++){
            int leftSum=0;
            int rightSum=0;
            for (int j=0;j<i;j++){
                leftSum+= inputArray[j];
            }
            for(int k=i+1;k<inputArray.length;k++){
                rightSum += inputArray[k];
            }
            if(leftSum==rightSum) {
                sum = leftSum;
                index = i;
                break;
            }
        }
        System.out.println("The arrays have equal sum of " + sum + " at index " + index);

    }
}
