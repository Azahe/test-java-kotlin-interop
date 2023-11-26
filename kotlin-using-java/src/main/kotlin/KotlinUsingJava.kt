package org.example

import test.javakotlin.interop.LibraryKotlin

class KotlinUsingJava {

    companion object {
        fun method(): String {
            return LibraryKotlin.method() + " uses " + LibraryJava.method()
        }
    }

}
