package advanced_grammar



// class 의 다형성
// 예를들어 음료수와 콜라가 있다고 하자
// 음료 클래스를 상속받은 콜라 클래스가 있다면
// 콜라의 객체안에는 상속받은 음료와 콜라가 있다
// 콜라 클래스는 음료 클래스에 담을 수 있다 -> 이 때 상위 클래스의 타입으로 담게 되면 상위 클래스의 속성만 사용이 가능하다. ( 콜라의 속성은 사용 불가능 )
// 이 때 콜라 인스턴스를 음료 자료형에 담는 행위를 상위 자료형인 수퍼클래스로 변환한다고하여 Up-Casting 이라고 부른다.
// Up-Casting 된 인스턴스를 다시 하위 자료형으로 변환 하는 것을 Down-Casting 이라고 한다.
// Down Casting 을 할때는 별도의 연산자가 필요하다 (as / is)
// as : 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자 -> 즉시 자료형을 변환해준다. 변환된 자료형을 반환 받기 때문에 변수에 할당도 가능
// is : 변수가 자료형에 호환되는지 먼저 체크한 후 캐스팅해주는 연산자이다 ( 조건문에서 사용함 )

fun main() {
    val a = Drink()
    a.drink()

    val b : Drink = Cola() // 상위 클래스 자료형에 담았기 때문에 Cola 가 가지고있는 속성(함수)를 사용하지 못한다
    b.drink()

    // is 는 조건문안에서만 잠시 다운 캐스팅 된다
    if(b is Cola) {
        b.washDishes()
    }
    val c = b as Cola;
    c.washDishes()
    b.washDishes() // as 캐스팅 연산자를 사용하는 순간 b 변수(참조연산자) 자체도 즉시 다운 캐스팅 된다

}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name}를 마십니다.")
    }
}

class Cola : Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다.")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다.")
    }


}