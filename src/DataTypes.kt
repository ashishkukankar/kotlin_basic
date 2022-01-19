
/*
* This class is used to understand:
*  1) implicit and explicit data
*  2) Number Data Types
*  3) mention 1000, 10000, 100000 as constant in kotlin
*  4) var is object of class Number
* */

fun main(){
 // Implicit and explicit data types
    var name = "ashish"
    println(name::class)  //kotlin.String

    var age: Int =32
    println(age::class) // kotlin.Int

  //Number Data types
    val biteValue: Byte   =  8 //8-bit singed integer
    val shortValue: Short = 16 //16-bit singed integer
    val intValue:Int      = 32 //32-bit singed integer
    val longValue:Long    = 64 //64-bit singed integer

    //how to make 1000,10000,100000 etc as readable format
    val thousand: Long = 1_000 //1000
    println(thousand)
    val million:Long = 10_00_000//1000000
    println(million)

    //number type variable is object of Number class
    println(biteValue.toInt()::class) //class kotlin.Int

    //Character and String
    var c:Char = 'x';
    println("character value $c")

    var value:String = "hello world"
    println("Strinb value :${value.capitalize()}")

    var stringValue: String ="""
        Hello,
        this is ashish and
        I am using triple qoutes 
    """.trimIndent()

    println(stringValue)
}


