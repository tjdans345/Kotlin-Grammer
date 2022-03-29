package basic_grammar
fun main() {

    var a =Person("박보영", 1990);
    var b =Person("구창모", 1994);

    var c = Person("유연정");
    a.introduce()
    b.introduce()
    c.introduce()
}

// 인스턴스 : 클래스를 사용해서 만들어내는 서로 다른 객체
// 생성자 : 새로운 인스턴스를 만들기 위해 호출하는 특수한 함수
class Person(var name: String, val birthYear : Int) {

    // 새로운 인스턴스가 생성될 때 실행된다.
    init {
        println("생성되어짐")
    }

    // 보조 생성자
    constructor(name: String) : this(name, 1997) {
        println(" 보조 생성자가 생성됨")
    }



    fun introduce() {
        println("안녕하세요 $birthYear 년생 $name 입니다.")
    }

}