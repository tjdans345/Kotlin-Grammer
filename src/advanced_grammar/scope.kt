package advanced_grammar




// 스코프와 접근 제한자
// scope 란? 범위라는 의미이다, 언어 차원에서 변수나 함수 클래스같은 멤버들을 서로 공유하여 사용할 수 있는 범위를 지정해둔 단위
// 패키지, 클래스, 함수 스코프가 존재한다.
// 하위 스코프에서는 같은 멤버의 이름을 만들어 사용 가능하다
val a = "패키지 스코프";

class B {
    val a = "클래스 스코프";
    fun print() {
        println(a);
    }
}

// 하위 스코프에서는 상위 스코프를 재정의 하여 사용 가능하다.
fun main() {
    val a = "함수 스코프"
    println(a)
    B().print()
}