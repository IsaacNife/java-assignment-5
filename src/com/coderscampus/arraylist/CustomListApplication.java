package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomList<Object> myCustomList = new CustomArrayList<>(10);
		
		myCustomList.add("Pasta");
		myCustomList.add("cereal");
		myCustomList.add("onions");
		myCustomList.add("tomatoes");
		
		System.out.println(myCustomList.get((3)));
		System.out.println(myCustomList.getSize());
		
		
		

	}

}
