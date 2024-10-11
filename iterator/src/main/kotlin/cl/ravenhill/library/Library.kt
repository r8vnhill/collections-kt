package cl.ravenhill.library

class Library(vararg books: Book) : Iterable<Book> {
    private val books = books.toList()
    override fun iterator() = BookIterator(books)
}
