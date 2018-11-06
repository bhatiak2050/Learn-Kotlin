class Student(var first: String, var last: String){
    var fullName: String

    init {          //This is the instantiator block. It executes when an object of the class is created.
        fullName = first + " " + last
    }
}

fun main(args: Array<String>){
    print("Enter the Student's first and last name: ")
    var (f, l) = readLine()!!.split(" ")
    var ob = Student(f, l)

    print("The student's name is ${ob.fullName}")
}
