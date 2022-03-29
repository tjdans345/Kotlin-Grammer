package basic_grammar
fun main() {
    val a = Rabbit()

    a.eat()
    a.sniff()
}

// abstract 는 미완성 클래스이기 때문에 단독으로 인스턴스를 만들 수 없다
abstract class Animal3 {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal3() {
    override fun eat() {
        println("당근을 냠냠 합니다.")
    }
}

