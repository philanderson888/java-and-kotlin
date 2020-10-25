package phonebook

import java.io.File

fun main() {
    phoneBookSearch()
}

fun phoneBookSearch(){
    /*
    // note - a copy of this code is already held, so this can be deleted
    https://hyperskill.org/projects/86/stages/476/implement
    Goal is to search a very large phone book and to obtain the phone numbers of given people from it in an efficient manner
    Phone book is local file at c:\deletemejava\telephonedirectory\directory.txt
    also copy made locally of a tiny portion of this file at directory.txt for future compatibility!
    */
    println("\n\nCreating a phonebook then finding items in it given 2 files directory.txt and find.txt")
    val startTime = System.currentTimeMillis()
    println("Start searching...")
    println("starting search at time ${startTime}")
    val file = File("data\\directory.txt")
    val phonebook = hashMapOf<Int,String>()
    file.forEachLine {
        val line = it.split(" ")
        val phone = line[0].toInt()
        var person = line[1] + " " + line[2]
        phonebook[phone] = person
    }
    //println(phonebook)
    // now get our text file, iterate the values and print out the ones that are a match!
    val findEntries = File("data\\find.txt")
    findEntries.forEachLine {
        if(phonebook.containsValue(it)){
           // println("Phonebook contains $it")
        }
    }
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
                person += name + " "
            }
        }
        person = person.trim()
        bigPhonebook[phone] = person
    }
    println("phonebook has ${bigPhonebook.size} entries")
    // find matches
    var matches = mutableListOf<String>()
    findEntries.forEachLine {
        if(bigPhonebook.containsValue(it)){
            matches.add(it)
            //println("Main phonebook contains $it")
        }
    }
    println("Found ${matches.size+1} / ${matches.size+1} matches")
    val finishTime = System.currentTimeMillis()
    println("Finished at ${finishTime}")
    val timeDifference = (finishTime - startTime)
    println(String.format("%1\$tM min. %1\$tS sec. %1\$tL ms.",timeDifference))
}
