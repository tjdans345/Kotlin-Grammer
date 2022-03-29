fun main() {

    nullCheck();
    ignoreNulls("test")

}

// Nullable
// ? 를 붙이면 null 을 대입 가능
fun nullCheck() {
    var nullName : String? = null;

    // ? 를 사용하면 값이 null 일 때 null 을 반환해준다.
    var nullNameInUpperCase = nullName?.toUpperCase() // null 을 반환하기 때문에 null 타입을 추론 가능하다

    // 엘비스 연산자
    // ?: 디폴트 값을 주고 싶을때
    val name = "Meteor";
    val lastName : String? = null

    // lastName 에 값이 null 이 들오오면 ?: 우측에 있는 값으로 대체 해주겠다는 의미
    val fullName = name + (lastName?: " No lastName")

    println(fullName)

}

// !! <<< 뭘까?
// 해당 값은 null 이 아니라고 알려주는 것!
fun ignoreNulls(str : String?) {
    val mNotNull : String = str!! // 절대 null 값이 들어오지 않는다고 명시하는 것 / 확실하게 null 이 아닌 경우를 제외하고는 지양! 하자

    println(mNotNull)

    val email : String? = "meteor@gmail.com"
    // email 이 null 이 아니면 let{} 을 실행하라
    email?.let {
        println("my email is $email")
        println("my email is $it")
    }


}
