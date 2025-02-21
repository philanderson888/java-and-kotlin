package phonebook

import java.io.File
import kotlin.system.measureNanoTime

fun main() {
    //linearPhoneBookSearch()
    bubbleSort()
    jumpSearch()
    //nanoTime()
}

fun linearPhoneBookSearch(){
    /*
    // note - a copy of this code is already held, so this can be deleted
    https://hyperskill.org/projects/86/stages/476/implement
    Goal is to search a very large phone book and to obtain the phone numbers of given people from it in an efficient manner
    Phone book is local file at c:\delete me java\telephone directory\directory.txt
    also copy made locally of a tiny portion of this file at directory.txt for future compatibility!
    */
    println("\n\nCreating a phonebook then finding items in it given 2 files directory.txt and find.txt")
    val startTime = System.currentTimeMillis()
    println("Start searching...")
    println("starting search at time $startTime")
    val file = File("C:\\\\github\\\\java-and-kotlin\\\\data\\\\directorywith020names.txt")
    val phonebook = hashMapOf<Int,String>()
    file.forEachLine {
        val line = it.split(" ")
        val phone = line[0].toInt()
        val person = line[1] + " " + line[2]
        phonebook[phone] = person
    }
    //println(phonebook)
    // now get our text file, iterate the values and print out the ones that are a match!

    val findEntries = File("C:\\\\github\\\\java-and-kotlin\\\\data\\\\find.txt")
    // now go for the big file
    val bigFile = File("C:\\\\github\\\\java-and-kotlin\\\\data\\\\directory.txt")
    val bigPhonebook = hashMapOf<Int,String>()
    bigFile.forEachLine {
        val line = it.split(" ")
        val phone = line[0].toInt()
        var person = ""
        var first = true
        for(name in line) {
            if (first) {
                first = false
            } else {
                person += "$name "
            }
        }
        person = person.trim()
        bigPhonebook[phone] = person
    }
    println("phonebook has ${bigPhonebook.size} entries")
    // find matches
    val matches = mutableListOf<String>()
    findEntries.forEachLine {
        if(bigPhonebook.containsValue(it)){
            matches.add(it)
            //println("Main phonebook contains $it")
        }
    }
    println("Found ${matches.size+1} / ${matches.size+1} matches")
    val finishTime = System.currentTimeMillis()
    println("Finished at $finishTime")
    val timeDifference = (finishTime - startTime)
    println(String.format("%1\$tM min. %1\$tS sec. %1\$tL ms.",timeDifference))
}

fun bubbleSort(){
    /*
    https://hyperskill.org/projects/86/stages/477/implement
    Given a list of data we want to sort the list by name
    List data is in format number name ie 123545 Joe Blog
    Sort this by name and use bubble sort!
    Time the operation to sort the list of data as well
    */
    println("\n\nTelephone Directory Bubble Sort")
    println("Instructed to sort our telephone directory by alphabetical name")
    println("firstly convert to a list of entries then sort the list")
    val start = System.currentTimeMillis()
    // read file to local array first of all
    val directory = File("C:\\\\github\\\\java-and-kotlin\\\\data\\\\directory.txt").readLines()
    println(String.format("\nTime to read entire file of ${directory.size} lines into local memory is %1\$tM min. %1\$tS sec. %1\$tL ms.",System.currentTimeMillis()-start))
    val samplesizes = arrayOf(5,10,20,100,1000,10000, 50000, 100000, 1014129)
    // repeat for different file samplle sizes
    for (samplesize in samplesizes){
        var linearSearch = false
        println("\n\n\nSample size is $samplesize")
        val users = mutableListOf<User>()
        val start = System.currentTimeMillis()
        for (i in 1..samplesize){
            val line = directory[i].split(" ")
            val phone = line[0].toInt()
            var person = ""
            var first = true
            for (name in line) {
                if (first) {
                    first = false
                } else {
                    person += "$name "
                }
            }
            person = person.trim()
            val user = User()
            user.fullName=person
            user.phoneNumber= phone
            users.add(user)
        }
        println(String.format("Time to created unsorted list of users is %1\$tM min. %1\$tS sec. %1\$tL ms.",System.currentTimeMillis()-start))
        //println("\nUnsorted entries")
        for(i in 0..users.size-1) {
            //print("${users[i].fullName} ${users[i].phoneNumber}, ")
            if(i>10) break
        }
        // now we have an unsorted list we have to create a sorted list using bubble sort
        var sorted = false
        var iterations = 0
        while(!sorted) {
            // bubble sort compares items then swaps them if they need changing
            var userTemp: User
            sorted = true
            for (i in 0..users.size-2) {
                if(users[i].compareTo(users[i+1]) == 1) {
                    //println("${users[i].fullName} compared to ${users[i+1].fullName} is ${users[i].compareTo(users[i+1])} so swapping")
                    userTemp = users[i]
                    users[i]=users[i+1]
                    users[i+1]=userTemp
                    sorted = false
                }
            }
            iterations++
            // break at 20 seconds for bubble sort!
            val seconds = ((System.currentTimeMillis()-start)/1000)
            if(seconds > 20) {
                linearSearch = true
                break
            }
            println(String.format("\nInterim time is %1\$tM min. %1\$tS sec. %1\$tL ms.",System.currentTimeMillis()-start))
        }
        println(String.format("Bubble sort with $samplesize items took %1\$tM min. %1\$tS sec. %1\$tL ms. with $iterations iteration",System.currentTimeMillis()-start))
        if (linearSearch) {
            println("Bubble sort is taking too long (greater than 20 seconds) so exiting to linear search method")
            linearPhoneBookSearch()
        } else {
            // file is now sorted so try the jump sort method on it
        }
        //println("\n\nSorted entries")
        for(i in 0..users.size-1) {
            //print("${users[i].fullName} ${users[i].phoneNumber}, ")
            if(i>10) break
        }
        // write user array to a file
        var outputFile = File("output.txt")
        if (outputFile.exists()){
            outputFile.delete()
        }
        for (user in users) {
            var userString = "${user.phoneNumber} ${user.fullName}\n"
            outputFile.appendText(userString)
        }
    }
}

fun jumpSearch(){
    /*
    https://hyperskill.org/projects/86/stages/477/implement
    After sorting by name, search for a name using jump sort method
    where size of jump is square root of the list length
    Search for 500 phone numbers
    time it as well
    */
}

fun nanoTime(){
    val nanotime = measureNanoTime {
        linearPhoneBookSearch()
    }
    println("nano time is $nanotime and in seconds this is ${nanotime/1000000000}")
}
