package com.jauregui.developer.generics.models;

public class Hash <K, V> {
    private K key;
    private V value;

    public Hash(){}

    public Hash(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void add(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
