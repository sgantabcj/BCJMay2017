package com.bcj.sampleproject.test;

import java.io.IOException;
public class Test{
	public static void main(String[] args) throws IOException {
/*		File path = new File("src/hello.txt");
		System.out.println("we got a file path: "+ path);
		
		System.out.println("does it exist? " + path.exists());
		System.out.println("wat? " + path.isDirectory());
		
		String contentsToWrite = "hello world\nI am the boss.";
		FileOutputStream outStream = new FileOutputStream(path);
		outStream.write(contentsToWrite.getBytes());
		outStream.close();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		String firstLine = reader.readLine();
		reader.close();
		System.out.println("Read a line: " + firstLine);*/
	       /* List<Integer> list = Arrays.asList(5,4,3,7,2,1);

	        // custom comparator
	        Collections.sort(list, (o1, o2) -> (o1>o2 ? -1 : (o1==o2 ? 0 : 1)));
	        // alternative can could reuse the integer comparator
	        // Collections.sort(list, Integer::);
	        list.forEach(System.out::print);*/
	        
/*		String dt = "2008-01-01";  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(dt));
		} catch (ParseException e) {
			System.out.print("parse exception");
			e.printStackTrace();
		}
		c.add(Calendar.DATE, 18ime());  // dt is now the new date
		System.out.println(dt);*/
		
		TwoSums1 mr1 = new TwoSums1();
		Thread t1 = new Thread(mr1,"t1");
		Thread t2 = new Thread(mr1,"t2");
		t1.start();
		t2.start();		
		
		StringBuilder s1 = new StringBuilder("sravan");
		StringBuffer s2 = new StringBuffer("sravan");
		s1.reverse();
		s2.reverse();
	}
}

class TwoSums1 implements Runnable {
    public void run(){
    	new SyncTest().display();
    }  
}

class TwoSums2 implements Runnable {
	public void run(){
    	new SyncTest().display();
	}  
}

class SyncTest{
	/*private int sum1 = 0;
    private int sum2 = 0;

    private Integer sum1Lock = new Integer(1);
    private Integer sum2Lock = new Integer(2);*/
    
	public static synchronized void add(int val1, int val2){
			for(int i=0;i<5;i++){
				System.out.println("add"+i);
			}
    	/*synchronized(this.sum1Lock){
            this.sum1 += val1;   
            System.out.println(Thread.currentThread().getName()+" sum1:"+sum1);
        }
        synchronized(this.sum2Lock){
            this.sum2 += val2;
            System.out.println(Thread.currentThread().getName()+" sum2:"+sum2);
        }*/
    }
    public synchronized void display(){
		for(int i=5;i<10;i++){
			System.out.println("display"+i);
		}
    }
}
