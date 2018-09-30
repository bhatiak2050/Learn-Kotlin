//Program to print n'th number in the fibonacci series using tail recursion
import java.math.BigInteger
fun fibo(n: Int, a: BigInteger, b: BigInteger): BigInteger{
    return if(n==0) a else fibo(n-1, b, a+b)
}

fun main(args: Array<String>){
    var a = BigInteger("0")
    var b = BigInteger("1")

    do {
        println("Enter the position (Use 0 to escape): ")
        var n = readLine()!!.toInt()
        println("The $n th tern in the fibonacci series is ${fibo(n, a, b)}")
    }while (n!=0)
}
