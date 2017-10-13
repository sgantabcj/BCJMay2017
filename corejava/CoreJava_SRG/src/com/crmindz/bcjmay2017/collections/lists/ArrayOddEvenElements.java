package com.crmindz.bcjmay2017.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayOddEvenElements {
	public static void main(String[] args) {
		ArrayOddEvenElements oddEvenDemo = new ArrayOddEvenElements();
		List<String> list = new ArrayList<String>();
		list.add("how");
		list.add("are");
		list.add("you?");
		list.add("I");
		list.add("am");
		list.add("doing");
		list.add("fine");
		System.out.println("List before manipulation:\n"+list.toString());
		System.out.println();
		
		oddEvenDemo.reverseOddEvenItems(list);
		System.out.println("List after manipulation:\n"+list.toString());
	}
	public void reverseOddEvenItems(List<String> list){
		for(int i=0;i<list.size();i++){
			if(i%2 == 0 && i+1<list.size()){
				String bufferStr = list.get(i);
				list.set(i,list.get(i+1));
				list.set(i+1,bufferStr);
			}
		}
	}
}
