package advanced_grammar

// 다양한 람다 함수의 특별한 케이스
// 1. 람다함수도 여러 구문의 사용 가능 (여러 줄 표현 가능)
val c : (String) -> Unit = {s->
    println(s)
    println(s + s)
    println(s + s + s)

    // 람다 함수에서 여러 줄 표현시에는 마지막 구문이 return 값이 된다.
    s + s
}

// 2. 파라미터가 없는 람다함수는 실행할 구문들만 나열하면 된다.
val d : () -> Int = {
    println("파라미터 없다능")
    10
}

// 3. 람다함수에서 파라미터가 하나라면 it 을 사용할 수 있다.
val e : (String) -> Unit = { println("$it 단 하나의 파라미터이기 때문에 it을 사용이 가능합니다 ")}