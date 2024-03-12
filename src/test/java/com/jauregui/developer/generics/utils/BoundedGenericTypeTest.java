package com.jauregui.developer.generics.utils;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class BoundedGenericTypeTest {

    @Test
    void validateBoundedGenerics(){
        int result = BoundedGenericType.calculateMin(19, 24);

        assertEquals(19, result);
    }

    @Test
    void validateObjectBoundedGenerics(){
        BoundedGenericType.Person result = BoundedGenericType.calculateMin(new BoundedGenericType.Person("", 10),
                new BoundedGenericType.Person("", 15));

        assertEquals(10, result.getAge());
    }
}