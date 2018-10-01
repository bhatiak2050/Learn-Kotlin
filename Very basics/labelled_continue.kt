fun main(args: Array<String>){
    first@ for (i in 1..3){
        second@ for(j in 1..3){
            if(j==2 || i==2) continue@first
            println ("$i, $j")
        }
        println("")
    }
}
