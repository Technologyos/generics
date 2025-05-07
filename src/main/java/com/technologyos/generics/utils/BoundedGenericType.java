package com.technologyos.generics.utils;

public class BoundedGenericType {
   static class Person implements Comparable<Person>{
      private final int age;
      private String name;

      public Person(String name, int age){
         this.name = name;
         this.age = age;
      }

      public int getAge() {
         return age;
      }

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
