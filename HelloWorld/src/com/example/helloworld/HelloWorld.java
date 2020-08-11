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

        PascalCase();
        FindOddManOut();
        CombineAndSortStringsAndMakeElementsUnique();
        EqualSidesOfArray();
        MaskCreditCardInformation();
        NumbersLeastToGreatest();
        DoesAStringHaveRepeatingLetters();
        bouncingBall(3.0, 0.66, 1.5);
        supermarketQueue(new int[]{10,2,3,4}, 2);
        supermarketQueue(new int[]{10,2,3,4}, 3);
        supermarketQueue(new int[]{10,2,3,4}, 4);
        supermarketQueue(new int[]{10,6,6,4}, 2);
    }
    static void PascalCase(){

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
    }
    static void FindOddManOut(){

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
    }
    static void CombineAndSortStringsAndMakeElementsUnique(){

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

    }
    static void EqualSidesOfArray(){


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
    static void MaskCreditCardInformation(){

        /*
         * Mask credit card information - change all characters into # except last 4 digits
         * https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
         */

        System.out.println("\n\nPrinting a credit card with digits masked");
        String str = "12345678";
        var charArray = str.toCharArray();
        // iterate up to 4 from the end
        for(int i=0;i<charArray.length-4;i++){
            charArray[i] = '#';
        }
        var stringbuilder4 = new StringBuilder();
        for(char c: charArray){
            stringbuilder4.append(c);
        }
        System.out.println("The original credit card is " + str);
        System.out.println("The masked credit card is " + stringbuilder4);


    }
    static void NumbersLeastToGreatest(){
        /*
         * Rearrange digits from highest to least
         * 12395 becomes 95321
         * https://www.codewars.com/kata/5467e4d82edf8bbf40000155/java
         *
         * */

        System.out.println("\n\nSorting Digits Of A Number In Descending Order");
        int num = 45398;
        // as string
        String numberAsString = String.valueOf(num);
        // as character array
        var numberAsArray = numberAsString.toCharArray();
        // sort ascending
        Arrays.sort(numberAsArray);
        System.out.println("Original number is " + num);
        for(char c : numberAsArray){
            System.out.println(c);
        }
        // sort descending
        var sortedCharArray = new char[numberAsArray.length];
        for (int i=numberAsArray.length-1;i>=0;i--){
            System.out.println(numberAsArray[i]);
            sortedCharArray[numberAsArray.length-1-i] = numberAsArray[i];
        }
        // reassemble as an string
        var stringbuilder5 = new StringBuilder();
        for(char c: sortedCharArray){
            System.out.println(c);
            stringbuilder5.append(c);
        }
        System.out.println(stringbuilder5);
        // convert string back to integer
        int output5 = Integer.parseInt(stringbuilder5.toString());
        System.out.println(output5);
    }
    static void DoesAStringHaveRepeatingLetters(){

        /* Does a string have any repeating letters?
         *  https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
         */

        System.out.println("\n\nFinding a match in a string - are any two letters the same?");
        var str = "Thisa rng";
        System.out.println(str);
        // create a stack
        var stack = new Stack();
        for (Character c : str.toCharArray()){
            stack.push(Character.toLowerCase(c));
        }
        // pop off letter each time
        boolean matchFound = false;
        while(stack.stream().count()>0){
            var c = stack.pop();
            for (var item: stack){
                if((Character) c == item) {
                    matchFound=true;
                    break;
                }
            }
        }
        System.out.println("Is a match found? " + matchFound);
        System.out.println("Is the word an Isogram (no matches) " + !matchFound);

        // here is a better answer!
        var charArray2 = str.toLowerCase().chars();
        // check count
        boolean sameLength = str.length() == charArray2.distinct().count();
        System.out.println("Is the word an Isogram (no matches) " + sameLength);
    }
    static int bouncingBall(double h, double bounce, double window){
        /*
         * Bouncing ball
         * Ball dropped from height h
         * Bounces b fraction of this every time
         * Mother situated at height 1.5
         * How many times does the mother see the ball both going down and coming back up?
         * */

        System.out.println("\n\nBouncing ball - how many times does the ball pass level `window` when dropped from height h and bounce fraction `bounce`");
        System.out.println("Height = " + h + ", bounce = " + bounce + ", window = " + window);
        double windowHeight = window;

        // invalid parameters
        if (h<0) return -1;
        if ((bounce<=0) || (bounce >=1)) return -1;
        if (window >= h) return -1;

        // dropped from height h and bounces back a fraction of this
        // we will always have at least one view on the fall down
        int numberOfViews = 1;
        double ballHeight = h;

        do {
            ballHeight = ballHeight * bounce;
            if(ballHeight>windowHeight) numberOfViews+=2;
        }
        while(ballHeight>windowHeight);
        System.out.println("Number of views is " + numberOfViews);
        return numberOfViews;
    }
    static <Pair> int supermarketQueue(int[] customers, int n){
        /*
         * Supermarket Queue
         * Calculate Time For All Customers To Check Out
         * https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/java
         * input 1) Array with times for each customer to check out
         *       2) Number of tills
         */
        System.out.println("\n\nHow long does a checkout queue take to go down?");

        // null cases
        if (customers.length == 0) return 0;
        if (n == 0) return 0;

        // create a queue of people from the array
        Queue queue = new LinkedList<Integer>();
        for(var item:customers){
            queue.add(item);
        }
        // print customer queue
        System.out.println("\n\nCustomer Queue at start is: ");
        for(var item:queue){
            System.out.print(item + ", ");
        }


        // create checkouts
        var checkouts = new int[n];


        // move initial people from the queue to the checkouts
        Integer numberOfCustomersAtCheckout = 0;
        System.out.println("\n\nMoving Initial People To Empty Checkouts");
        for (int checkout=0;checkout< checkouts.length;checkout++){
            if(queue.stream().count()>0){
                int customer = (Integer)queue.remove();
                System.out.println("Adding " + customer + " people to checkout " + checkout);
                checkouts[checkout]=customer;
                numberOfCustomersAtCheckout+=customer;
            }
        }
        System.out.println(n + " checkouts set up with a total of " + numberOfCustomersAtCheckout + " customers waiting to be served");


        // create timer
        var timer = 0;


        // while customers remain, serve them and count time
        while(numberOfCustomersAtCheckout > 0)   {
            // count afresh number of customers at the checkouts every time
            numberOfCustomersAtCheckout=0;
            // iterate over checkouts
            for(int checkout=0;checkout<checkouts.length;checkout++){
                if(checkouts[checkout]>0){
                    checkouts[checkout]--;
                }
                // if any checkouts are empty, pull in more customers
                if ((checkouts[checkout]==0)&&(queue.stream().count()>0)){
                    int customer = (Integer)queue.remove();
                    System.out.println("Adding " + customer + " people to checkout " + checkout);
                    checkouts[checkout]=customer;
                }
                numberOfCustomersAtCheckout+=checkouts[checkout];
            }


            timer++;
            System.out.println("At time " + timer + " there are " + numberOfCustomersAtCheckout + " customers left");
        }
        System.out.println("\nThe time it took to clear all the customers is " + timer);
        return timer;
    }
}
