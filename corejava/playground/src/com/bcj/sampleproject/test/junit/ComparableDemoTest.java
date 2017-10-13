package com.bcj.sampleproject.test.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.bcj.sampleproject.test.ComparableDemo;

public class ComparableDemoTest {

	@Test
	public void comparableListSortTest() {
		List<ComparableDemo> compDemoList = new ArrayList<ComparableDemo>();
		ComparableDemo compDemo1 = new ComparableDemo();
		compDemo1.setUserId("101");
		compDemo1.setUserName("Sravan");
		
		ComparableDemo compDemo2 = new ComparableDemo();
		compDemo2.setUserId("102");
		compDemo2.setUserName("Tharun");
		
		compDemoList.add(compDemo2);
		compDemoList.add(compDemo1);
		
		Collections.sort(compDemoList);
		
		assertThat(compDemoList.get(0).getUserId(), is("101"));
		assertThat(compDemoList.get(1).getUserId(), is("102"));
		
	}
	
	@Test
	public void comparatorListSortTest(){
		List<ComparableDemo> compDemoList = new ArrayList<ComparableDemo>();
		ComparableDemo compDemo1 = new ComparableDemo();
		compDemo1.setUserId("101");
		compDemo1.setUserName("Sravan");
		
		ComparableDemo compDemo2 = new ComparableDemo();
		compDemo2.setUserId("102");
		compDemo2.setUserName("Tharun");
		
		compDemoList.add(compDemo1);
		compDemoList.add(compDemo2);
		
		Collections.sort(compDemoList,new Comparator<ComparableDemo>(){

			@Override
			public int compare(ComparableDemo o1, ComparableDemo o2) {
				int id1 = Integer.parseInt(o1.getUserId());
				int id2 = Integer.parseInt(o2.getUserId());
				return (id2>id1) ? 1 : (id2<id1 ? -1 : 0);
			}
			
		});
		
		assertThat(compDemoList.get(0).getUserId(), is("102"));
		assertThat(compDemoList.get(1).getUserId(), is("101"));
		
	}

}
