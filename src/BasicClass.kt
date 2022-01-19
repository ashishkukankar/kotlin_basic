fun main(){
    val user = User()
    user.firstName = "John"
    user.lastName  = "Felkar"
    user.printFullName()
    user.changeFirstName("Doe")
    user.printFullName()


    val friend = User()
    friend.firstName ="Jan"
    friend.lastName = "Doe"
    friend.printFullName()

}

