package uk.co.philanderson;
import java.util.*;
public class Boggle {

    char[][] board;
    String word;

    public Boggle(final char[][] board, final String word) {
        this.board = board;
        this.word = word;
    }

    public boolean check() {
        /*
        4ku https://www.codewars.com/kata/57680d0128ed87c94f000bfd/train/java
        Find out if a word is a valid word given a boggle board
        // note - this is not quite finished.  I have to implement a checking mechanism to not allow any letter to be used twice
        // i have presently not implemented this features
        */
        System.out.println("\n\nBoggle board - pass in a board of characters and word " + word + " to see if word found in the board");
        var rows = board.length;
        var cols = board[0].length;

        // null cases
        if(word == null) { System.out.println("returning null");return false;}
        if(word == "") { System.out.println("returning null");return false;}
        if(rows == 0) { System.out.println("returning null");return false;}
        if(cols==0) { System.out.println("returning null");return false;}

        System.out.println(rows + " * " + cols + " grid");
        for(var line:board){
            for (char c: line){
                System.out.print(c + ", ");
            }
            System.out.println();
        }


        // Find initial letter
        var wordAsArray = word.toCharArray();
        var initialLetter = wordAsArray[0];
        System.out.print("First letter index 0 is " + initialLetter);
        // is initial letter in the matrix?
        Set<Map.Entry<Integer,Integer>> firstLetterMatches = new HashSet<>();
        for(Integer i=0;i<rows;i++){
            for(Integer j=0;j<cols;j++){
                if(board[i][j] == initialLetter) {
                    System.out.print(" in row " + i + " column " + j + ", ");
                    var pair = new AbstractMap.SimpleEntry<>(i,j);
                    firstLetterMatches.add(pair);
                }
            }
        }
        System.out.print("\nFirst letter matches at ");
        for(var match:firstLetterMatches){
            System.out.print("[" + match.getKey() + "," + match.getValue() + "], ");
        }


        // is there a second letter?
        if(word.length()==1){
            // if only one letter it's either found or not!
            if(firstLetterMatches.stream().count()>=1) {
                System.out.println("\nOne letter supplied and match found");
                return true;
            }
            else {
                System.out.println("\nonly one letter but not found in grid");
                return false;
            }
        }

        // now find out all second letter matches
        Character secondLetter = wordAsArray[1];
        System.out.print("\n\nSecond letter index 1 is " + secondLetter + "\n");
        var secondLetterMatch = false;
        Set<Map.Entry<Integer,Integer>> secondLetterMatches = new HashSet<>();
        for(var match:firstLetterMatches){
            var row = match.getKey();
            var col = match.getValue();
            System.out.println("rows going from " + ((row>0)?row-1:0) + " to " + ((row+1==rows)?row:row+1));
            System.out.println("cols going from " + ((col>0)?col-1:0) + " to " + ((col+1==cols)?col:col+1));
            for(int tryRow = (row>0)?row-1:0;tryRow<=((row+1==rows)?row:row+1);tryRow++){
                for(int tryCol = (col>0)?col-1:0;tryCol<=((col+1==cols)?col:col+1);tryCol++){
                    System.out.println("\trow " + tryRow + " col " + tryCol);
                    if(board[tryRow][tryCol]==secondLetter){
                        secondLetterMatch=true;
                        System.out.println("\t\tsecond letter match at " + tryRow + "," + tryCol);
                        var pair = new AbstractMap.SimpleEntry<>(tryRow,tryCol);
                        secondLetterMatches.add(pair);
                    }
                }
            }
        }
        if(secondLetterMatch){
            System.out.print("\n" + secondLetterMatches.stream().count() + " matches found at ");
            for(var match:secondLetterMatches){
                System.out.print("[" + match.getKey() + "," + match.getValue() + "], ");
            }
            if(word.length()==2){
                // we are done and return true!
                return true;
            }
        }else{
            System.out.println("no second letter matches found");
            return false;
        }
        System.out.println();


        // repeat this process for third letter
        System.out.println("\nNow trying for the third letter match");
        Set<Set<Map.Entry<Integer,Integer>>> allMatches = new HashSet<>();
        allMatches.add(firstLetterMatches);
        allMatches.add(secondLetterMatches);
        Set<Map.Entry<Integer,Integer>> lastMatch = new HashSet<>();
        // get the list of matches from the previous iteration
        for(var match:allMatches){
            lastMatch=match;
        }
        for(int letter = 2; letter < wordAsArray.length;letter++){
            System.out.println("Looking for letter " + (letter + 1) + " index " + letter + " which is " + wordAsArray[letter]);
            var matchFound = false;
            Set<Map.Entry<Integer,Integer>> matches = new HashSet<>();
            // iterate over matches and make sure at least one of them is OK.  If all fail, terminate.
            for(var match:lastMatch){
                var row = match.getKey();
                var col = match.getValue();
                System.out.println("search start point for " + wordAsArray[letter] + " is letter " + wordAsArray[letter-1] + " at row " + row + " col " + col);
                for(int tryRow = (row>0)?row-1:0;tryRow<=((row+1==rows)?row:row+1);tryRow++){
                    for(int tryCol = (col>0)?col-1:0;tryCol<=((col+1==cols)?col:col+1);tryCol++){
                        if(board[tryRow][tryCol]==wordAsArray[letter]){
                            matchFound=true;
                            var pair = new AbstractMap.SimpleEntry<>(tryRow,tryCol);
                            // check for existing match as not allowed to reuse a word!
                            System.out.println("Match found for letter " + wordAsArray[letter] + " is row " + tryRow + " col " + tryCol);
                            matches.add(pair);
                        }
                    }
                }
            }
            // add the list of matches found for this letter to the list of matches for every letter
            if(matchFound){
                allMatches.add(matches);
                lastMatch = matches;
            }
            // no match
            else{
                System.out.println("no match found for letter " + wordAsArray[letter] + " at index " + letter);
            }
        }
        if(allMatches.stream().count()==wordAsArray.length){
            System.out.println("All letters found");
            return true;
        }
        return false;
    }
}