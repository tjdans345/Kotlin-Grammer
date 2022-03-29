
fun main() {
    forAndWhile();
}

// 6. 반복문 For / While
// for 문
fun forAndWhile() {

    val students : List<String> = arrayListOf<String>("호미들" ,"창모", "언에듀키드", "슈퍼비", "릴러말즈");

    for (name : String in students) {
        println(name);
    }

    for ((index:Int, name:String ) in students.withIndex()) {
        println("${index + 1} 번째 학생은 $name 입니다.")
    }

    var sum : Int = 0;
    for (i:Int in 1..10 step 2) {
        sum += i;
    }
    println(sum)

    for (i:Int in 10 downTo 1) { // 10 에서 1 까지 다운
        println(i);
    }

    for (i:Int in 1..100) { // 1부터 100까지 (100 포함)
        println(i);
    }

    for (i:Int in 1 until 100) { // 1부터 99까지 (100 미포함)
        println(i);
    }

    // while
    var index = 0
    while (index <10) {
        println(" current index : $index");
        index++;
    }
}