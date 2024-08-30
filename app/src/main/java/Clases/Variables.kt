package Clases

import android.health.connect.datatypes.WeightRecord
import kotlinx.coroutines.newSingleThreadContext

//class Variables{
    fun main(){
        //Variables numéricas
        val age: Int = 20
        val long_number: Long = 984398432222221211
        val temperature : Float= 27.123f
        val Weight : Double = 60.4

        //string
        val gender: Char = 'M'
        val name: String = "Ricardo Reyes"

        //Boolean
        var isGreater:Boolean = false

        //Array
        val names= arrayOf("Erick", "Silvia", "Hector", "Gabriela")

        println(age)
    println("Welcome $name to your first kotlin project")
    println(add())
    println(product (x=10 , y=92))
    }
fun add(): Int{ // hay que especificar lo que se va a retornar (Int)
    val x:Int = 5
    val y :Int = 10

    return x + y
}
fun product(x:Int, y:Int):Int {
   return x + y
}
//}