package com.technologyos.generics.utils;

import com.technologyos.generics.models.Register;

public class GenericMethod {
   public <T,V> void printItems(T t, V v) {
      System.out.println(t.toString());
      System.out.println(v.toString());
   }

   public <T> void showItems(T[] items) {
      for(T item : items)
         System.out.println(item);
   }

   public <T> T showItem(T item) {
      System.out.println("The item is: " + item.toString());
      return item;
   }

   public static <T, U, V> void register(T t, U u, V v){
      Register<T, U, V> register = new Register<>(t, u, v);
      System.out.println("Register: " + register.getName() + "; " + register.getAge());
   }
}
