package advanced_grammar

// Collection 2
// Set / Map
// Set : List 와 달리 순서가 보장되지 않으며 중복이 허용되지 않는다.
// 따라서 Set 은 인덱스로 위치를 지정하여 객체를 참조할 수 없다.
// contains 로 객체가 Set 안에 존재하는지를 확인하는 식으로만 사용한다!
// Set 역시 Set<out T> 와 mutableSet<T> 가 존재한다.

// Map 은 객체를 넣을 때 그 객체를 찾을 수 있는 Key 를 쌍으로 넣어주는 컬렉션이다.
// key(객체를 찾기 위한 값) / value(key 와 연결된 객체) 로 이루어져 있다.
// 같은 Key 에 다른 객체를 넣으면 기존의 객체가 대체(수정) 된다. 주의해서 사용해야한다.
// Map 역시 추가 삭제가 가능한 Map<K, out V> 과 MutableMap<K, V> 가 있다
// put(key, value) : 추가 , remover(key) : 삭제
fun main() {
    val a = mutableSetOf("귤", "바나나", "키위")

    for (item in a) {
        println("${item}")
    }

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))

    val b = mutableMapOf("레드벨벳" to "음파음파",
                            "트와이스" to "FANCY",
    "ITZY" to "ICY")

    for (entry in b) {
        println("${entry.key} : ${entry.value}")
    }

    b.put("오마이걸", "번지")
    println(b)

    b.remove("ITZY")
    println(b)
}