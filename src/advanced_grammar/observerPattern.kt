package advanced_grammar


// 옵저버 패턴 : 이벤트가 발생할 때 마다 "즉각적으로 처리할 수 있도록" 만드는 프로그램 패턴
// 이벤트가 일어나는 것을 감시하는 감시자를 만드는 것 (키 입력, 터치, 데이터 수신 등)
// 시스템 또는 루틴에 의해서 발생하는 것을 이벤트라고 부른다


// 이벤트 수신 class A : 인터페이스 (observer, 코틀린에서는 listener) 이벤트를 넘겨주는 행위-> 콜백 : 이벤트의 발생 및 전달 class B


// 옵저버 패턴 구현
fun main() {
    EventPrinter().start()
}

// 이벤트가 발생할 때 마다 숫자반환
interface EventListener {
    fun onEvent(count : Int)
}

// 이벤트 발생 시키는 클래스
class Counter5(var listener : EventListener) {
    fun count() {
        for(i in 1..100) {
            if (i % 5 == 0) listener.onEvent(i)
        }
    }
}

// 이벤트 수신 클래스
class EventPrinter : EventListener {

    override fun onEvent(count: Int) {
        println("${count}");
    }


    fun start() {
        println(" this : " + this)
        val counter = Counter5(this)
        counter.count()
    }

}