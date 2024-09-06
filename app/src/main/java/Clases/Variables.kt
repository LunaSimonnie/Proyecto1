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
        val numeros= arrayOf(1,2,3,4,5,6,7,8,9)

        println(age)
    println("Welcome $name to your first kotlin project")
    println(add())
    println(product (x=10 , y=92))
    println(imprimirArray(names))

    }
fun add(): Int{ // hay que especificar lo que se va a retornar (Int)
    val x:Int = 5
    val y :Int = 10

    return x + y
}
fun product(x:Int, y:Int):Int {
   return x + y

}

fun imprimirArray(names:Array<String>){
    for(name in names) {
        println("Hello $name ")
    }
}
// funcion que de un array de 9 num me diga cual es par e impar
fun arrayParImpar(numeros:Array<Int>){
    for(numero in numeros){
        if(numero%2==0){
            println("$numero Es par ")
        }
        else{
            println("$numero Es impar ")
        }
    }
}

fun getDay(day:Int):String {
    var name=""

    when(day){
        1-> name="Monday"
        2-> name="Tuesday"
        3-> name="Wednesday"
        4-> name="Thursday"
        5-> name="Friday"
        6-> name="Saturday"
        7-> name="Sunday"
        else ->name ="Incorrect Value"
    }

    return name
}

class Person (val name: String, val age:Int){
    fun displayInformation(){
        println("Name: $name,Age : $age")
    }
}

//}