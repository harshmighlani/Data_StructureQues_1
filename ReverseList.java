package list;

public class ReverseList {

	public static void main(String[] args) {
		
		List myList = new List(1);
		myList.next = new List(2);
		myList.next.next = new List(3);
		myList.next.next.next = new List(4);
		
		System.out.println(myList.toString());
		System.out.println(reverse(myList).toString());
	}
	public static List reverse(List l)
	{
		if(l==null || l.next == null)
		{
			return l;
		}
		List remReverse =reverse(l.next);
		
		List cur = remReverse; 
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next = l;
		
		l.next = null;
		return remReverse;
	}
}

	class List
	{
		int value;
		List next;

		public List(int k)
		{
			value = k;
			next = null;
		}

		public String toString()
		{
			List cur = this;
			String output = " ";
			while(cur!=null)
			{
				output += cur.value + " --> ";
				cur= cur.next;
			}
			return output+ "END";	
		}
	}
