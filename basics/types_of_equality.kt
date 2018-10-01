/* Link: https://www.baeldung.com/kotlin-equality-operators */

fun main(args: Array<String>) {
    var a = Integer(5)
    var b = Integer(5)    
    
    //Structural equality test
    if(a==b) println("a is structurally equal to b\n")
    else println("a is NOT structurally equal to b\n")
    
    //Referential equality test
    if(a===b) println("a is referentially equal to b\n")
    else println("a is NOT referentially equal to b\n")
}
