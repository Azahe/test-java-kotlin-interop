package com.example

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KotlinClassTest {

    @Test
    fun works() {
        assertEquals("KotlinClass uses JavaClass", KotlinClass.method())
    }
}