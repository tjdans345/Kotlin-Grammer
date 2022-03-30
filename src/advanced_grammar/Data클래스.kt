package advanced_grammar

// Data Class : 데이터를 다루는 데에 최적화된 class 로
// "5가지 기능"을 내부적으로 자동으로 생성해준다! (자동 구현)
// 1. equals() : 내용의 동일성을 판단
// 2. hashcode() : 객체의 내용에서 고유한 코드를 생성
// 3. toString() : 포함된 속성을 보기쉽게 나타내어줌
// 4. copy() : 객체를 복사하여 똑같은 내용의 새 객체를 만들어 줌
// copy() 함수를 통해 새 객체를 생성할 때는 아무 파라미터가 없으면 똑같은 내용으로 생성해주고
// 생성자와 똑같은 형태의 파라미터를 줘서 해당 파라미터를 교체하여 생성도 가능하다
// 5. componentX() : 속성을 순서대로 반환
// component 함수는 사용자가 직접 호출하기 위한 함수가 아닌 배열이나 리스에 데이터 클래스의 객체가 담겨있을 때 이 내용을 자동으로 꺼내 쓸 수 있는 기능을 지원하기 위한 함수들!
fun main() {

    val a = General("보영", 21)

    println(a == General("보영", 21)) // a와 똑같이 만든 객체와 내용이 동일 한지 비교하여 출력
    println(a.hashCode())
    println(a)

    val b = Data("메테오",29)
    println(b == Data("메테오",29))
    println(b.hashCode())
    println(b)

    println()

    println(b.copy())
    println(b.copy("빅메테오"))
    println(b.copy(id = 620))

    val list = listOf(
        Data("보영", 212),
        Data("루다", 112),
        Data("아린", 312),
    )
    for ((name: String, id: Int) in list) {
        println("$name , $id")
    }


}

class General(val name: String, val id : Int)

data class Data(val name : String, val id : Int)