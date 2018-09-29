//Kotlin 1.1

fun main(args: Array<String>) {
    var a: Int = 65
    var b: Byte   = a.toByte()
    var c: Short  = a.toShort()
    var d: Long   = a.toLong()
    var e: Float  = a.toFloat()
    var f: Double = a.toDouble()
    var g: Char   = a.toChar()
    
    var string = "14000605"
    var int = string.toLong()
    
    println("$b\n$c\n$d\n$e\n$f\n$g\n$int\n")
}
