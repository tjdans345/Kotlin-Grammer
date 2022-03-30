package advanced_grammar

// 중첩 클래스(Nested Class) : 하나의 클래스가 다른 클래스의 기능과 강하게 연관되어 있다는 것을 전달하기 위해 만들어진 형식
// 코틀린에서는 기본적으로 클래스안에 클래스를 하나 더 넣을 수 있는 중첩 클래스를 제공한다
// 중첩 클래스는 형태만 내부에 존재할 뿐 실질적으로 서로 내용을 직접 공유 할 수 없는 별개의 클래스이다.

// 내부 클래스도 있다 (inner Class)
// 내부 클래스는 혼자서 객체를 만들 수는 없고 외부 클래스의 객가 있어야만 생성과 사용이 가능한 클래스이다.
// 내부 클래스는 외부 클래스 안에서 사용되는 클래스이므로 외부 클래스의 속성과 함수의 사용이 가능하다!
fun main() {
    Outer.Nested().introduce()

   val outer = Outer()
   val inner = outer.Inner()

   inner.introduceInner()
   inner.introduceOuter()
    outer.text = "Changed Outer Class"
    inner.introduceOuter()
    inner.text = "Changed Inner Class"
    inner.introduceInner()



}
class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"
        fun introduceInner() {
            println(text)
        }

        // Outer 클래스와 Inner 클래스에
        // 같은 이름의 속성이나 함수가 있다면
        // this@OuterClass 이름으로 참조하시면 됩니다
        fun introduceOuter() {
            println(this@Outer.text)
        }
    }

}