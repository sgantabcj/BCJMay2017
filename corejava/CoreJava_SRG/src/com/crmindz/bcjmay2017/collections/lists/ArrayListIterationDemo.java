package com.crmindz.bcjmay2017.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterationDemo {
	public static void main(String[] args) {
		ArrayListIterationDemo itrDemo = new ArrayListIterationDemo();
		List<String> list = new ArrayList<String>();
		list.add("pear");
		list.add("banana");
		list.add("tangerine");
		list.add("strawberry");
		list.add("blackberry");
		itrDemo.displayInOrder(list);
		itrDemo.displayInReverseOrder(list);
		itrDemo.addStringAndDisplay(list, "banana");
		itrDemo.displayInOrder(list);
	}
	public void displayInOrder(List<String> list){
		Iterator<String> itr = list.iterator();
		System.out.println("elements are (in order of insertion):");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	public void displayInReverseOrder(List<String> list){
		ListIterator<String> listItr = list.listIterator(list.size());
		System.out.println("elements are (in order of insertion):");
		while(listItr.hasPrevious()){
			System.out.println(listItr.previous());
		}
	}
	public void addStringAndDisplay(List<String> list,String item){
		for(int i=1;i<list.size();i++){
			if( list.get(i-1).equals("tangerine") && list.get(i).equals("strawberry")){
				list.add(i,item);
			}
		}
	}
}
