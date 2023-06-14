import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()                                               // 1

    override fun toString() = "예제 클래스"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 2
        return "$thisRef, '${prop.name}' 속성을 위임했습니다!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$thisRef 인스턴스에 있는 ${prop.name} 속성으로 지정된 값은 ${value}입니다.")
    }
}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
}