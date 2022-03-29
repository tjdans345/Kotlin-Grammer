fun main() {

}

// 5. Array and List

// Array 는 사이즈가 정해져있다.

// ImmutableList (수정이 불가능) vs MutableList (수정이 가능)
// listOf                        arrayListOf
fun array() {
    val array : Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    val array2 : Array<String> = arrayOf("d")
    val list2 = listOf(1,2,"hi", 3L, 4f)

    // 기본적으로 array 의 값은 변경이 가능하다.
    array[0] = 0;

    // list 같은 경우
    // ImmutableList 는 값을 변경 못하는 읽기 전용이다.
    var result : Int = list.get(0);

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList.add(30)

}