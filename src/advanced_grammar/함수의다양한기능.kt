package advanced_grammar

// 함수의 다양한기능
// 오버로딩 가능


fun main() {

    read(5)
    read("감사합니다")
    deliveryItem("짬뽕")
    deliveryItem("책",3)
    deliveryItem("노트북", 30, "학교")

    // named argument : 지정된 파라미터에 값을 바인딩
    deliveryItem("선물", destination = "친구집")
    println(6 multi 4)
    println(6.multi(4))
    println( 6.multi2(5))
}

fun read(x :Int) {
    println("숫자 $x 입니다.")
}

fun read(x :String) {
    println("$x")
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다")
}

// variable number of arguments (vararg) -> 자바스크립트의 나머지 매개변수랑 비슷
// vararg 키워드가 붙은 파라미터는 마치 배열과도 같다.
// vararg 는 개수가 지정되지 않은 패러미터라는 특징이 있다. -> 다른 파라미터와 같이 쓸 때에는 반드시 맨 마지막에 위치해야한다.
fun sum(vararg numbers: Int) {
    var sum = 0

    // 배열과도 같기 때문에 for 문을 사용가능
    for (n in numbers) {
        sum += n
    }

    println(sum)


}

// infix 함수
// 연산자 처럼 사용할 수 있는 함수
infix fun Int.multi(x: Int): Int = this * x

val multi2 : Int.(Int) -> Int = {this * it}
