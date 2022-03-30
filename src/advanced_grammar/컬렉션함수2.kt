package advanced_grammar

// associateBy : 아이템에서 key 를 추출하여 Map 으로 변환하는 함수
// groupBy : key 가 같은 아이템 끼리 배열로 묶어 Map 으로 만드는 함수
// partition : 아이템에 조건을 걸어 true, false 에 따라 두 컬렉션으로 나누어줌 Pair(두 객체를 담을 수 있음) 라는 클래스 객체로 반환되어진다
// first, second 로 참조하여 사용 가능하다
// 또는 변수 이름을 2개 사용하여 받을 수 있다
// ex ) val(over2002, under2002) = collection.partition{it.birthYear > 2002}
// flatMap : 아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수
// getOrElse : 인덱스 위치에 아이템이 있으면 아이템을 반환하고 아닌 경우 지정한 기본값을 반환하는 함수
// zip : 컬렉션 두 개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어 줌



//fun main() {
//
//    data class Person(val name : String, val birthYear: Int)
//
//    val personList = listOf(
//        Person("유나",1992),
//        Person("조이",1996),
//        Person("츄",1999),
//        Person("유나",2003),
//    )
//
//    println(personList.associateBy {  it.birthYear })
//    println(personList.groupBy { it.name })
//
//    val (over98, under98) = personList.partition { it.birthYear > 1998 }
//    println(over98)
//    println(under98)
//}

fun main() {
    val numbers = listOf(-3, 7, 2 , -10, 1)

    println(numbers.flatMap { listOf(it * 10, it + 10) })
    println(numbers.getOrElse(1) {50})
    println(numbers.getOrElse(10) {50})

    val names = listOf("A","B","C","D")

    println(names zip numbers)
    println(numbers zip names)

}
