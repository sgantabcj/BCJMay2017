package com.crmindz.bcjmay2017.oop.abstractclasses.lab1;

public class AbstractClassDemo extends HumanBeing {
	public static void main(String[] args) {
		LandMammals firstMammal = new HumanBeing();
		firstMammal.run();
		WaterMammals secondMammal = new Whale();
		secondMammal.swim();
	}
}

abstract class Mammals{
	
}

abstract class LandMammals extends Mammals{
	abstract void walk();
	abstract void run();
	abstract void crawl();
}

abstract class WaterMammals extends Mammals{
	abstract void swim();
}

abstract class Lion extends LandMammals{
	void walk(){
		System.out.println("Lion can walk");
	}
	void run(){
		System.out.println("Lion can run");
	}
}

class HumanBeing extends LandMammals{
	void walk(){
		System.out.println("Human can walk");
	}
	void run(){
		System.out.println("Human can run");
	}
	void crawl(){
		System.out.println("Human can crawl");
	}
}

class Whale extends WaterMammals{
	void swim(){
		System.out.println("Whale can swim");
	}
}