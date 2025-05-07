package com.technologyos.generics.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Hash <K, V> {
   private K key;
   private V value;
   public void add(K key, V value){
      this.key = key;
      this.value = value;
   }
}
