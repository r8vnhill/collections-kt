package cl.ravenhill.collections.mutable

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MutableIterableTest : FreeSpec({
    "A mutable iterable" - {
        "when removing all even numbers" - {
            "should have only odd numbers" {
                val numbers: MutableIterable<Int> =
                    mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                val iterator = numbers.iterator()
                while (iterator.hasNext()) {
                    if (iterator.next() % 2 == 0) {
                        iterator.remove()
                    }
                }
                numbers shouldBe listOf(1, 3, 5, 7, 9)
            }
        }
    }
})
