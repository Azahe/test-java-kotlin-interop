package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryJavaTest {

  @Test
  void name() {
    assertEquals("Java", LibraryJava.method());
  }

}