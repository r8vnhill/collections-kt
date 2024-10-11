package cl.ravenhill.parity

const val SIZE = 10

fun computeEvenNumbersWithIterator() {
    val evenNumbers = EvenNumbers()  // Crear una instancia de la colección perezosa
    val iterator = evenNumbers.iterator()  // Obtener un iterador de la colección

    val firstTenEvens = mutableListOf<Int>()  // Crear una lista mutable para almacenar los primeros 10 números pares
    while (iterator.hasNext() && firstTenEvens.size < SIZE) {
        firstTenEvens.add(iterator.next())  // Agregar el siguiente número par a la lista
    }

    println(firstTenEvens)  // Resultado: [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
}

fun computeEvenNumbersWithSequence() {
    val evenNumbers = sequence {  // Crear una secuencia perezosa usando el constructor `sequence`
        var number = 0
        while (true) {               // Secuencia infinita
            yield(number)            // Emitir el número actual
            number += 2              // Incrementar en 2 para obtener el siguiente número par
        }
    }
    val firstTenEvens = evenNumbers.take(SIZE).toList()  // Tomar los primeros 10 elementos y convertirlos a una lista

    println(firstTenEvens)  // Resultado: [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
}

fun main() {
    println("Computing the first $SIZE even numbers using an iterator:")
    computeEvenNumbersWithIterator()
    println("\nComputing the first $SIZE even numbers using a sequence:")
    computeEvenNumbersWithSequence()
}
