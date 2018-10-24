/* This class has some data in ().
The () in the declaration of a class is called the Primary Constructor
It is used to set properties while creating the class rather than assign them later on
Unlike in a simple class, the properties in () need not be initialized, but their type must be mentioned */

class Student(val USN: String, val name: String, var age: Byte){
}

fun main(args: Array<String>){
    println("Enter the student's USN, Name and Age: ")
    var ob = Student(readLine()!!, readLine()!!, readLine()!!.toByte())

    println("Student details:\nUSN: ${ob.USN}\nName: ${ob.name}\nAge: ${ob.age}")
}
