//Program to manipulate Array Lists
import java.util.Scanner

//Global variable alert!
var reader = Scanner(System.`in`)

fun addElement(list: ArrayList<Int>, cat: Int){
    when(cat){
        0 -> {
            print("Enter the element: ")
            list.add(reader.nextInt())
        }
        1 -> {
            print("Enter the position of the element then the value of the element: ")
            list.add(reader.nextInt()-1, reader.nextInt())
        }
    }
}

fun removeElement(list: ArrayList<Int>, cat: Int){
    when(cat){
        0 -> { //Remove a given element
            print("Enter the element to be removed: ")
            list.remove(reader.nextInt())
        }
        1 -> { //Remove an element at a given position
            print("Enter the position of element to be removed: ")
            list.removeAt(reader.nextInt() - 1)
        }
    }
}

fun main(args: Array<String>){
    var list = ArrayList<Int>()
    println("ArrayList menu:\n1. Add element\n2. Add element at given position\n3. Remove given element\n4. Remove element at position\n5. Clear all elements\n6. Display elements\n7. Exit")
    loop@ while(true){      //Remember this is a Labelled while loop
        print("Enter your choice: ")
        val ch = reader.nextInt()
        when(ch){
            1 -> addElement(list, 0)
            2 -> addElement(list, 1)
            3 -> removeElement(list, 0)
            4 -> removeElement(list, 1)
            5 -> list.clear()
            6 -> println(list)
            else -> break@loop
        }
    }
}
