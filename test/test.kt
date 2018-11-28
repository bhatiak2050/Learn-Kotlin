import java.util.Scanner

fun compareMax(a: IntArray) = if(a[0]>a[1] && a[0]>a[2]) a[0] else if(a[1]>a[2]) a[1] else a[2]
fun compareMin(a: IntArray) = if(a[0]<a[1] && a[0]<a[2]) a[0] else if(a[1]<a[2]) a[1] else a[2]

fun compareMaxN(a: IntArray, n: Int): Int {
    var g: Int = a[0]
    for(i in 0..n-1) if(a[i] > g) g=a[i]
    return g
}

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    print("Enter the size: ")
    val n = reader.nextInt()
    print("Enter the $n numbers: ")
    var a = IntArray(n)
    for (i in 0..n-1) a[i] = reader.nextInt()

    println("The max is ${compareMaxN(a, n)}")
    //println("The min is ${compareMin(a)}")
}
