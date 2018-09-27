//Program to check if an input is a character or a string using try-catch
import java.lang.Exception
fun main(args: Array<String>){
    println("Enter the Character(use 0 to escape): ")
    while (true) {
        try {
            var a: Char = readLine()!!.single()
            println("It is a character")
            if(a == '0') break
        } catch (e: Exception) {
            println("It is a string. The program returned this error:\n${e.message}")
        }
    }
}
