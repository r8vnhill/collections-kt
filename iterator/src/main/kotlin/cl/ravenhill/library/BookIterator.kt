package cl.ravenhill.library

class BookIterator(private val books: List<Book>) : Iterator<Book> {
    private var position = 0

    override fun hasNext(): Boolean = position < books.size

    override fun next(): Book {
        if (!hasNext()) throw NoSuchElementException()
        return books[position++]
    }
}
