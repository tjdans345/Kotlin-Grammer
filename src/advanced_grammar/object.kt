package advanced_grammar

// 생성자 없이 객체를 직접 만들어 내는 object
// class 는 내부의 속성들을 사용하려면 인스턴스를 만들어야 한다.
// 여러개의 인스턴스 필요 없이 단 하나의 객체만으로 공통적인 속성과 함수를 사용해야 한다면 object 를 사용하면 된다. (Singleton Pattern)
// Singleton Pattern 이란? 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴!
fun main() {

    // object 는 별도의 인스턴스를 생성하지않기 때문에
    // object 이름에 직접 참조연산자를 붙여 사용한다!
    // object 객체는 최초 사용시 자동으로 생성되며 이후에는 코드 전체에서 "공용으로 사용" 될 수 있다 -> 프로그램이 종료되기 전까지 공통적으로 사용할 내용들을 묶어 만들 때 좋다.
    println(Counter.count);
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.clear()
    println(Counter.count)

    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕 ")
    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${FoodPoll.total}")
    FoodPoll.commonClear()
    println("총계 : ${FoodPoll.total}")

}

// object 는 인스턴스를 생성하지 않고 그 자체가 객체이기 때문에 생성자를 사용하지 않는다.
object Counter {
    var count = 0
    fun countUp() {
        count++
    }
    fun clear() {
        count = 0
    }

}

// 기존 class 안에도 object 를 만들 수 있다 -> Companion Object
// 인스턴스 기능은 그대로 사용하면서 인스턴스 간의 공용으로 사용할 속성과 함수를 별도로 만드는 기능
// 기존의 다른 언어의 Static 멤버와 비슷하다
// Static 멤버 : 클래스 내부에서 별도의 영역에 고정적으로 존재하여 인스턴스를 생성하지 않아도 공용으로 사용가능한 속성이나 함수
// 짜장, 짬뽕 선호도 설문 조사 (개별 투표수, 전체 투표수)
class FoodPoll (val name: String) {
    companion object {
        var total : Int = 0

        fun commonClear() {
            total = 0;
        }
    }

    // 개별 투표수
    var count = 0

    fun vote() {
        total++
        count++
    }
}




