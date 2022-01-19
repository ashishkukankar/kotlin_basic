
    fun main(){
        //we can use name parameter to understand which value is for which values
        printUserInfo(
                firstName = "ashish",
                lastName = "kukankar",
                age =  32,
                isSunburned =  true,
                likeMovies = true,
                lovesPopCorn = true
        )

        //calling default argument function
        printAnotherInfo(
                firstName = "shivani",
                lastName = "kukankar",
                age = 25
        )
        printAnotherInfo()
        printAnotherInfo(
                firstName = "shivani",
                lastName = "kukankar",
                age = 25
        )
        printAnotherInfo(
                firstName = "shivani",
                lastName = "kukankar",
                age = 25
        )
    }


    fun printUserInfo(firstName:String,lastName:String,age:Int, isSunburned:Boolean,likeMovies:Boolean,lovesPopCorn: Boolean){
        println("$firstName $lastName having age $age  $isSunburned $likeMovies $lovesPopCorn")
    }


    /**
     * this method is used to understand default function argument.
     * Default function argument: assign a default value to parameter and change as per need from
     * calling
     */

    fun printAnotherInfo(firstName: String ="",lastName: String="",age: Int=0,isSunburned: Boolean=false,likeMovies: Boolean=true,lovesPopCorn: Boolean=true){
        println("firstName: $firstName, LastName: $lastName, age: $age, IsSunBurned: $isSunburned, LikedMovie: $likeMovies, LovesPopCorn: $lovesPopCorn")
    }