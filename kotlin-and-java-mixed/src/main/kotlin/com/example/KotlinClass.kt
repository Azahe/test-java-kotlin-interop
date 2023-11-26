package com.example

class KotlinClass {
    companion object {
        fun method(): String {
            return "KotlinClass uses " + JavaClass.method()
        }
    }
}
