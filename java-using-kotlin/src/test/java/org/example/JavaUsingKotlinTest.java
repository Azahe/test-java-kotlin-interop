package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaUsingKotlinTest {

  @Test
  void name() {
    assertEquals("Java uses Kotlin", JavaUsingKotlin.method());
  }

}