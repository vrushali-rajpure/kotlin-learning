package com.test

sealed class Option{
    class None : Option()
    class Some : Option()
}

fun main(args : Array<String>) {

    val value = Option.Some()

//    when(value) {
//        is Option.Some -> print("Some")
//        is Option.None -> print("None")
//    }


    test(value)

    val m = Money(10);
    m.amount  = 10
    println(m)

}

fun test( value : Option = Option.None()){
    when(value) {
        is Option.Some -> print("Some")
        is Option.None -> print("None")
    }

//    val i = 10;
//    when(i){
//        10 -> println(10)
//    }
}

data class Money(var amount : Int)
