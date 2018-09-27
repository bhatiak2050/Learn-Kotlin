//Program to check whether a given letter is uppercase or lowercase using
// when operator and in operator

fun main(args: Array<String>)
{
    println("Enter the letter (use 0 to escape)\n")
    do {
        var a = readLine()!!.single() //Note that this is the proper way to read a Character in Kotlin
        when (a) {
            in 'A'..'Z' -> println("The letter is Uppercase\n")
            in 'a'..'z' -> println("The letter is lowercase\n")  //Did you notice the missing else? I thought that was mandatory...
        }
    }while(a in 'a'..'z' || a in 'A'..'Z') //the .. operator is called Range operator and returns true if a is in the range a - z or A - Z
}
