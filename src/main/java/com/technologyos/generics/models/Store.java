package com.technologyos.generics.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Store <T> {
   private T item;
}
