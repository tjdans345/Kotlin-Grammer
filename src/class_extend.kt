package test
fun main() {
    var a = Animal("별이", 5 , "개");
    var b = Dog("별이",5, "male")
    var c = Cat("나비",3)
    a.introduce()
    b.introduce()
    c.introduce()
    b.gender()
    b.bark()
    c.bark()
}

// 상속을 받으려면 open 을 사용해야한다
open class Animal(var name:String, var age: Int, var type: String) {


    fun introduce() {
        println("저는 $type $name 이고 $age 살 입니다.")
    }
}

// 서브 클래스는 슈퍼 클래스(부모)에 존재하는 속성과 "같은 이름"의 속성을 가질 수 없다!
// 서브 클래스를 생성할 때 반드시! 슈퍼 클래스의 생성자까지 호출되어야 한다.

// var, val 등을 붙이면 값을 받으면 속성으로 받는다고 선언되는 것!!!!!
class Dog(name: String, age: Int, val gender : String) : Animal(name, age, "개") {

    fun gender() {
        println("$gender 입니다!")
    }

    fun bark() {
        println("멍멍")
    }

}

class Cat(name:String, age: Int) : Animal(name, age, "고양이") {
    fun bark() {
        println("냐옹")
    }
}