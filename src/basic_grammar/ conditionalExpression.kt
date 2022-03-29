package basic_grammar

fun main() {

    checkNumber(3);

}

// 4. 조건식
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

// 조건식2
// 타입추론으로 함수의 리턴 타입을 생략 했다.
// 코틀린에는 삼항 연산자가 없기 때문에 if 문을 사용해서 이런식으로 나타낼 수 있다
fun maxBy2(a : Int, b : Int) = if(a>b) a else b; // 여기서 쓰인 if 문은 statement

fun checkNumber(score : Int) {
    // when 은 다른 언어에서 switch 문이랑 비슷하다
    // 어떤 것을 실행하도록 만들어 놓은 것 (statement) 이다
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2 -> println("this is 2")
        else -> println("i don't know")
    }

    // when 사용방법 2번 째
    var b = when(score) { // 어떤 것을 실행하고 값을 리턴해준다 (Expression)
        1 -> 1
        2 -> 2
        3 -> 3
        // 이렇게 사용할 경우에는 else 를 사용해야 한다
        else -> 0
    }
    println("b : $b")

    // 사이값을 조건으로 넣고 싶다면.
    when (score) {
        in 90..100 -> println("A")
        in 80..90 -> println("B")
        in 70..80 -> println("C")
        else -> println("good")
    }
}

// Expression vs Statement
// Expression 이란 ? 어떠한 행위로 값을 만드는 것이다
// 코틀린의 모든 함수는 Expression 이다.