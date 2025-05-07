package com.technologyos.generics.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Register<T, U, V> {
   private T type;
   private U name;
   private V age;
}
