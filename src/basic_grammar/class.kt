// class
// 코틀린에서는 file 이름과 class 이름 일치하지 않아도 되고, 한 파일안에 여러개의 class 정의 가능
// 클래스는 속성과 함수로 이루어져 있다.

// constructor 생략 가능하다.
// 상속을 받으려면 open 키워드를 사용해야한다!
open class Human constructor(val name: String = "default value") {

    // 생성자의 코드블록을 만들고 싶으면 init 을 사용하면 된다.
    // 제일 먼저 실행이 되는 블록
    init {
        println("New Human has been born!!")
    }

    // 부 생성자 만들기 (오버로딩)
    constructor(name : String, age :Int) : this(name) {
            println("my name is ${name}, ${age} years old");
    }

    // property 와 method 가 들어올 수 있다
//    val name = name

    fun eatingCake() {
        println("This is so YUMMYY~~~~~")
    }

    // override 를 하려면 open 을 사용해줘야한다 !!!
    open fun singAsong() {
        print("lalala");
    }
}

// Human 클래스를 상속 받음
class Korean : Human() {

    override fun singAsong() {
        // 부모 클래스의 메서드를 사용 함
        super.singAsong()
        println("랄라라");
        println("my name is : ${name}")
    }

}

fun main() {
    // 자바와는 다르게 new 키워드 필요 없음!
    val human = Human("meteor!!!!!")
    val changmo = Human("구창모", 29);
    human.eatingCake();

    println("this human's name is ${human.name}")
    println("this ??? ${changmo.name}")

    val korean = Korean();
    korean.singAsong()
}

