package advanced_grammar

// 스코프 함수란 ? 인스턴스의 속성이나 함수를 스코프 함수내에서 좀 더 깔끔하게 사용 가능하게 해주는 것
// 스코프 함수의 종류
// apply 인스턴스를 생성한 후 변수에 담기전에 초기화 과정을 수행할 때 많이 사용한다.
// run
// with
// also
// let

fun main() {
    // apply 를 이용하면 인스턴스를 생성하자말자 생성된 인스턴스의 참조연산자를 사용 가능 (즉 참조 연산자 없이 사용 가능하다!)
    // apply 는 인스턴스 자신을 다시 반환한다. 생성되자마자 조작된(초기화 과정) 인스턴스를 변수에 바로 할당 가능
    // main 함수와 별도의 스코프에서 인스턴스의 변수와 함수를 조작하므로 코드가 깔끔해지는 장점이 있다.
    var a = Book("메테오의 정복 자바스크립트", 10000).apply {
        name = "초특가 $name";
        discount()
    }
    println(a.name)
    println(a.price)

    // run
    // run 은 apply 처럼 run 스코프안에서 참조연산자를 사용하지 않고 바로 사용할 수 있다는 점은 같지만
    // 일반 람다 함수처럼 인스턴스 대신 마지막 구문의 결과 값을 반환한다.
    // apply 는 핸들링 한 인스턴스(객체) 반환 / run 은 마지막 구문의 결과 "값" 반환
    var d = Book("메테오의 백점만점 다트", 37500).run {
        discount()
        price
    }
    println(d)

    // with 는 run 과 비슷하지만
    // run 은 참조연산자 없이 바로 인스턴스 생성시에 사용할 수 있지만
    // with 는 인스턴스를 파라미터로 받는다

    var e = Book("메테오의 재밌는 코틀린", 43000);
    var afterPrice: Int = with(e) {
        discount()
        price
    }

    println(afterPrice)

    // also / let
    // 처리가 끝나면 인스턴스를 반환 : apply / also
    // 처리가 끝나면 최종값을 반환 : run / let
    // also 와 let 이 가지는 차이점은 it 을 사용한다는 것이다. -> 상위 스코프에서 사용하는 변수명이 공통으로 쓰이고 있을 때 사용한다
    // apply , run 은 인스턴스내의 속성보다 속해있는 스코프의 변수를 우선시 해서 사용하기 때문이다.
    // 이럴 대 apply 를 대체하는 also 를 사용하거나 run 을 대체하는 let 을 사용하면 된다.
    val price = 7000;

    val k = Book("메테오의 가즈아 리액트", 32000).let {
        // it 을 사용하여 해당 인스턴스의 속성에 정상적으로 접근 가능하다
        println("${it.price}")
        it.price
    }
    k.apply { println("$price") }

}
class Book(var name : String, var price : Int) {

    fun discount() {
        this.price -= 2000
    }

}