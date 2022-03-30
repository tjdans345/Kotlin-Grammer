package advanced_grammar

// List : 데이터를 모아 관리하는 Collection class 를 상속받는 서브 클래스중에서 가장 단순한 형태
// 리스트에는 두 가지가 있다.
// List<out T> : mutableList<T> 두 클래스의 차이는
// List<out T> : 생성시에 넣은 객체를 대체, 추가, 삭제 할 수 없다.
// mutableList<T> : 생성시에 넣은 객체를 대체, 추가, 삭제 가능하다.
// 상황에 따라서 사용하면 된다.

// 리스트를 만들때에는 전용함수
// listOf(1,2,3) / mutableListOf("A","b","c") 를 사용하고 소괄호안에 넣을 데이터를 적는다.

// mutableList 에는
// 요소의 추가 : add(데이터) , add(인덱스, 데이터)
// 요소의 삭제 : remove(데이터), removeAt(인덱스)
// 무작위 섞기 : shuffle(), 정렬 : sort() 등의 함수도 사용 가능하다
// list[인덱스] = 데이터 / 특정 위치의 요소의 값을 바꿀 수 있다.

fun main() {

    val a = listOf<String>("사과", "딸기", "배")
    println(a[1])

    for (fruit in a) {
        print(fruit)
    }

    println()

    val b = mutableListOf(6,3,1)
    println(b)
    b.add(4)
    println(b)
    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)
    b.shuffle()
    println(b)

    b.sort()
    println(b)






}