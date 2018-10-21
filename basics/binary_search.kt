//Program to perform Linear Search in Kotlin
import java.util.Scanner

fun bsearch(a: IntArray, size: Int, key: Int): Int{
    var beg=0
    var last = size-1
    var mid: Int

    while (beg <= last) {
        mid = (beg + last) / 2
        if (key < a[mid])
            last = mid - 1
        else if (key > a[mid])
            beg = mid + 1
        else
            return mid
    }
    return -1
}

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter the size: ")
    val size = reader.nextInt()

    var a = IntArray(size)
    println("Enter the elements in ascending order: ")
    for(i in 0..size-1){
        a[i] = reader.nextInt()
    }

    println("Enter the key: ")
    var key = reader.nextInt()
    val position = bsearch(a, size, key)

    if(position == -1) println("Element not found")
    else println("Element found at position ${position+1}")
}
