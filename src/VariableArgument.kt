fun main(){
printAuthorOfBook("Rule of 5 Steps","Gogging","Meg","Dr. Suess")
}

/**
 *If you want to pass multiple value in one argument, then
 * we can use keyword: vararg
 * vararg: it return array of parameter and it should be used as last argument.
 */
fun printAuthorOfBook(bookTitle:String, vararg authors:String){
    println("Auther of $bookTitle are:")
    authors.forEach { println(it) }
}