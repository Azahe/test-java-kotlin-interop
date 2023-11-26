package test.javakotlin.interop

import kotlin.test.Test
import kotlin.test.assertEquals

class LibraryKotlinTest {
    @Test
    fun someLibraryMethodReturnsTrue() {
        assertEquals("Kotlin", LibraryKotlin.method())
    }
}
