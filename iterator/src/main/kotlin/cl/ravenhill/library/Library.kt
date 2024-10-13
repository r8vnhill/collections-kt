package cl.ravenhill.library

/**
 * Represents a library that holds a collection of books and provides iteration functionality.
 *
 * The `Library` class stores a collection of `Book` objects and implements the `Iterable` interface, allowing for
 * sequential iteration over the books in the library. The books are provided as varargs during the creation of the
 * library, and internally they are stored as a list.
 *
 * ## Usage:
 * The `Library` class enables you to store books and iterate through them in a while loop.
 *
 * ### Example 1: Creating a Library and Iterating Through Books
 * ```kotlin
 * val book1 = Book("1984", "George Orwell")
 * val book2 = Book("To Kill a Mockingbird", "Harper Lee")
 * val library = Library(book1, book2)
 *
 * while (library.iterator().hasNext()) {
 *    val book = library.iterator().next()
 *    println(book)
 * }
 * ```
 *
 * @param books The books to be stored in the library.
 */
class Library(vararg books: Book) : Iterable<Book> {
    private val books = books.toList()

    /**
     * Returns an iterator over the books in the library.
     *
     * @return An iterator of type `Book`.
     */
    override fun iterator() = BookIterator(books)
}
