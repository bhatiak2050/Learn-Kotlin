fun print_string(letter: Char = '*', length: Int = 10){ //Default arguments are '*' and 10
    for (i in 1..length)
        print(letter)
}

fun main(args: Array<String>){
    println("Enter the character and length (enter 0 for default): ")
    var a: Char = readLine()!!.toCharArray()[0] //new way to read a character?
    var b: Int  = readLine()!!.toInt()

         if(a!='0' && b != 0) print_string(a, b)
    else if(a!='0' && b == 0) print_string(a)
    else if(a=='0' && b != 0) print_string(length = b)  //Named argument for length. Don't use print_string(b) as it will give an error
    else if(a=='0' && b == 0) print_string()
}
