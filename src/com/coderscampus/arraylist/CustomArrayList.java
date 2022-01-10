 package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	
	private int arraySize = 0;
	Object[] items = new Object[10];
	

	@Override
	public boolean add(T item) {	
		if (arraySize == items.length) {
            ensureCapacity();
        }
		items[arraySize++] = item;
		
		return true;
	}
	
	private void ensureCapacity() {
        int newSize =items.length * 2;
        items = Arrays.copyOf(items, newSize);
    }
		
	

	@Override
	public int getSize() {
		
		return arraySize;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if(index >= arraySize)
			throw new ArrayIndexOutOfBoundsException(index);
		return (T) items[index];
		
		
	}
	
	
	
}
