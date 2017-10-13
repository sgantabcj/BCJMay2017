package com.crmindz.bcjmay2017.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListManipulationDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("how");
		list.add("are");
		list.add("you?");
		new ArrayListManipulationDemo().doubleList(list);
		System.out.print(list.toString());
	}
	public void doubleList(List<String> list){
/*		for(String str:list){
			int currentIndex = list.indexOf(str);
			list.add(currentIndex+1,str);
		}*/
		for(int i=0;i<list.size();i+=2){
			list.add(i+1,list.get(i));
		}
	}
}
