import com.test.Person

fun main(args : Array<String>){
    println("Hello IDea !!")

    val vrushali = Person("Vrushali");

    println("Name is ${vrushali.display()}")

//    vrushali.display()

    vrushali.displayWithLambda(::displayName)

}

fun displayName(name: String){
    println("inner $name")
}