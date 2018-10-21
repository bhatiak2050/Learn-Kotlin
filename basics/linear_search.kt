//Program to perform Linear Search in Kotlin
import java.util.Scanner

fun lsearch(a: IntArray, size: Int, key: Int): Int{   //Notice that a:IntArray is calling by Reference, not value
    for(i in 0..size-1)
        if(a[i] == key) {
            //a[i] = 0           //this changes the value in the calling function as well
            return i
        }
    return -1
}

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter the size: ")
    val size = reader.nextInt()

    var a = IntArray(size)
    println("Enter the elements: ")
    for(i in 0..size-1){
        a[i] = reader.nextInt()
    }

    println("Enter the key: ")
    var key = reader.nextInt()
    val position = lsearch(a, size, key)

    if(position == -1) println("Element not found")
    else println("Element found in position ${position+1}")

    /*for(i in 0..size-1){      //Reveal this code to see that the value gets changed
        print("${a[i]}, ")      //when you change it in the lsearch function
    }*/             
}
