package cl.ravenhill.fibonacci

const val SIZE = 10

fun fibonacciSequence(): Sequence<Long> = sequence {
    var a = 0L
    var b = 1L
    while (true) {
        yield(a)
        a = b.also { b += a }
    }
}

fun main() {
    fibonacciSequence()
        .take(SIZE)
        .toList()
        .let(::println)
}