package com.example.helloworld;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

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
        supermarketQueue(new int[]{10, 2, 3, 4}, 2);
        supermarketQueue(new int[]{10, 2, 3, 4}, 3);
        supermarketQueue(new int[]{10, 2, 3, 4}, 4);
        supermarketQueue(new int[]{10, 6, 6, 4}, 2);
        reverseOrRotate("123456987654", 6);
        reverseOrRotate("123456987653", 6);
        reverseOrRotate("733049910872815764", 5);
        DeadFish("iiisdoso");
        DeadFish("iiisdosodddddiso");
        MaximumSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        MorseCodeDecoder(".... . -.--   .--- ..- -.. .");
        DetermineWordOrder("is2 Thi1s T4est 3a");
        Permutations("aabb");
        PerfectPower(4);
        PerfectPower(81);
        PerfectPower(900);
        PerfectPower(1572495618);
        Factorial(7);
        int[] array01 = {1,2,3};
        int[] array02 = {4,5,6};
        int[] array03 = {7,8,9};
        int[][] array = {array01,array02,array03};
        Snail(array);
        pagesToPrint(new int[]{12,13,15,16,17});
        pagesToPrint(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20});
        IPV4(32);
        NextSmallestNumber(53);
        NextSmallestNumber(531);
        NextSmallestNumber(53728);
        NextSmallestNumber(5329);
        NextSmallestNumber(907);
        NextSmallestNumber(35260713042629l);
        NextSmallestNumber(513);
        RunFunctionalProgramming();
        SearchEngine("hi","there");
        SearchEngine("he","thereherehere");
        SearchEngine("he_","thereherehere");
        SearchEngine("_po_","Once upon a midnight I pondered");
        SearchEngine("ex_","googgoogleghgggoooglexeplexhexflexmexkex");
        SearchEngine("_ggg","googgooooggggexkex");
        SearchEngine("_lexe","googexkex");
        ConvertTime(90061);
        CheckIfSequence("1 2 3 4");
        CheckIfSequence("1 2 3 4 a");
    }
    static void PascalCase() {

        // Codewars Capitalise Each Word https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
        String phrase = "This is a sentence";

        // list is an interface
        char[] sentence = phrase.toCharArray();
        boolean spaceExists = false;
        boolean firstLetter = true;
        // sort into words
        for (int i = 0; i < sentence.length; i++) {
            char c = sentence[i];
            if (firstLetter) {
                sentence[i] = Character.toUpperCase(c);
                firstLetter = false;
            }
            if (spaceExists) {
                sentence[i] = Character.toUpperCase(c);
                spaceExists = false;
            }
            if (c == ' ') {
                spaceExists = true;
            }
        }
        for (Character c : sentence) {
            System.out.println(c);
        }
        // convert array of words back into string
        String output = String.valueOf(sentence);
        System.out.println(output);
    }
    static void FindOddManOut() {

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


        int[] integers = new int[]{10, 12, 14, 20, 50, 17};
        integers = new int[]{13, 15, 19, 1, -7, 24, 33};
        integers = new int[]{2, 6, 8, -10, -3};
        integers = new int[]{2, 6, 8, -10, 3};

        // assume odd is default.
        boolean evenFirstNumber = false;
        boolean evenSecondNumber = false;
        boolean evenThirdNumber = false;
        int evenCount = 0;
        int oddCount = 0;
        boolean evenArray = false;
        int outlier = 0;

        // search for odd/even values
        if (integers[0] % 2 == 0) {
            evenFirstNumber = true;
            evenCount++;
        } else {
            oddCount++;
        }
        if (integers[1] % 2 == 0) {
            evenSecondNumber = true;
            evenCount++;
        } else {
            oddCount++;
        }
        if (integers[2] % 2 == 0) {
            evenThirdNumber = true;
            evenCount++;
        } else {
            oddCount++;
        }


        System.out.println("\n\nFind Outlier In Array");
        System.out.println("even count is " + evenCount);
        System.out.println("odd count is " + oddCount);

        // can now determine if array is odd or even
        if (evenCount > 1) evenArray = true;

        for (int item : integers) {
            if (evenArray && Math.abs(item) % 2 == 1) {
                outlier = item;
                break;
            }
            if (!evenArray && Math.abs(item) % 2 == 0) {
                outlier = item;
                break;
            }
        }
        System.out.println("outlier is " + outlier);
    }
    static void CombineAndSortStringsAndMakeElementsUnique() {

        /*
        Take 2 strings and combine and sort them and make the entries unique
         *


         *
            https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
         */

        System.out.println("\n\n\nJointing 2 Arrays, Sorting And Removing Duplicates");
        String s1 = "this is a string";
        String s2 = "this is another string";
        var combinedString = s1 + s2;
        System.out.println("Combined is " + combinedString);

        // sort the string
        var combinedCharArray = combinedString.toCharArray();
        Arrays.sort(combinedCharArray);
        String sortedCombinedString = new String(combinedCharArray);
        System.out.println("Sorted is " + sortedCombinedString);

        // make unique by adding to hash set
        LinkedHashSet<Character> chars = new LinkedHashSet<>();
        for (char c : sortedCombinedString.toCharArray()) {
            chars.add(c);
        }

        var stringbuilder = new StringBuilder();
        for (char c : chars) {
            stringbuilder.append(c);
        }


        String output2 = stringbuilder.toString();


        System.out.println("Unique letters at " + output2);


        // other solution for learning (more efficient)
        var stringbuilder3 = new StringBuilder();
        combinedString.chars().distinct().sorted().forEach(c -> stringbuilder3.append((char) c));
        var output3 = stringbuilder3.toString();
        System.out.println(output3);

    }
    static void EqualSidesOfArray() {


        /*

        Equal Sides Of An Array

        Find the index where the sum of the members to the left and right are the same

        https://www.codewars.com/kata/5679aa472b8f57fb8c000047/java

         */

        int[] inputArray = new int[]{10, 20, 30, 40, 30, 20, 10};
        inputArray = new int[]{1, 2, 3, 4, 3, 2, 1};
        int sum = -1;
        int index = -1;
        for (int i = 0; i < inputArray.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += inputArray[j];
            }
            for (int k = i + 1; k < inputArray.length; k++) {
                rightSum += inputArray[k];
            }
            if (leftSum == rightSum) {
                sum = leftSum;
                index = i;
                break;
            }
        }
        System.out.println("The arrays have equal sum of " + sum + " at index " + index);

    }
    static void MaskCreditCardInformation() {

        /*
         * Mask credit card information - change all characters into # except last 4 digits
         * https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
         */

        System.out.println("\n\nPrinting a credit card with digits masked");
        String str = "12345678";
        var charArray = str.toCharArray();
        // iterate up to 4 from the end
        for (int i = 0; i < charArray.length - 4; i++) {
            charArray[i] = '#';
        }
        var stringbuilder4 = new StringBuilder();
        for (char c : charArray) {
            stringbuilder4.append(c);
        }
        System.out.println("The original credit card is " + str);
        System.out.println("The masked credit card is " + stringbuilder4);


    }
    static void NumbersLeastToGreatest() {
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
        for (char c : numberAsArray) {
            System.out.println(c);
        }
        // sort descending
        var sortedCharArray = new char[numberAsArray.length];
        for (int i = numberAsArray.length - 1; i >= 0; i--) {
            System.out.println(numberAsArray[i]);
            sortedCharArray[numberAsArray.length - 1 - i] = numberAsArray[i];
        }
        // reassemble as an string
        var stringbuilder5 = new StringBuilder();
        for (char c : sortedCharArray) {
            System.out.println(c);
            stringbuilder5.append(c);
        }
        System.out.println(stringbuilder5);
        // convert string back to integer
        int output5 = Integer.parseInt(stringbuilder5.toString());
        System.out.println(output5);
    }
    static void DoesAStringHaveRepeatingLetters() {

        /* Does a string have any repeating letters?
         *  https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
         */

        System.out.println("\n\nFinding a match in a string - are any two letters the same?");
        var str = "Thisa rng";
        System.out.println(str);
        // create a stack
        var stack = new Stack();
        for (Character c : str.toCharArray()) {
            stack.push(Character.toLowerCase(c));
        }
        // pop off letter each time
        boolean matchFound = false;
        while (stack.stream().count() > 0) {
            var c = stack.pop();
            for (var item : stack) {
                if ((Character) c == item) {
                    matchFound = true;
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
    static int bouncingBall(double h, double bounce, double window) {
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
        if (h < 0) return -1;
        if ((bounce <= 0) || (bounce >= 1)) return -1;
        if (window >= h) return -1;

        // dropped from height h and bounces back a fraction of this
        // we will always have at least one view on the fall down
        int numberOfViews = 1;
        double ballHeight = h;

        do {
            ballHeight = ballHeight * bounce;
            if (ballHeight > windowHeight) numberOfViews += 2;
        }
        while (ballHeight > windowHeight);
        System.out.println("Number of views is " + numberOfViews);
        return numberOfViews;
    }
    static int supermarketQueue(int[] customers, int n) {
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
        for (var item : customers) {
            queue.add(item);
        }
        // print customer queue
        System.out.println("\n\nCustomer Queue at start is: ");
        for (var item : queue) {
            System.out.print(item + ", ");
        }


        // create checkouts
        var checkouts = new int[n];


        // move initial people from the queue to the checkouts
        Integer numberOfCustomersAtCheckout = 0;
        System.out.println("\n\nMoving Initial People To Empty Checkouts");
        for (int checkout = 0; checkout < checkouts.length; checkout++) {
            if (queue.stream().count() > 0) {
                int customer = (Integer) queue.remove();
                System.out.println("Adding " + customer + " people to checkout " + checkout);
                checkouts[checkout] = customer;
                numberOfCustomersAtCheckout += customer;
            }
        }
        System.out.println(n + " checkouts set up with a total of " + numberOfCustomersAtCheckout + " customers waiting to be served");


        // create timer
        var timer = 0;


        // while customers remain, serve them and count time
        while (numberOfCustomersAtCheckout > 0) {
            // count afresh number of customers at the checkouts every time
            numberOfCustomersAtCheckout = 0;
            // iterate over checkouts
            for (int checkout = 0; checkout < checkouts.length; checkout++) {
                if (checkouts[checkout] > 0) {
                    checkouts[checkout]--;
                }
                // if any checkouts are empty, pull in more customers
                if ((checkouts[checkout] == 0) && (queue.stream().count() > 0)) {
                    int customer = (Integer) queue.remove();
                    System.out.println("Adding " + customer + " people to checkout " + checkout);
                    checkouts[checkout] = customer;
                }
                numberOfCustomersAtCheckout += checkouts[checkout];
            }


            timer++;
            System.out.println("At time " + timer + " there are " + numberOfCustomersAtCheckout + " customers left");
        }
        System.out.println("\nThe time it took to clear all the customers is " + timer);
        return timer;
    }
    static String reverseOrRotate(String strng, int sz) {
        /*
         * Cut string into chunks 'size'
         * Ignore the last chunk if less than 'size'
         * If the chunk represents an integer such that SUM OF CUBES OF DIGITS IS DIVISIBLE BY 2 then reverse this
         * Otherwise rotate digits left
         * https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991/train/java
         * */

        System.out.printf("\n\nManage Chunks In A String\n\n");

        // chunk size
        int chunkSize = sz;
        System.out.println("Chunk size is " + chunkSize);

        // null cases
        if (chunkSize <= 0) return "";
        if (strng.length() == 0) return "";
        if (chunkSize > strng.length()) return "";


        var stringArray = strng.toCharArray();

        System.out.print("Input string is ");
        for (var item : stringArray) {
            System.out.print(item);
        }


        // number of chunks
        int numberOfChunks = strng.length() / chunkSize;
        System.out.println("\nThere are " + numberOfChunks + " chunks in string of length " + strng.length() + " and chunk size " + chunkSize);


        // separate the chunks out - first create blank structure
        int[][] chunks = new int[numberOfChunks][chunkSize];

        // now fill the structure
        int j = 0;
        for (int i = 0; i < numberOfChunks * chunkSize; i++) {
            chunks[i / chunkSize][j] = Integer.parseInt(Character.toString(stringArray[i]));
            j++;
            if (j >= chunkSize) j = 0;
        }

        // print out the chunks
        System.out.print("chunks are ");
        for (var chunk : chunks) {
            for (int item : chunk) {
                System.out.print(item);
            }
            System.out.print(", ");
        }
        System.out.println();


        // is sum of digits divisible by 2
        for (int i = 0; i < numberOfChunks; i++) {
            int sum = 0;
            for (int k = 0; k < chunkSize; k++) {
                sum += Math.pow(chunks[i][k], 3);
            }
            System.out.println("sum of the cubes is " + sum);
            // is sum of cubes divisible by 2 then reverse this chunk
            if (sum % 2 == 0) {
                for (int m = 0; m < chunkSize / 2; m++) {
                    int temp = chunks[i][m];
                    chunks[i][m] = chunks[i][chunkSize - m - 1];
                    chunks[i][chunkSize - m - 1] = temp;
                }
            }
            // shift elements by 1
            else {
                int temp = 0;
                int counter = 0;
                temp = chunks[i][0];
                for (int m = 0; m < chunkSize - 1; m++) {
                    chunks[i][m] = chunks[i][m + 1];
                    counter++;
                }
                chunks[i][chunkSize - 1] = temp;
            }
        }


        // print out the chunks
        System.out.print("\nAfter alteration, chunks are ");
        for (var chunk : chunks) {
            for (int item : chunk) {
                System.out.print(item);
            }
            System.out.print(", ");
        }
        System.out.println();


        // now output as string
        var stringbuilder = new StringBuilder();
        for (var chunk : chunks) {
            for (var item : chunk) {
                stringbuilder.append(item);
            }
        }
        System.out.println("Reconstruct the chunks as " + stringbuilder);
        return stringbuilder.toString();
    }
    static int[] DeadFish(String data) {
        /*
        https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java
        
        Initial value = 0
        i increments   d decrements  s squares  o outputs
         */
        System.out.println("\n\nDeadFish\n");
        System.out.println("Instructions are " + data);

        // turn string into an array of characters
        char[] charArray = data.toCharArray();

        // create output list
        ArrayList<Integer> list = new ArrayList<Integer>();

        // iterate and act
        int value = 0;
        for (Character c : charArray) {
            if (c == 'i') value++;
            else if (c == 'd') value--;
            else if (c == 's') value = (int) Math.pow(value, 2);
            else if (c == 'o') list.add(value);
        }

        int[] outputArray = list.stream().mapToInt(item -> item).toArray();
        for(int item: outputArray){
            System.out.print(item + ",");
        }
        return outputArray;
    }
    static int MaximumSubarraySum(int[] arr){
        /*
            14 August 2020
            https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java
            Find the max num of a contiguous subsequence in an array
        */
        int[] array = arr;
        // null cases
        if(array.length==0) return 0;


        System.out.print("\n\nPrint Out Array\n");
        for(int number:array){
            System.out.print(number+",");
        }

        System.out.print("\nAre All Numbers Positive? ");
        boolean allPositive = true;
        int sum=0;
        for (int number:array){
            sum+=number;
            if(number<0){
                allPositive=false;
                break;
            }
        }
        System.out.println(allPositive);
        if(allPositive) {
            System.out.println("\nAll numbers are positive and total is " + sum);
            return sum;
        }


        System.out.print("Are all numbers negative? ");
        boolean allNegative = true;
        for(int number:array){
            if(number>=0){
                allNegative=false;
                break;
            }
        }
        System.out.println(allNegative);
        if(allNegative) return 0;



        System.out.println("Find the sum of all subsequences");
        int maxSubsequence = 0;
        for(int i=0;i<array.length;i++){
            sum=0;
            for (int j=i;j<(array.length);j++){
                sum+=array[j];
                if(sum>maxSubsequence){
                    maxSubsequence=sum;
                }
            }
        }
        System.out.println("Max subsequence is " + maxSubsequence);
        return maxSubsequence;
    }
    static String MorseCodeDecoder(String morseCode){
        // 15 August 2020
        // your brilliant code here, remember that you can access
        // the preloaded Morse code table through MorseCode.get(code)


        // take in a string
        // every letter is dots or dashes separated by a space
        // three spaces separate each letter
        // remove leading and trailing spaces
        // SOS is one word
        // use ASCII

        // next time - could split by this   morseCode.trim().split("   ")

        System.out.println("\n\nMorse Code Decoder");
        System.out.println("Input string is " + morseCode);

        // null
        if (morseCode == "") return "";
        if (morseCode == null) return "";


        // trim start and end firstly
        morseCode = morseCode.trim();

        // convert into an array of characters first of all
        var morseCodeCharacters = morseCode.toCharArray();

        // we want to separate into an array of strings where each string contains either
        // list of words defined by how many occurrences of three spaces exist
        List<ArrayList<Character>> words = new ArrayList<ArrayList<Character>>();

        int numberOfSpaces = 0;

        // create new word ready to receive letters
        var letters = new StringBuilder();
        var letter = new StringBuilder();
        for(Character c:morseCodeCharacters){
            if(c == ' '){
                numberOfSpaces++;
                if(letter.length()>0){
                    // this will be the end of a letter
                    var convertedLetter = "a"; //MorseCode.get(letter.toString());
                    letters.append(convertedLetter);
                    letter.delete(0,letter.length());
                    System.out.println("Letters now is " + letters);
                }
                continue;
            }
            if(numberOfSpaces>=3){
                // new word is forming
                System.out.println("Appending a space and forming a new word");
                letters.append(" ");
            }
            // build our morse code characters here into a letter
            letter.append(c);
            System.out.println("Appending letter " + letter + " now");
            numberOfSpaces=0;
        }
        // last letter
        System.out.println("Last letter is" + letter);
        if(letter.length()>0){
            // this will be the end of a letter
            var convertedLetter = "a"; //MorseCode.get(letter.toString());
            System.out.println("Last converted letter is" + convertedLetter);
            letters.append(convertedLetter);
        }
        System.out.println("Letters now is " + letters);
        return letters.toString();



    }
    static String DetermineWordOrder(String words){
        /*
         15 August 2020
         https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
         */
        System.out.println("\n\nDetermining the order of words");

        // null cases
        if(words.isEmpty()) return "";
        if(words == null) return "";

        System.out.println("input string is - " + words);
        var unorderedWords = words.split(" ");
        System.out.print("Unordered words are " );
        for(String word:unorderedWords){
            System.out.print(word + ",");
        }

        // create new word array
        var orderedWords = new String[unorderedWords.length];
        // place words into ordered array
        for(String word:unorderedWords){
            for(Character c:word.toCharArray()){
                if(Character.isDigit(c)){
                    orderedWords[Character.getNumericValue(c)-1] = word;
                }
            }
        }

        // print ordered array
        System.out.print("\nOrdered array of words is ");
        for(String word:orderedWords){
            System.out.print(word + ",");
        }
        var outputString = String.join(" ",orderedWords);
        return outputString;
    }
    static List<String> Permutations(String s){
        /*
        15 August 2020
        https://www.codewars.com/kata/5254ca2719453dcc0b00027d/train/java
        Print all permutations of a string, removing duplicates first

        This one is not finished!

         */
        System.out.println("\n\nPrint permutations of a string");
        String inputString = s;
        char[] inputCharArray = inputString.toCharArray();

        System.out.println("Input string is " + inputString);

        // build output set which only holds unique values
        Set<String> permutations = new HashSet<>();

        // null cases
        if (inputString.isEmpty() || inputString==null) return new ArrayList<>();

        // get all permutations
        List<Character> permutation = new ArrayList<>();
        for(char item:inputCharArray){
            permutation.add(item);
        }
        permutation.clear();
        for(int i=0;i<inputCharArray.length;i++){
           // iterate over remaining characters characters
           for(int j=0;j<inputCharArray.length;j++){
               // swap items
               var temp = inputCharArray[i];
               inputCharArray[i] = inputCharArray[j];
               inputCharArray[j] = temp;
               permutation.clear();
               for(char item:inputCharArray){
                   permutation.add(item);
               }
               // swap back
               inputCharArray[j] = inputCharArray[i];
               inputCharArray[i] = temp;
               System.out.println("Adding permutation " + permutation.toString());
               permutations.add(permutation.toString());
           }
        }

        for(int i = 0;i< inputCharArray.length/2;i++){
            char c = inputCharArray[inputCharArray.length-i-1];
            System.out.println("c is " + c);
            inputCharArray[inputCharArray.length-i-1] = inputCharArray[i];
            inputCharArray[i] = c;

        }
        System.out.print("\nReversed array is ");
        for(char c:inputCharArray){
            System.out.print(c);
        }




        permutation = new ArrayList<>();
        for(char item:inputCharArray){
            permutation.add(item);
        }
        permutation.clear();
        for(int i=0;i<inputCharArray.length;i++){
            // iterate over remaining characters characters
            for(int j=0;j<inputCharArray.length;j++){
                // swap items
                var temp = inputCharArray[i];
                inputCharArray[i] = inputCharArray[j];
                inputCharArray[j] = temp;
                permutation.clear();
                for(char item:inputCharArray){
                    permutation.add(item);
                }
                // swap back
                inputCharArray[j] = inputCharArray[i];
                inputCharArray[i] = temp;
                System.out.println("\nAdding permutation " + permutation.toString());
                permutations.add(permutation.toString());
            }
        }



        System.out.println("Final list of permutations is " + permutations);

        // convert set to list and return

        var permutationsAsList = permutations.stream().collect(Collectors.toCollection(ArrayList::new));

        // actually we have a list of arrays and we want a list of strings
        List<String> finalList = new ArrayList<>();
        for(var item : permutationsAsList){
            var stringbuilder = new StringBuilder();
            for (var c : item.toCharArray()){
                 if(Character.toString(c).matches("[a-zA-Z]+")){
                    stringbuilder.append(c);
                }
            }
            finalList.add(stringbuilder.toString());
        }
        System.out.println("Final list is " + finalList);

        var finalListSorted = finalList.stream().sorted().collect(Collectors.toList());

        System.out.println("Final sorted list is " + finalListSorted);




        // Version 2 using Heap's algorithm




        var chararray = inputCharArray;
        var outputarray = generate(chararray.length, chararray);
        System.out.print("Generate chararray is ");
        for(char c:outputarray){
            System.out.print(c);
        }


        generate(inputCharArray.length,inputCharArray);

        return finalListSorted;
    }
    static char[] generate(int k, char[] items){
        if (k == 1) {
            return items;
        }
        else{
            generate(k-1,items);
            for(int i=0;i<k-1;i++){
               if(k%2==0){
                   Character temp = items[i];
                   items[i] = items[k-1];
                   items[k-1] = temp;
               }
               else {
                    Character temp = items[0];
                    items[0]= items[k-1];
                    items[k-1] = temp;
               }
               generate(k-1,items);
            }
        }
        return items;
    }
    static int[] PerfectPower(int n){
        /*
            https://www.codewars.com/kata/54d4c8b08776e4ad92000835/train/java
            Perfect power = integer which can be expressed as an integer power of another integer
            m to power k = n eg 9^2 = 81 so return (9,2)
        */
        System.out.println("\n\nIs " + n + " a perfect power?  " +
                "If so return the numbers m and k so that m to power k is this number n");
        // null case
        if(n<1) {
            System.out.println("Nothing found so returning null");
            return null;
        }

        // loop until value exceeded
        for (int m=2; m <= Math.ceil(Math.sqrt(n));m++){
            boolean numberReached = false;
            int p = 2;
            while(numberReached == false){
                var power = Math.pow(m,p);
                if(power>n){
                    numberReached=true;
                }
                else if(power==n){
                    System.out.println("Match found ie Math.Pow(" + m + "," + p + " = " + n + ")");
                    return new int[]{m,p};
                }
                p++;
            }
        }
        System.out.println("Nothing found for " + n + " so returning null");
        return null;
    }
    static String Factorial(int n){
        /*
            https://www.codewars.com/kata/557f6437bf8dcdd135000010/java
            return the factorial of a number
        */
        System.out.println("\n\nReturn the factorial of " + n);
        long answer = factorial(n);
        System.out.println("The factorial of " + n + " is " + answer);
        return String.valueOf(answer);
    }
    static long factorial(int n){
        if(n==0) return 1;
        else{
            return n * factorial(n-1);
        }
    }
    static int[] Snail(int[][] array){
        /*
        https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
        Given an nxn array iterate clockwise from outside to in like a snake and output all
        the elements in a single array
        */
        System.out.println("\n\nOutputting Elements of nxn array like a snail starting top left and winding" +
                "round clockwise into the array like a spiral");
        // null conditions
        if(array == null || array.length==0){
            System.out.println("Array is null so returning null");
            return null;
        }
        if(array[0].length==0){
            System.out.println("Array is null so returning null");
            return new int[0];
        }
        System.out.println("Array is " + array.length + " x " + array.length);
        System.out.print("Array elements are ");
        for(var row: array){
            System.out.print("[");
            for(var element:row){
                System.out.print(element+",");
            }
            System.out.print("],");
        }
        List<Integer> list = new ArrayList<>();

        // loop round and count the loops.
        for (int loop = 0; loop <= array.length/2;loop++){
            // add items top left to bottom right
            for(int i = loop; i < array.length;i++){
                // first row
                if(i == loop) {
                    for(int j=loop;j< array.length-loop;j++){
                        list.add(array[loop][j]);
                    }
                }
                else if(i>loop && i < array.length-1-loop) {
                    list.add(array[i][array.length-1-loop]);
                }
            }
            // now reverse the process and add from bottom right to top left
            for (int i = array.length-1-loop;i>loop;i--){
                if(i== array.length-1-loop){
                    // iterate bottom row in reverse
                    for (int j=array.length-1-loop;j>=loop;j--){
                        list.add(array[i][j]);
                    }
                }
                else list.add(array[i][loop]);
            }
            System.out.println("\nItems after loop " + loop + " are " + list);
        }
        int[] outputArray = list.stream().mapToInt(Integer::intValue).toArray();
        return outputArray;
    }
    static String pagesToPrint(int[] arr){
       /*
            https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/java
            Pass in an array of integers
            Return ordered integers plus for 3 or more consecutive numbers, start-end inclusive
            12,13,15,16,17 returns 12,13,15-17
         */
        System.out.println("\n\nPages to print - takes an array of numbers and formats them as if they were pages to print");

        // null cases
        if(arr.length==0) return "";
        if(arr.length==1) return Integer.toString(arr[0]);
        // make sure array is ordered
        Arrays.sort(arr);

        var output = new StringBuilder();
        int previousItem = arr[0];
        int consecutiveStart = arr[0];
        int consecutiveEnd = arr[0];
        boolean consecutive = false;
        boolean consecutiveTwo = false;
        String comma = "";
        for (int i=1;i<arr.length;i++) {
            previousItem=arr[i-1];
            int currentItem = arr[i];
            int difference = currentItem-previousItem;
            boolean lastItem = (i==arr.length-1)?true:false;
            // if a consecutive sequence is in progress
            if(consecutive){
                if (difference==1){
                    consecutiveTwo = true;
                    consecutiveEnd=currentItem;
                    if(lastItem){
                        if(consecutiveTwo){
                            output.append(comma + consecutiveStart + "-" + currentItem);
                        }
                        else{
                            output.append(comma + previousItem + "," + currentItem);
                        }
                        comma = ",";
                    }
                    continue;
                }
                if(difference>1){
                    // this has caused a break in continuity
                    if(consecutiveTwo){
                        output.append(comma + consecutiveStart + "-" + consecutiveEnd);
                        comma=",";
                    }
                    // don't have two previous consecutive items so print them singly
                    else{
                        output.append(comma + Integer.toString(arr[i-2]) + "," + previousItem);
                        comma=",";
                    }
                    comma = ",";
                    if(lastItem){
                        output.append(comma + currentItem);
                        comma = ",";
                    }
                    consecutive=false;
                    consecutiveTwo=false;
                }
            }
            // no consecutive sequence exists
            else{
                // this starts a consecutive sequence
                if(difference==1){
                    consecutive=true;
                    consecutiveStart=previousItem;
                    consecutiveEnd=currentItem;
                    if(lastItem){
                        output.append(comma + previousItem + "," + currentItem);
                        comma = ",";
                    }
                }
                else if(difference>1){
                    // can just add the item to the end of the string, because no continuous sequence exist
                    output.append(comma + previousItem);
                    comma = ",";
                    if(lastItem){
                        output.append(comma + currentItem);
                        comma = ",";
                    }
                }
            }
        }
        return output.toString();
    }
    static String IPV4(long ip){



        /*
        https://www.codewars.com/kata/52e88b39ffb6ac53a400022e/train/java
        Pass in an integer and get out an IP
        */


        System.out.println("\n\nPassing in an integer and returning an IP address");
        // null cases
        if (ip < 0) return null;
        if (ip == 0) return "0.0.0.0";
        if (ip < 256) return "0.0.0." + ip;
        if (ip > (long)Math.pow(2,32)){
            return null;
        }


        String finalDigit = (ip%2==0) ? "0" : "1";
        System.out.println("Final digit is " + finalDigit);

        String binaryIP = Integer.toBinaryString((int)(ip/2)) + finalDigit;
        System.out.println("Binary representation is " + binaryIP + " of length " + binaryIP.length());
        while(binaryIP.length()<32){
            binaryIP = "0" + binaryIP;
        }
        System.out.println("Binary representation is " + binaryIP + " of length " + binaryIP.length());

        String firstOctet = binaryIP.substring(0,8);
        String secondOctet = binaryIP.substring(8,16);
        String thirdOctet = binaryIP.substring(16,24);
        String fourthOctet = binaryIP.substring(24,32);

        int firstIP = Integer.parseInt(firstOctet,2);
        int secondIP = Integer.parseInt(secondOctet,2);
        int thirdIP = Integer.parseInt(thirdOctet,2);
        int fourthIP = Integer.parseInt(fourthOctet,2);

        String output = firstIP + "." + secondIP + "." + thirdIP + "." + fourthIP;

        return output;


    }
    static long NextSmallestNumber(long n){
        /*
        https://www.codewars.com/kata/5659c6d896bc135c4c00021e/train/java
        Return the next lowest integer containing the same digits
        */

        System.out.println("\n\nReturn next lowest number with same digits from " + n);
        // null cases
        if(n<=1) return -1;


        // convert to char array
        System.out.print("Printing items out as character array - ");
        char[] charArray = ("" + n).toCharArray();
        for(char item:charArray) System.out.print(item);

        // 2 digit number just swap and test
        if(Long.toString(n).length()==2){
            var swappedNumbers = new StringBuilder();
            swappedNumbers.append(charArray[1]);
            swappedNumbers.append(charArray[0]);
            System.out.println("\nSwapped numbers are " + swappedNumbers.toString());
            var swappedArrayAsInt = Integer.parseInt(swappedNumbers.toString());
            if((long)swappedArrayAsInt<n) {
                System.out.println("returning " + swappedArrayAsInt);
                return swappedArrayAsInt;
            }
            System.out.println("returning " + n);
            return n;
        }



        // Get next lowest number
        List<Character> remainingDigits = new ArrayList<>();
        // firstly obtain existing number and store that
        for(int i=0;i< charArray.length;i++){
            remainingDigits.add(charArray[i]);
        }
        System.out.println("\nThe remaining digits make number " + remainingDigits.toString());

        // find pair which swaps to give lower number, starting from rightmost pairs
        var testArray = Arrays.copyOf(charArray,charArray.length);
        long testArrayAsNumber = 0;
        long largestPossibleAlternativeNumber = n;
        for(int i= testArray.length-2;i>=0;i--){
            char temp=testArray[i];
            testArray[i]=testArray[i+1];
            testArray[i+1] = temp;
            String testArrayAsString = String.valueOf(testArray);
            testArrayAsNumber = Long.parseLong(testArrayAsString);
            if(testArrayAsNumber < n && testArrayAsString.charAt(0)!='0') {
                largestPossibleAlternativeNumber = testArrayAsNumber;
                break;
            }
            // failed so swap numbers back and try again
            else{
                temp=testArray[i];
                testArray[i]=testArray[i+1];
                testArray[i+1] = temp;
            }
        }
        System.out.println("Largest possible alternative number is " + largestPossibleAlternativeNumber);

        // now we are not done yet because we now need to order the remaining numerical digits in descending order of value
        // starting at the fixed digit which is the leftmost of the switched pair
        // 53728 switches to 53278 but fix the 2 and swap 8 and 7 to get 53287 which is the answer
        List<Character> remainingLastDigits = new ArrayList<>();
        for(int i=2;i< testArray.length;i++){
            remainingLastDigits.add(testArray[i]);
        }
        System.out.println("Remaining digits at the end of the number are " + remainingLastDigits.toString());

        // now sort descending
        Collections.sort(remainingLastDigits, Collections.reverseOrder());
        System.out.println("Remaining digits sorted are " + remainingLastDigits.toString());

        // now reconstruct the full number using these descending digits
        var reconstructedNumber = new StringBuilder();
        reconstructedNumber.append(testArray[0]);
        reconstructedNumber.append(testArray[1]);
        for(char c:remainingLastDigits){
            reconstructedNumber.append(c);
        }
        System.out.println("Reconstructed number is " + reconstructedNumber.toString());

        long output = n;
        long reconstructedNumberAsLong = Long.parseLong(reconstructedNumber.toString());
        System.out.println("reconstructed number as long is " + reconstructedNumberAsLong);
        if(reconstructedNumberAsLong<n){
            output = Long.parseLong(reconstructedNumber.toString());
            return output;
        }
        if(largestPossibleAlternativeNumber<n){
            return largestPossibleAlternativeNumber;
        }


        // if at this point a match has not been found we can do one last thing
        // we take the highest number less than the first digit
        remainingDigits.clear();
        for(int i=1;i< charArray.length;i++){
            remainingDigits.add((charArray[i]));
        }
        Collections.sort(remainingDigits,Collections.reverseOrder());
        var counter = remainingDigits.toArray().length;
        // trying to find a new first digit which is the next highest under the original first digit
        var newFirstDigit = new StringBuilder();
        var newFirstDigitFound = false;
        List<Integer> restOfNumbers = new ArrayList<>();
        for(int i=0;i<  counter  ;i++){
            int digit = Integer.parseInt(remainingDigits.toArray()[i].toString());
            var sb = new StringBuilder();
            sb.append(charArray[0]);
            int firstDigit = Integer.parseInt(sb.toString());
            if(digit<firstDigit && !newFirstDigitFound){
                newFirstDigit.append(digit);
                restOfNumbers.add(firstDigit);
                newFirstDigitFound=true;
                // not allowed to be zero
                if(digit==0){
                    return -1;
                }
            }
            else {
                restOfNumbers.add(digit);
            }
        }
        Arrays.sort(restOfNumbers.toArray(),Collections.reverseOrder());
        System.out.println("We now have initial digit " + newFirstDigit + " plus " + restOfNumbers.toString());
        // we should now have a new reconstructed number
        var finalNumber = new StringBuilder();
        finalNumber.append(newFirstDigit);
        for(var c : restOfNumbers){
            finalNumber.append(c);
        }
        System.out.println("Final number is " + finalNumber);
        var finalNumberAsLong = Long.parseLong(finalNumber.toString());
        if(finalNumberAsLong<n){
            output = finalNumberAsLong;
            return output;
        }
        return output;
    }
    static void RunFunctionalProgramming(){
        /*
         http://www.codewars.com/kata/java-functional-programming-part-1-the-beginning/java
        */        
        var s = new Student("John","Smith","js123");
        System.out.println(FunctionalProgramming.f.apply(s));
    }
    static int SearchEngine(String needle, String haystack){
        /*
        Find needle in a haystack
        https://www.codewars.com/kata/546c7f89bed2e12fb300056f/train/java
        Return the index of a match
        Include _ as a wildcard
        Return -1 if no match
        Have to say - this was a tough one as there were a lot of edge cases!
        */
        System.out.println("\n\nMatching '" + needle + "' in '" + haystack + "'");
        var needleAsArray = needle.toCharArray();
        var haystackAsArray = haystack.toCharArray();

        // null cases
        if(needle.length()>haystack.length()) return -1;
        if(StringUtils.isEmpty(needle)) return -1;
        if(StringUtils.isEmpty(haystack)) return -1;
        if(needle=="_") return 0;

        Character firstletter = needleAsArray[0];

        // check for matches
        List<Integer> matches = new ArrayList<>();

        for(int i=0;i<= (haystackAsArray.length-needleAsArray.length);i++){
            if(haystackAsArray[i] == firstletter){
                matches.add(i);
            }
            if(firstletter=='_'){
                matches.add(i);
            }
        }

        if(matches.stream().count()==0) {
            System.out.println("No match found");
            return -1;
        }
        System.out.println("Initial letter " + matches.stream().count() + " matches at " + matches.toString());

        // now check each match for full match condition
        for(var match:matches){
            var partialMatch= false;
            var fullMatch=false;
            var lastItem = false;
            System.out.println(" ");
            for(int i=0;i<needleAsArray.length;i++){
                if(i== needleAsArray.length-1) lastItem = true;
                System.out.println("i = " + i + ", haystackAsArray[" +  (match+i) + "] = " + haystackAsArray[match+i] + " and needleAsArray[i] = " + needleAsArray[i] + " and last item = " + lastItem);
                // wildcard
                if(needleAsArray[i] == '_') {
                    if (!lastItem) continue;
                    if(lastItem) {
                        // check if partial matches have been found to date!
                        if (partialMatch) {
                            System.out.println("yes - we have a valid match at index " + match);
                            return match;
                        }
                    }
                }
                // valid match
                if(haystackAsArray[match+i]==needleAsArray[i]) {
                    partialMatch=true;
                    if(lastItem) fullMatch=true;
                    continue;
                }
                partialMatch=false;
                // no match found so exit this for loop and move onto next match in matches
                break;
            }
            if(firstletter == '_' && !lastItem) continue;
            if(fullMatch){
                System.out.println("yes - we have a valid match at index " + match);
                return match;
            }
        }
        System.out.println("No match found");
        return -1;
    }
    static String ConvertTime(int timeDiff){
        /*
        https://www.codewars.com/kata/5502ddd734137e90af000f62/train/java
        return days, hours, minutes, seconds given an integer of seconds
        */
        System.out.println("Find the number of days, hours, minutes and seconds in " + timeDiff + " seconds");

        // null
        if (timeDiff == 0) return "0 0 0 0";

        int days = 0, hours = 0, minutes = 0, seconds = 0;

        days = timeDiff/(60*60*24);
        System.out.println(days);

        hours = (timeDiff - (86400*days))/(60*60);
        System.out.println(hours);

        minutes = (  timeDiff- (86400*days) - (3600*hours)  ) / (60);
        System.out.println(minutes);

        seconds = timeDiff - (86400*days) - (3600*hours) - (60*minutes);
        System.out.println(seconds);

        String timeOutput = days + " " + hours + " " + minutes + " " + seconds;
        System.out.println(timeOutput);
        return  timeOutput;

    }
    static int CheckIfSequence(String sequence){
        /*
        https://www.codewars.com/kata/5512e5662b34d88e44000060/train/java
        Given a string of numbers find out if the sequence is continuous or broken.
        Return 0 if unbroken, 1 if alpha characters present, n is lowest missing number
        */
        System.out.println("\n\nFinding if a sequence of numbers has any missing or invalid characters in string " + sequence);

        // check for null input
        if (sequence == null) return 1;
        if (sequence == "" ) return 1;
        if (sequence == " ") return 1;

        String[] elements = sequence.split(" ");
        if(elements.length == 0) return 1;

        List<Integer> elementsAsIntegers = new ArrayList<>();
        int previousNumber=0;
        for(var element:elements){
            int number = -1;
            try {
                number = Integer.valueOf(element);
                // check if number is one greater than last number in list
                if(previousNumber+1 == number){
                    elementsAsIntegers.add(number);
                    previousNumber=number;
                }else{
                    // invalid so exit, returning the missing number
                    System.out.println("Missing element " + (previousNumber+1));
                    return previousNumber+1;
                }

            }
            catch(Exception e){
                // invalid character detected so return
                System.out.println("\nInvalid character - " + element + "\n\n");
                return 1;
            }
            System.out.print(element + ", ");
        }

        System.out.println("\nSequence is valid");
        return 0;

    }
}


