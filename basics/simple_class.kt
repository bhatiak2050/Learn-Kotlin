class Student{
    var USN: String = ""
    var name: String =""
    var age: Byte = 0
}

fun main(args: Array<String>){
    var ob = Student()
    println("Enter the student's USN no, name and age: ")
    ob.USN = readLine()!!.toString()
    ob.name = readLine()!!.toString()
    ob.age = readLine()!!.toByte()

    println("Student details:\nUSN: ${ob.USN}\nName: ${ob.name}\nAge: ${ob.age}")
}
//Right now the class is acting like a structure
