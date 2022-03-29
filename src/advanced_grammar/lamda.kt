package advanced_grammar

// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a: Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}

val nameAge : (String, Int) -> (String) = {name : String, age : Int ->
    "my name is ${name} i'm ${age}"
}

val nameAge2  = {name : String, age : Int ->
    "my name is ${name} i'm ${age}"
}

fun main() {
    println(nameAge("meteor", 29))
    println(nameAge2("changmo", 29))

    val a = "meteor said"
    val b = "chin said"
    println(a.pizzaIsGreat(30))
    println(b.pizzaIsGreat(30))

    println(extendString("test",26))
    println(extendString2("???", 100))

}

// 확장 함수 -> 있는 클래스에 몇가지를 추가하는 것
val pizzaIsGreat : String.(Int) -> String = {
    this + " Pizza is the best! ${it}"
}

fun extendString(name: String, age : Int) : String {

    val introduceMySelf : String.(Int) -> String =  {"I am ${this} and ${it} years old"}
    return name.introduceMySelf(age);
}

fun extendString2(name: String, age : Int) : String {
    return "I am ${name} and ${age} years old"
}
