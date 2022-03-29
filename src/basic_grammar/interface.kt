
fun main() {
    val dog = Dog2()

    dog.eat()
    dog.run()
}

// 코틀린에서 인터페이스는 생성자를 가질 수 없다
// 구현부가 있으면 open 함수로 간주
// 구현부가 없으면 abstract 함수로 간주
// 그렇기 때문에 별도의 키워드가 없어도 서브 클래스에서 구현 및 재정의 가능
// 한번에 여러개의 인터페이스 상속 가능

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

class Dog2 : Runner, Eater {

    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("냠냠냠 먹습니다.");
    }

}