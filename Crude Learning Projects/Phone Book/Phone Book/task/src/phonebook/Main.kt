package phonebook

import java.io.File

fun main() {
    //phoneBookSearch()
    bubbleSort()
    jumpSearch()
}

fun phoneBookSearch(){
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
    val file = File("C:\\deletemejava\\telephonedirectory\\smalldirectory.txt")
    val phonebook = hashMapOf<Int,String>()
    file.forEachLine {
        val line = it.split(" ")
        val phone = line[0].toInt()
        val person = line[1] + " " + line[2]
        phonebook[phone] = person
    }
    //println(phonebook)
    // now get our text file, iterate the values and print out the ones that are a match!

    val findEntries = File("C:\\deletemejava\\telephonedirectory\\find.txt")
    // now go for the big file
    val bigFile = File("C:\\deletemejava\\telephonedirectory\\directory.txt")
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
    val users = mutableListOf<User>()
    val directory = File("C:\\\\deletemejava\\\\telephonedirectory\\\\directory.txt")
    val start = System.currentTimeMillis()
    directory.forEachLine {
        val line = it.split(" ")
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
    println(String.format("\nTime to created unsorted list of users is %1\$tM min. %1\$tS sec. %1\$tL ms.",System.currentTimeMillis()-start))
    println("\nPrinting 5 sample unsorted entries")
    for(i in 1..5) {
        println("${users[i].fullName} ${users[i].phoneNumber}")
    }
    // now we have an unsorted list we have to create a sorted list using bubble sort
    var unsorted = true
    while(unsorted) {
        // bubble sort compares items then swaps them if they need changing
        for (user in users) {
            
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
