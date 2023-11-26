package org.example;

import com.example.KotlinClass;

public class JavaClass {

  public static String method() {
    return "JavaClass uses " +  KotlinClass.Companion.method() + " and " + AnotherKotlinClass.Companion.method();
  }
}