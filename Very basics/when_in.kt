//Program to check whether a given letter is uppercase or lowercase using 
// when operator and in operator

import java.util.Scanner
fun main(args: Array<String>)
{
    val reader = Scanner(System.`in`)
    println("Enter the letter (use \" \" to escape)\n")
    do {
        var a = readLine()!!.single() //Note that this is the proper way to read a Character in Kotlin
        when (a) {
            in 'A'..'Z' -> println("The letter is Uppercase\n")
            in 'a'..'z' -> println("The letter is lowercase\n")
        }
    }while(a in 'a'..'z' || a in 'A'..'Z')
}
