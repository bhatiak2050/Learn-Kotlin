//Program to compute greatest of 3 numbers

import java.util.Scanner
fun main(args: Array<String>)
{
    var stdin = Scanner(System.`in`)
    println("Enter the three numbers (Enter all 0 to escape)")
    do {

        var a = stdin.nextInt()
        var b = stdin.nextInt()
        var c = stdin.nextInt()

        //var greatest = if(a>b && a>c) a else if(b>a&&b>c) b else c
        var greatest = if(a>b){if(a>c) a else c} else{if(b>c) b else c}
        println("The greatest number is $greatest\n")
    }while (a+b+c != 0)
}
