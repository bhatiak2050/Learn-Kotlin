fun main(args: Array<String>){
    for (i in 1..3){
        for(j in 1..3){
            if(j==2 || i==2) continue
            println ("$i, $j")
        }
        println("")
    }
}
