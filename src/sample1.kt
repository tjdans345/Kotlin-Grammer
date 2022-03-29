
fun main() {
    helloWorld()

    println(add(5, 7))

    hi()
}

// 1. 함수

// 코틀린은 뭘 리턴하든 상관없이 fun 을 사용한다.
// Unit -> void 처럼 아무 리턴이 없다는 의미
fun helloWorld() : Unit {
    println("Hello World")
}

// 리턴 타입이 있는 경우
// 변수명 뒤에 변수 타입을 작성한다.
// 리턴 할 때는 타입 생략 불가능 -> : return type
fun add(a : Int, b : Int) : Int {
    return a+b
}

// 2. val Vs var
// val = value 바뀌지 않는 값
// var = variable 바뀔 수 있는 값(변수)
fun hi() {
    // 변하지 않는 값
    val a : Int = 20;

    // 변할 수 있는 값(변수)
    var b : Int = 9;
    val e : String

    println(" a: $a , b : $b")
    // 코틀린은 타입을 적지 않아도 자동으로 추론해준다.
    val c = 100
    var d =20

    var name = "joyce"









}