fun main() {
    val s = "Hello Word Ayaan"
    println(s.len()))
}

fun String.len() = this.length

fun String.compareTo(other: String) = this.length - other.length

fun String.compareTo(other: Int) = this.length - other

fun String.compareTo(other: Double) = this.length - other.toInt()