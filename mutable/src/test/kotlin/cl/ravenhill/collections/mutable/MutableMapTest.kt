package cl.ravenhill.collections.mutable

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MutableMapTest : FreeSpec({
    "A mutable map" - {
        "when adding elements" - {
            "should contain the added elements" {
                val mutableMap: MutableMap<String, String> =
                    mutableMapOf("kotlin" to "JVM")
                mutableMap["java"] = "JVM"
                mutableMap["scala"] = "JVM"
                mutableMap shouldBe mapOf(
                    "kotlin" to "JVM",
                    "java" to "JVM",
                    "scala" to "JVM"
                )
            }
        }
    }
})
