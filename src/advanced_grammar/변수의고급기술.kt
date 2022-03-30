package advanced_grammar

// 상수는 컴파일 시점에 결정되어 절대 바꿀 수 없는 값
// (무조건 val 앞에 const 를 기술한다.)
// 상수로 선언될 수 있는 값은 기본자료형만 가능하다 (String 포함) 런 타임에 생성될 수 있는 일반적인 다른 클래스의 객체들은 담을 수 없다.
// 상수는 클래스의 속성이나 지역변수로 사용이 불가능하고 클래스안에서 사용하려면 companion object 를 사용하여서 사용해야한다. -> 객체의 생성 여부와 상관없이 클래스와 관계된 고정적인 값으로만 사용하게 된다.
// 상수의 이름을 만들 때는 의례적으로 대문자와 언더바(_)만을 사용해서 만든다.

//fun main() {
//    val foodCourt = FoodCourt();
//
//    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
//    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
//    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
//}
//
//class FoodCourt{
//
//    fun searchPrice(foodName: String) {
//        var price = when(foodName) {
//            FOOD_CREAM_PASTA -> 13000
//            FOOD_STEAK -> 25000
//            FOOD_PIZZA -> 15000
//            else -> 0
//        }
//        println("${foodName}의 가격은 ${price} 입니다.")
//    }
//
//    companion object{
//        const val FOOD_CREAM_PASTA = "크림파스타"
//        const val FOOD_STEAK = "스테이크"
//        const val FOOD_PIZZA = "피자"
//    }
//
//}

// 늦은 초기화 (lateinit var : Int) lateinit 키워드를 사용
// 경우에 따라서 변수에 객체를 할당하는 것을 선언과 동시에 할 수 없을 때 사용한다
// lateinit var 변수의 제한 사항으로는 초기값 할당 전까지 변수를 사용할 수 없다 (에러 발생)
// 그리고 기본 자료형에는 사용할 수 없다
// 또한 lateinit 변수에 "초기화"를 하였는지 여부를 확인할 때는 ::a.isInitalized 를 사용한다 변수앞에 ::를 붙이고 .isInitalized 사용 (오류를 막을 수 있다)

//fun main() {
//
//    val a = LateInitSample()
//    println(a.getLateInitText())
//
//    a.text = "새로 할당한 값"
//    println(a.getLateInitText())
//
//}
//
//class LateInitSample {
//    lateinit var text : String
//
//    fun getLateInitText() : String {
//        if(::text.isInitialized) {
//            return text
//        } else {
//            return "기본 값"
//        }
//
//    }
//}

// lazy delegate properties(자연 대리자 속성) : 변수를 사용하는 시점까지 초기화를 자동으로 늦춰준다
// val a : Int by lazy {7}
// a 라는 변수를 사용하는 시점에 초기화를 진행 해준다. (코드의 실행 시간을 최적화 할 수 있는 코드이다.)
// 람다함수로 초기화가 진행되므로 여러줄의 코드를 작성할 수 있으며 맨 마지막 구문의 결고가 리턴되어 값으로 할당되어 진다.

fun main() {
    val number : Int by lazy {
        println("초기화를 합니다.")
        7
    }

    println("코드를 시작합니다.")
    println(number)
    println(number) // 이미 초기화를 했기 때문에 다시 초기화 구문을 실행하지 않음을 알 수 있다.

}