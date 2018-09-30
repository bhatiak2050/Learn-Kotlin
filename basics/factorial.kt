fun fact(n: Int): Int{
    return if(n<=1) 1 else n*fact(n-1)
}

fun main(args: Array<String>){
    println("Enter the number: ")
    val n: Int = readLine()!!.toInt()
    println("The factorial is ${fact(n)}")
}
