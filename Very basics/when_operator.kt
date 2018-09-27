//Program to check whether a given number is even or not using when operator
//when operator is the equivalent of switch in Java and can be used as an expression. 
//E.g. var result = when(expression/condition) {...}
  
import java.util.Scanner
fun main(args: Array<String>)
{
    val reader = Scanner(System.`in`)
    println("Enter the number (Use 0 to escape)\n")
    do {
        var a = reader.nextInt()
        when (a % 2 == 0) {
            true -> println("The number is Even\n")
            else -> println("The number is Odd\n")    //else statement is Mandatory
        }
    }while(a!= 0)
}
