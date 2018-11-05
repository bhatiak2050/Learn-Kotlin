import java.util.Scanner

fun partition(arr: IntArray, low: Int, high: Int): Int{
    var pivot: Int = arr[high]
    var i: Int = (low-1)
    var t: Int
    
    for(j in low..high-1){
        if(arr[j] <= pivot){
            i=i+1
            t=arr[i]
            arr[i]=arr[j]
            arr[j]=t
        }
    }
    t = arr[i+1] 
    arr[i+1] = arr[high]
    arr[high] = t
    return (i + 1)
}

fun quickSort(arr: IntArray, low: Int, high: Int){
    if(low < high){
        var pi: Int = partition(arr, low, high)
        quickSort(arr, low, pi - 1)
        quickSort(arr, pi + 1, high)
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
    
    quickSort(a, 0, n-1)
    
    println("The sorted array is ")
    for(i in 0..n-1) print("${a[i]} ")
}
