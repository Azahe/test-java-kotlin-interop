package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

  @Test
  void name() {
    assertEquals("Java", Library.method());
  }

}