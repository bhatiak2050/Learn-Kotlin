import java.util.Scanner

fun insertionSort(arr: IntArray, n: Int){
    var key: Int
    for(i in 1..n-1){
        key=arr[i]
        var j=i-1;
        while(j >= 0 && arr[j] > key){
            arr[j+1] = arr[j]
            j=j-1
        }
        arr[j+1]=key
    }
}

fun main(args: Array<String>){
    var n: Int
    var i: Int
    
    val reader = Scanner(System.`in`)
    print("Enter the size: ")
    n = reader.nextInt()
    
    var a = IntArray(n)
    println("Enter the elements: ")
    for(i in 0..n-1) a[i] = reader.nextInt();
    
    insertionSort(a, n)
    
    println("The sorted array is ")
    for(i in 0..n-1) print("${a[i]} ")
}
