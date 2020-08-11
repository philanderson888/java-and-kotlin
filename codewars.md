# codewars

## Contents

- [codewars](#codewars)
  - [Contents](#contents)
  - [Capitalise First Letter Of Every Word](#capitalise-first-letter-of-every-word)
  - [Find odd one out in array of either odd or even numbers](#find-odd-one-out-in-array-of-either-odd-or-even-numbers)
  - [Combining 2 Arrays, Sorting And Removing Duplicates](#combining-2-arrays-sorting-and-removing-duplicates)
  - [Equal Sum To Left And Right Of Index In Array](#equal-sum-to-left-and-right-of-index-in-array)
  - [Credit Card Masking](#credit-card-masking)
  - [Sort Digits Of Number In Descending Order](#sort-digits-of-number-in-descending-order)
  - [Does a string have any repeating letters?](#does-a-string-have-any-repeating-letters)
  - [Bouncing Ball](#bouncing-ball)

## Capitalise First Letter Of Every Word

https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

```java
import java.util.ArrayList;
import java.util.List;
public class Capitalise {
    public static void main(String[] args) {
        String phrase = "This is a sentence";
        char[] sentence = phrase.toCharArray();
        boolean spaceExists = false;
        boolean firstLetter = true;
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
}
```

## Find odd one out in array of either odd or even numbers

Given an array of odd or even integers find the one number which is the opposite ie even array, find the odd number and vice versa if odd array find the even number.

https://www.codewars.com/kata/5526fc09a1bbd946250002dc

```java
int[] integers = new int[]{10,12,14,20,50,17};
integers = new int[]{13,15,19,1,-7,24,33};
integers = new int[]{2,6,8,-10,-3}; 
    
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
System.out.println("count is " + evenCount);
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
    
return outlier;
```

## Combining 2 Arrays, Sorting And Removing Duplicates

https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java

```java
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
```


## Equal Sum To Left And Right Of Index In Array

Equal Sides Of An Array

Find the index where the sum of the members to the left and right are the same

https://www.codewars.com/kata/5679aa472b8f57fb8c000047/java


```java
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

```


## Credit Card Masking

Mask credit card information - change all characters into # except last 4 digits

https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java


```java
v/*
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
```

## Sort Digits Of Number In Descending Order

Rearrange digits from highest to least
    12395 becomes 95321

https://www.codewars.com/kata/5467e4d82edf8bbf40000155/java

```java

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


```

## Does a string have any repeating letters?

```java
/* Does a string have any repeating letters?
*  https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
*/

System.out.println("\n\nFinding a match in a string - are any two letters the same?");
str = "Thisa trng";
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
```

## Bouncing Ball

```java
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
```

