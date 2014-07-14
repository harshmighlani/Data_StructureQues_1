package mergeLinkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class MyThreads implements Runnable{

	LinkedList<String> one= null;
	LinkedList<String> two = null;
	LinkedList<String> finalList = new LinkedList<String>();
	
	public MyThreads(LinkedList<String> one,LinkedList<String> two) {
		this.one= one;
		this.two = two;

		Thread t1 = new Thread(this,"first");
		Thread t2 = new Thread(this,"second");
		t1.start();
		t2.start();
		for(int i=0;i<(one.size()+two.size());i++)
		{
			System.out.println("final list"+ finalList.get(i));
		}

	}
	@Override
	public void run() {

		int i1 = 0;
		int i2 = 0;
		int max1 = one.size();
		int max2 = two.size();

		if(Thread.currentThread().getName().contains("first"))
		{
			System.out.println("max1  : "+max1);
			while(i1<max1)
			{
				finalList.add(one.get(i1));
				System.out.println("size -> "+ finalList.size()+ "added" + one.get(i1));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i1++;
			}
		}
		if(Thread.currentThread().getName().contains("second"))
		{
			System.out.println("max2  : "+max2);
			while(i2<max2)
			{
				finalList.add(two.get(i2));
				System.out.println("size -> "+ finalList.size()+ "added" + two.get(i2));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i2++;
			}
		}
	}



}
public class TestCode {

	public static void main(String[] args) {
		LinkedList<String> linkedList1 = new LinkedList<String>();

		LinkedList<String> linkedList2 = new LinkedList<String>();

		for(int i=0;i<5;i++)
		{
			linkedList1.add("a"+i);
			linkedList2.add("b"+i);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("first is :" + linkedList1.get(i));
			System.out.println("second is :" + linkedList2.get(i));
		}

		MyThreads t1 = new MyThreads(linkedList1, linkedList2);
	}
}
