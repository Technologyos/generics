package com.technologyos.generics.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
   private String name;
   private String lastname;
}
