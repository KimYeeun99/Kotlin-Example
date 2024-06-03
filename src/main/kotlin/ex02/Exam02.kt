package ex02

fun main() {
    val a: Int = 0
    val b = 10
    val c: Int = 20
    val d: Int? = null

    callFunction(a)
    callFunction(b)
    callFunction(c)
    callFunction(d)
    callFunction()
}

// ?
fun callFunction(i: Int? = 100) {
    // ? << null이 올수도 있다
    // 변수? << 뱐수가 null이야?
    // 변수?. << 변수가 null이 아닐때
    // 변수?: << 변수가 null일때

    val temp = i?.let { it * 20 } ?: "null값 입니다."
    println(temp)

//    i?.let {
//        println(it)
//    }?: run {
//        println("null값 입니다.")
//    }
}