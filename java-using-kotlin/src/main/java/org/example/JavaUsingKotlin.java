package org.example;

import test.javakotlin.interop.LibraryKotlin;

public class JavaUsingKotlin {

  public static String method() {
    return LibraryJava.method() + " uses " + LibraryKotlin.Companion.method();

  }
}