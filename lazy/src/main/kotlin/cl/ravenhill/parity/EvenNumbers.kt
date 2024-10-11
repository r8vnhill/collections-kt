package cl.ravenhill.parity

class EvenNumbers : Iterable<Int> {
    override fun iterator(): Iterator<Int> = EvenNumberIterator()
}
