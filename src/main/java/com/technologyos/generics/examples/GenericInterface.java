package com.technologyos.generics.examples;

import com.technologyos.generics.models.Cat;
import com.technologyos.generics.models.Dog;

public class GenericInterface {
   public static void main(String[] args) {
      new MoveFeline().move(new Cat());
      //new MoveFeline().move(new Dog()); // compiler error
      new MoveCanine().move(new Dog());
      //new MoveCanine().move(new Cat()); // compiler error

      new SomeMoveable<Dog>().move(new Dog());
      new SomeMoveable<Cat>().move(new Cat());
   }

   static class MoveFeline implements Moveable<Cat>{
      public void move(Cat c){}
   }

   static class MoveCanine implements Moveable<Dog>{
      public void move(Dog d){}
   }

   static class SomeMoveable<U> implements Moveable<U>{
      public void move(U u){}
   }

   static class RawMoveable implements Moveable { // old way
      public void move(Object o){}
   }
}
