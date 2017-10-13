package com.bcj.sampleproject.test;

public class NestedClassesDemo {
	public class Test1 {
		public class Test2 {
			public class Test3 {
				public class Test4 {
					int i = 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		NestedClassesDemo t = new NestedClassesDemo();
//		Easy way to create object of nested class to access the inner most class methods
		NestedClassesDemo.Test1.Test2.Test3.Test4 t1 = t.new Test1().new Test2().new Test3().new Test4();

		System.out.println(t1.i);
	}
}