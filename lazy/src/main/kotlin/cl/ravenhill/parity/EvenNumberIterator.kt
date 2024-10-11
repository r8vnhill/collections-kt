package cl.ravenhill.parity

class EvenNumberIterator : Iterator<Int> {
    private var current = 0  // Estado interno para rastrear el número actual

    override fun hasNext(): Boolean = true  // Secuencia infinita

    override fun next() = if (current >= Int.MAX_VALUE - 1) {
        throw NoSuchElementException()  // Evitar desbordamiento
    } else {
        val nextValue = current
        current += 2  // Incrementar en 2 para obtener el siguiente número par
        nextValue
    }
}
