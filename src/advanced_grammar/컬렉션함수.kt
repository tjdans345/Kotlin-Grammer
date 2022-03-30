package advanced_grammar

// 코틀린은 함수형 언어의 특징을 가지고 있다
// 컬렉션 함수를 사용해보자!
// foreach -> it 이라는 변수로 객체의 인덱스 값들을 꺼낼 수 있다
// filter 조건을 검증 후 조건에 맞는 값들만 담은 새 배열 객체 반환
// map 새로운 로직을 수행 후 새 배열 객체 반환
// any 하나라도 조건에 맞으면 true
// all 모두 조건에 맞으면 true
// none 하나도 저건에 맞지 않으면 true
// first 조건에 맞는 첫 번째 객체를 반환 -> find 로 대체가능
// last 조건에 맞는 마지막 객체를 반환 -> findLast 로 대체가능
// first / last 조건에 맞는 값 없으면 익센션 반환 가능성 있음

fun main() {

    val nameList = listOf("박수영", "김지수","김다현","신유나","김지우")

    nameList.forEach{ println(it + " ")}
    println()

    println(nameList.forEach{it.startsWith("김")})

    println(nameList.map{"이름 : ${it}"})

    println(nameList.any { it == "김지연" })
    println(nameList.all { it.length ==3 })
    println(nameList.none{ it.startsWith("이")})

    println(nameList.first { it.startsWith("김") })
    println(nameList.last { it.startsWith("김") })
    println(nameList.count{ it.contains("지") })


}