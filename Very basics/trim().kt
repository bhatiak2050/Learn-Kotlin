//the .trim() is used to remove whitespaces from the begining and ending of a string.
//it does not remove whitespaces between two non-whitespace characters in a string.
import java.util.Scanner
fun main(args: Array<String>){
    print("Enter your username: ")
    var username = readLine()!!
    println("Your username will be ${username.trim()}.")
}
