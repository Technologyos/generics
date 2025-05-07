package com.technologyos.generics.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericTypeTest {

   @Test
   void validateGenericMethods(){
      Integer[] nums = {1, 2, 4, 5};
      assertEquals(12, GenericType.sumItems(nums));
      String[] names = {"Taylor", "Harry", "Selena"};
   }


   @Test
   void checkEquality(){
      assertTrue(GenericType.checkEquality(10.5, 10.5));
      assertTrue(GenericType.checkEquality("Joe", "Joe"));
      assertFalse(GenericType.checkEquality(12, 8));
   }
}
