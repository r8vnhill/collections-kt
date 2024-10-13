package cl.ravenhill.collections.mutable

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MutableListTest : FreeSpec({
    "A mutable list" - {
        "when setting an element at an index" - {
            "should replace the element at the index" {
                val mutableList: MutableList<String> =
                    mutableListOf("Kotlin", "Java", "Scala")
                mutableList[1] = "Groovy"
                mutableList shouldBe listOf("Kotlin", "Groovy", "Scala")
            }
        }
    }
})
