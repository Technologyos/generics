package com.technologyos.generics.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class BoundedGenericType {
   @Getter
   @AllArgsConstructor
   static class Person implements Comparable<Person>{
      private final int age;
      private final String name;

      @Override
      public int compareTo(Person otherPerson) {
         return Integer.compare(age, otherPerson.getAge());
      }
   }

   public static <T extends Comparable<T>> T calculateMin(T num1, T num2){
      if(num1.compareTo(num2) < 0 ){
         return num1;
      }
      return num2;
   }
}
