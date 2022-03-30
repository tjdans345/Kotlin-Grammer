package advanced_grammar

// null 체크하기
// ?.(null safe operator) : 참조연산자 앞에 붙여서 사용
// ?: (elvis operator) :
// !!. (non-null assertion operator) :
fun main() {

    val a: String? = null
    // ?. : 참조 연산자를 실행하기전에 null 체크를 하고 null 이면 뒤에 구문 실행 x
    println(a?.uppercase())
    // ?: : 객체가 null 이 아니라면 그대로 사용 null 이면 연산자 우측에 있는 객체로 대체 됨
    println(a?:"default".uppercase())
    // !!. : 컴파일시 null 체크를 하지 않음 / 런타임시에 널포인트 익셉션 발생 시킴 (의도적으로 방치하는 연산자)
//    println(a!!.uppercase())

    // null safety 연산자는 스코프 함수랑 같이 사용하면 훨씬 편리하다
    a?.run {
        println(uppercase())
        println(lowercase())
    }

    // 동일성 체크
    // 내용의 동일성 / 객체의 동일성
    // 내용의 동일성 판단하는 연산자 : a == b
    // 객체의 동일성 판단하는 연산자 : a === b

    var a5 = Product("콜라", 1000)
    var b5 = Product("콜라", 1000)
    var b6 = Product2("콜라", 1000)
    var c5 = a5
    var d5 = Product("사이다", 1000)

    println("시작")
    println(a5 == b5) // 내용의 동일성
    println(a5 === b5) // 객체의 동일성

    println(a5 == c5) // 내용의 동일성 -> equals
    println(a5 === c5) // 객체의 동일성

    println(a5 == d5) // 내용의 동일성
    println(a5 === d5) // 객체의 동일성

//    println(b5.name == b6.name) // 내용의 동일성
//    println(b6.name == b5.name) // 내용의 동일성

}

class Product(val name: String, val price: Int) {

    // 내용의 동일성 검증
    override fun equals(other: Any?): Boolean {
        if (other is Product) { // 이게 객체가 같다는 말이 아니라 이 객체의 타입이냐고 묻는거잖아 !!!!!!!
            println("통과함 : ${other.name}")
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}

class Product2(val name: String, val price: Int) {

}