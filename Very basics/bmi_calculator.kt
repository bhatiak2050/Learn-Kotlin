import java.util.Scanner
fun main(args: Array<String>)
{
   val reader = Scanner(System.`in`)
    
    var w = reader.nextFloat()
    var h = reader.nextFloat()
    
    var bmi = w/(h*h)
    
    var int = if(bmi < 18.9) "Underweight"
               else if(bmi >= 18.9 && bmi < 24.9) "Normal"
               else if(bmi >= 24.9 && bmi < 29.9)a "Overweight"
               else "Obese"
    println("Bmi: $bmi\nInterpretation: $int");
}
