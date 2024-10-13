package cl.ravenhill.library

/**
 * An iterator for iterating over a list of `Book` objects.
 *
 * The `BookIterator` class provides functionality to traverse through a list of `Book` instances. It implements the
 * `Iterator` interface, allowing the iteration over books using standard iteration by manually calling `hasNext()` and
 * `next()`.
 *
 * ## Usage:
 * The `BookIterator` is typically used by the `Library` class to provide sequential access to its books. It keeps track
 * of the current position in the list and throws a `NoSuchElementException` if attempting to access beyond the end of
 * the list.
 *
 * ### Example 1: Manually Using the Iterator
 * ```kotlin
 * val books = listOf(Book("1984", "George Orwell"), Book("To Kill a Mockingbird", "Harper Lee"))
 * val iterator = BookIterator(books)
 *
 * while (iterator.hasNext()) {
 *     println(iterator.next().title)
 * }
 * // Outputs:
 * // 1984
 * // To Kill a Mockingbird
 * ```
 *
 * @param books The list of `Book` objects that this iterator will traverse.
 * @throws NoSuchElementException If `next()` is called when no more elements are available.
 */
class BookIterator(private val books: List<Book>) : Iterator<Book> {
    private var position = 0

    /**
     * Checks if there are more books to iterate over.
     *
     * @return `true` if there are more books, `false` otherwise.
     */
    override fun hasNext(): Boolean = position < books.size

    /**
     * Returns the next book in the iteration.
     *
     * @throws NoSuchElementException If no more elements are available.
     * @return The next `Book` in the list.
     */
    override fun next(): Book {
        if (!hasNext()) throw NoSuchElementException()
        return books[position++]
    }
}
