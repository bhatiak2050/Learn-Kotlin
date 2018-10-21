import java.util.Scanner;
fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter the size of the array: ")
    val size = reader.nextInt()

    var a = IntArray(size)        //How to initialize the array
    println("Enter the elements: ")
    for(i in 0..size-1) a[i] = reader.nextInt();  //Access normally

    println("You entered:")
    for(i in 0..size-1) print("${a[i]}" + if(i!=size-1)", " else "\n")
}
