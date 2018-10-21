//Program to perform bubble sort in Kotlin
import java.util.Scanner

fun bubsort(a: IntArray, size: Int){
    var temp: Int
    for(i in 0..size-1)
    for(j in 0..size-2-i)
        if(a[j] > a[j+1]){
           temp = a[j]
           a[j] = a[j+1]
           a[j+1] = temp
        }
}         //This makes me realize debugging in kotlin is much easier than other languages

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter the size: ")
    val size = reader.nextInt()

    var a = IntArray(size)
    println("Enter the elements:")
    for(i in 0..size-1){
        a[i] = reader.nextInt()
    }

    bubsort(a, size)

    for(i in 0..size-1){
        print("${a[i]}, ")
    }
}
