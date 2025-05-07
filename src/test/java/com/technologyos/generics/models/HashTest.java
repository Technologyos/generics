package com.technologyos.generics.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTest {

   @Test
   void validateMultipleGenerics(){
      Hash<String, String> hash = new Hash<>("2", "3");
      assertEquals("2", hash.getKey());
      assertEquals("3", hash.getValue());
   }
}
