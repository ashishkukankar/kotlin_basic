/**
 * Creating an User class
 * Class: It is a template
 */
class  User{
    var firstName = ""
    var lastName = ""

    /**
     * @printFullName: it will print fullName in console
     */
    fun printFullName(){
        println("My name is $firstName $lastName")
    }


    /**
     * @param newFirstName : It takes new firstName and update firstName
     */
    fun changeFirstName(newFirstName:String){
        firstName = newFirstName
    }
}