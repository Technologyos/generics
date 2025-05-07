package com.technologyos.generics.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

   @DisplayName("Register should correctly store and return values")
   @Test
   void shouldCreateRegisterWithValidValues() {
      Dog expectedDog = new Dog();
      String expectedName = "Shep";
      Integer expectedAge = 5;

      Register<Dog, String, Integer> register = new Register<>(expectedDog, expectedName, expectedAge);

      assertAll("Register fields",
         () -> assertSame(expectedDog, register.getType(), "Type should match the given Dog instance"),
         () -> assertEquals(expectedName, register.getName(), "Name should be 'Shep'"),
         () -> assertEquals(expectedAge, register.getAge(), "Age should be 5")
      );
   }
}
