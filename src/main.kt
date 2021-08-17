import java.util.*

fun main() {
    val obj=Scanner(System.`in`)
    var num=obj.nextInt()
    var decreament=obj.nextInt()
        var i = num
        while (i >= 0) {
            println(i)
            i -= decreament
        }
    }