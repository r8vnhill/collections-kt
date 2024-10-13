package cl.ravenhill.collections.mutable

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MutableCollectionTest : FreeSpec({
    "A mutable collection" - {
        "when adding elements" - {
            "should contain the added elements" {
                val mutableStrings: MutableCollection<String> =
                    mutableListOf("Kotlin", "Java")
                mutableStrings += "Scala"
                mutableStrings shouldBe listOf("Kotlin", "Java", "Scala")
            }
        }
    }
})
