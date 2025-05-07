package com.technologyos.generics.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyGeneric<T> {
   private T instance;

   MyGeneric(T instance){
      this.instance = instance;
   }

   T getT(){
      return instance;
   }
}
