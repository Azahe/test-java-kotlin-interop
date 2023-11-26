package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaClassTest {

  @Test
  void method() {
    assertEquals("JavaClass uses KotlinClass and AnotherKotlinClass", JavaClass.method());
  }

}