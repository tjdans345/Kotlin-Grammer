package advanced_grammar

// 제네릭이란 ? 함수나 클래스를 선언할 때 고정적인 자료형 대신 실제 자료형으로 대체되는 타입 파라미터를 받아 사용하는 방법
// 두 클래스의 인스턴스를 공용으로 사용하는 함수나 클래스에 파라미터로 전달할 때 사용!
// 캐스팅을 이용할 수 있지만 , 캐스팅 연산을 거치는 것은 프로그램의 성능을 저하 시킬 수 있다.
// 제네릭을 사용하면 캐스팅 연산없이 자료형을 그대로 사용할 수 있다.
// 타입 파라미터의 이름은 클래사 이름과 규칙이 같다 , 일반적으로 "Type"의 이니셜인 T 를 사용하는 것이 관례이다!

// 제네릭을 특정한 수퍼 클래스를 상속받은 클래스 타입으로만! 제한 하려면
// <T : Super Class 명> <<< 타입 파라미터 이렇게 명시를 해주면 된다
// 함수나 클래스에서 자료형을 넘겨주면 자동으로 제네릭 타입을 추론해준다

fun main() {

    UsingGeneric(A()).doShouting() // 생성자 파라미터로 A() 를 넘겨줬으므로 타입 추론이 가능하다
    UsingGeneric(B3()).doShouting() // 생성자 파라미터로 B() 를 넘겨줬으므로 타입 추론이 가능하다
    UsingGeneric(C3()).doShouting() // 생성자 파라미터로 C() 를 넘겨줬으므로 타입 추론이 가능하다

    doShouting(B3())
}

// 제네릭 함수로 사용해보기
// 함수 역시 제네릭의 타입을 자동으로 추론한다
fun <T : A> doShouting(t: T) {
    t.shout()
}
open class A {
    open fun shout() {
        println("A 가 소리친다.")
    }
}


class B3 : A() {
    override fun shout() {
        println("B 가 소리친다.")
    }
}

class C3 : A() {
    override fun shout() {
        println("C 가 소리친다. ")
    }
}

class UsingGeneric<T : A> (val t: T) {
    fun doShouting() {
        t.shout()
    }
}