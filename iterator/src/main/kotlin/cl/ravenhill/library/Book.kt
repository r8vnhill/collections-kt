package cl.ravenhill.library

/**
 * Represents a book with a title and an author.
 *
 * This data class is used to model a book entity with two properties: `title` and `author`. It automatically provides
 * `equals()`, `hashCode()`, `toString()`, and `copy()` implementations due to being a data class.
 *
 * ## Usage:
 * The `Book` class can be used to create instances of books and easily compare, copy, or display them.
 *
 * ### Example 1: Creating a Book Instance
 * ```kotlin
 * val book = Book("1984", "George Orwell")
 * println(book) // Outputs: Book(title=1984, author=George Orwell)
 * ```
 *
 * ### Example 2: Copying a Book Instance
 * ```kotlin
 * val book = Book("1984", "George Orwell")
 * val anotherBook = book.copy(title = "Animal Farm")
 * println(anotherBook) // Outputs: Book(title=Animal Farm, author=George Orwell)
 * ```
 *
 * @property title The title of the book.
 * @property author The author of the book.
 */
data class Book(val title: String, val author: String)
