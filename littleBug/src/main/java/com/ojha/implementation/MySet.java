package com.ojha.implementation;

import java.util.*;

/**
 * Created by alexandra on 03/06/2014.
 */
public class MySet<E> implements Set<E>{

   private Map<E, Object> hashMap = new HashMap<>();

    private static final Object object = new Object();


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return (this.hashMap.put(e, object) == null);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return this.hashMap.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }
}
