
fun main() {
    var t = Tiger()
    t.eat()
}

open class Animal2 {
    // override 를 하게끔 open 키워드를 사용
   open fun eat() {
        println("음식을 먹습니다.");
    }



}

class Tiger : Animal2() {

    // override 키워드를 사용하여서 슈퍼클래스의 기능을 재정의 가능하다.
    override fun eat() {
        // super 를 이용하여 슈퍼클래스의 기능도 사용할 수 있다.
        super.eat()
        println("고기를 먹습니다.")
    }

}