package cl.ravenhill.collections.mutable

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MutableSetTest : FreeSpec({
    "A mutable set" - {
        "when adding elements" - {
            "should contain the added elements" {
                val mutableSet: MutableSet<String> =
                    mutableSetOf("Kotlin", "Java")
                mutableSet += "Scala"
                mutableSet shouldBe setOf("Kotlin", "Java", "Scala")
            }
        }
    }
})
