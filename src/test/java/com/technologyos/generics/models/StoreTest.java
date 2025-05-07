package com.technologyos.generics.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    @Test
    void validateIntegerStore(){
        //Row type <> diamond operator
        Store<Integer> store = new Store<>();
        store.setItem(10);

        assertEquals(10, store.getItem());
    }
}
