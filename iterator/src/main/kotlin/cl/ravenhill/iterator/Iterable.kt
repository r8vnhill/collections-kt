package cl.ravenhill.iterator

/**
 * Represents a collection of elements that can be iterated over sequentially.
 *
 * The `Iterable` interface defines a method to obtain an `Iterator` for a collection, enabling controlled traversal of
 * its elements. Any class implementing `Iterable` can be used in a `for` loop or other iteration contexts.
 *
 * ## Usage:
 * Implementing the `Iterable` interface allows a class to be iterated over, providing an `Iterator` that controls how
 * elements are accessed sequentially.
 *
 * ### Example 1: Implementing a Custom Iterable Collection
 * ```kotlin
 * class NumberCollection(private val numbers: List<Int>) : Iterable<Int> {
 *     override fun iterator(): Iterator<Int> = NumberIterator(numbers)
 * }
 *
 * val collection = NumberCollection(listOf(1, 2, 3))
 * while (collection.iterator().hasNext()) {
 *    println(collection.iterator().next())
 * }
 * ```
 *
 * @param T The type of elements that this iterable collection will provide access to.
 */
interface Iterable<T> {
    /**
     * Returns an iterator over the elements of type `T` in this collection.
     *
     * @return An `Iterator` to iterate through the elements of this collection.
     */
    fun iterator(): Iterator<T>
}
