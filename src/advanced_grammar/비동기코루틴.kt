package advanced_grammar
// 코루틴 : 비동기 처리 지원
// 비동기로 여러개의 루틴을 동시에 처리
// 일반적으로 모든 구문을 "동기적"으로 실행한다.
// 비동기 처리를 사용하면 여러개의 루틴을 동시에 실행하여 결과를 낼 수 있다.

// 코루틴은 메인 루틴과 별도로 진행이 가능한 루틴으로 개발자가 실행과 종료를 마음대로 제어할 수 있는 단위이다.
// 코루틴 스코프 : 코루틴의 제어범위 및 실행범위를 지정하는 것
// GlobalScope : CoroutineScope
// GlobalScope : 프로그램의 어디서나 제어, 동작이 가능한 기본 범위
// CoroutineScope : 특정한 목적의 Dispatcher 를 지정하여 제어 및 동작이 가능한 범위

// CoroutineScope 를 만들 때 적용가능한 Dispatcher
// Dispatchers.Default 기본적인 백그라운드 동작
// Dispatchers.IO I/O 에 최적화 된 동작
// Dispatchers.Main 메인(UI) 스레드에서 동작

// launch 와 async 의 차이는 반환값이 있는지의 여부! 이다
// launch : 반환값이 없는 Job 객체 / async : 반환값이 있는 Deffered 객체 (마지막 구문의 실행 결과가 반환된다.)
// 둘 다 람다함수의 형태를 가지고 있다
fun main() {


}