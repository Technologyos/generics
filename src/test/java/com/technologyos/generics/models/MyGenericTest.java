package com.technologyos.generics.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyGenericTest {

   @DisplayName("MyGeneric should return the correct value for different types")
   @Test
   void shouldReturnCorrectValueForDifferentTypes() {
      MyGeneric<String> genericString = new MyGeneric<>("SK");
      assertEquals("SK", genericString.getT(), "Should return the correct String value");

      MyGeneric<Integer> genericNumber = new MyGeneric<>(100);
      assertEquals(100, genericNumber.getT(), "Should return the correct Integer value");
   }
}
