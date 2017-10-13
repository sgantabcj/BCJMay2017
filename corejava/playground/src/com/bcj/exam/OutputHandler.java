package com.bcj.exam;

public class OutputHandler {
	public static void main(String[] args) {

}

	public void fiddleFiddle(int x) {
		for (int i = 1; i <= x; i++) {
			if (x % 2 == 0 || x % 5 == 0) {
				if (x % 2 == 0 && x % 5 == 0) {
					System.out.println("Fiddle Faddle");
				} else if (x % 2 == 0 && x % 5 != 0) {
					System.out.println("Fiddle");
				} else {
					System.out.println("Faddle");
				}
			} else {
				System.out.println(i);
			}
		}
	}
}
