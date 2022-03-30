package advanced_grammar

// Enum Class : 열거형 타입의 클래스
// 특이한 형태의 데이터들이 들어있지만 enum class 의 객체를 생성하기 위한 선언이다.
// enum 클래스 안의 객체들은 관행적으로 상수를 나타낼 때 사용하는 대문자로 기술한다.
// 또한 enum 의 객체들은 고유한 속성을 가질 수 있다.
// enum 의 생성자를 만들어서 받도록 하면 객체를 선언할 때 속성도 설정이 가능하다.
// 또한 일반 클래스처럼 함수도 추가할 수 있다. 객체의 선언이 끝나는 위치에 세미콜론 ; 을 추가한 후 함수를 기술한다.

fun main() {
    println(plus(3,5))

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state)
    println(state.isSleeping())

    state = State.EAT
    println(state.message)



}

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다."),
    SLEEP("잠을 잡니다.");

    fun isSleeping() = this == State.SLEEP // enum 은 선언시에 만든 객체를 이름으로 참조하여 그대로 사용한다!

}

// 함수를 이렇게도 사용할 수 있네....... 와우!
fun plus(a:Int, b:Int) = a+b

fun plus2(a:Int, b:Int) : Int {
    return a+b
}
