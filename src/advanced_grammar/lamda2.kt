package advanced_grammar

// lamda 함수
// 람다함수는 일반함수와 달리 고차 함수이기 때문에 별도의 연산자 없이 변수에 담을 수 있다.


fun main() {

    // 람다식 만들기
    // 일반 적인 변수의 자료형(타입)을 사용하듯 함수의 형식(타입)을 사용한다.
    // 고차함수 부분에서 사용했었던 즉 함수를 파라미터로 받을 때의 형식 처럼 먼저 만들어준다
    // (입력받을 파라미터 타입) -> (리턴할 값 타입)
    val c : (String) ->(Unit) = {str -> println("${str}함수에서 호출한 람다함수") }
    b(c);
    b2(c)

    // 람다함수 역시 변수에 할당 할때에는
    // 타입추론 기능을 사용하여 축약해서 기술할 수 있다.
    val c2 = {str: String -> println("${str}함수에서 호출한 람다함수2")}

}

fun b2 (function: (String) -> Unit) {
    function("b2")
}