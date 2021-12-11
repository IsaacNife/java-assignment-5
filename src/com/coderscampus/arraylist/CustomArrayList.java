 package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	
	private int arraySize = 0;
	Object[] items = new Object[10];
	
	public CustomArrayList(int initCapacity) {
		if(initCapacity > 0) {
			this.items = new Object[initCapacity];
		} else if (initCapacity == 10) {
			this.items = new Object[10];
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initCapacity);
		}
	}

	@Override
	public boolean add(T item) {	
		ensureCapacity();
		items[arraySize++] = item;
		
		return true;
	}
	
	private void ensureCapacity() {
		if(items.length <= arraySize) {
		int oldCapacity = items.length;
		int newCapacity = (oldCapacity * 3) /2 + 1;
		items = Arrays.copyOf(items, newCapacity);
		}
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
