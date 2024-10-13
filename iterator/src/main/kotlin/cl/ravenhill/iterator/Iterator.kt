package cl.ravenhill.iterator

/**
 * Represents an iterator that provides sequential access to a collection of elements of type `T`.
 *
 * The `Iterator` interface defines methods to iterate through a collection or sequence of elements. It is typically
 * used to traverse elements one at a time, checking for more elements and retrieving the next available item.
 *
 * ## Usage:
 * Implementations of `Iterator` allow for controlled traversal of a collection. Custom iterators can be created by
 * implementing both `hasNext` and `next` methods.
 *
 * ### Example 1: Implementing a Custom Integer Iterator
 * ```kotlin
 * class IntIterator(private val data: List<Int>) : Iterator<Int> {
 *     private var index = 0
 *     override fun hasNext() = index < data.size
 *     override fun next(): Int {
 *         if (!hasNext()) throw NoSuchElementException("No more elements")
 *         return data[index++]
 *     }
 * }
 *
 * val iterator = IntIterator(listOf(1, 2, 3))
 * while (iterator.hasNext()) {
 *     println(iterator.next()) // Outputs 1, 2, 3
 * }
 * ```
 *
 * @param T The type of elements that this iterator will traverse.
 */
interface Iterator<T> {
    /**
     * Checks if the iterator has more elements.
     *
     * @return `true` if the iterator has more elements, `false` otherwise.
     */
    fun hasNext(): Boolean

    /**
     * Returns the next element in the iteration.
     *
     * @throws NoSuchElementException if there are no more elements.
     * @return The next element in the iteration.
     */
    fun next(): T
}
