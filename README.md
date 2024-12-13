Generics

https://gist.github.com/ArmandoSJ/be8d4e2c1ac0dfdebe6cfae2fc5a4c4c


#### Generics in Java
Generics allow you to create classes, interfaces, and methods with a placeholder for the type of data they operate on. This provides type safety at compile time and eliminates the need for explicit type casting.
```java
public static <T> void printArray(T[] array) {
  for (T element : array) {
    System.out.println(element);
  }
}
```

#### Bounded Generics
Bounded Generics restrict the types that can be used as type parameters, allowing for more specific type constraints.

Upper Bounded Wildcards (? extends T)
This restricts the unknown type to be a specific type or a subtype of that type.

```java
public void processNumbers(List<? extends Number> list) {
  for (Number number : list) {
    System.out.println(number);
  }
}
```

Lower Bounded Wildcards (? super T)
This restricts the unknown type to be a specific type or a supertype of that type.

```java
public void addIntegers(List<? super Integer> list) {
  list.add(1);
  list.add(2);
}
```
