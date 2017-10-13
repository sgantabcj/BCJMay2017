package com.crmindz.bcjmay2017.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListItemReverseDemo {
	public static void main(String[] args) {
		ArrayListItemReverseDemo reverseDemo = new ArrayListItemReverseDemo();
		List<String> list = new ArrayList<String>();
		list.add("how");
		list.add("are");
		list.add("you");
		
		System.out.println("List before reversing each list item:\n"+list.toString());
		System.out.println();
		
		reverseDemo.reverseListItem(list);
		System.out.println("List after reversing each list item:\n"+list.toString());
	}
	public void reverseListItem(List<String> list){
		for(String item:list){
			list.set(list.indexOf(item), new StringBuilder(item).reverse().toString());
		}
	}
}
