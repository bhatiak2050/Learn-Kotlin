//Program to perform selection sort in Kotlin
import java.util.Scanner

fun selsort(a: IntArray, size: Int){
    var smallest: Int
    var temp: Int
    var pos = 0
    var flag=0

    for (i in 0..size-1){
        smallest = a[i]
        for(j in i..size-1){
            if(a[j] < smallest) {
                smallest = a[j]
                pos=j
                flag=1
            }
        }
        if(flag==1) {
            temp = a[i];
            a[i] = a[pos];
            a[pos] = temp
        }
        flag=0
    }
}

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter the size: ")
    val size = reader.nextInt()

    var a = IntArray(size)
    println("Enter the elements:")
    for(i in 0..size-1){
        a[i] = reader.nextInt()
    }

    selsort(a, size)

    for(i in 0..size-1){
        print("${a[i]}, ")
    }
}
