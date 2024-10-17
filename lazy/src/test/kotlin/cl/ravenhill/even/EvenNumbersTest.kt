package cl.ravenhill.even

import io.kotest.core.spec.style.FreeSpec

class EvenNumbersTest : FreeSpec({
    "Given a lazy collection of even numbers" - {
        "when an arbitrary number of elements is requested" - {
            "then the collection should generate the first n even numbers" {
                checkAll(Arb.int(1..100))
            }
        }
    }
})