fun main() {
    val s = "Hello Word Ayaan"
    println(s.len()))
}

fun String.len() = this.length

fun String.compareTo(other: String) = this.length - other.length