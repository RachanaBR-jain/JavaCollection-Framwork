import java.util.*;

import java.util.Map.Entry;


public class JavaCollection {
	public static void stackDemo()
	{
		Stack<String> stack = new Stack<>();
		System.out.println("Stack Example");
		stack.push("Amit Sharma");
		stack.push("Vijay Raj");
		stack.push("Jai Shanker");
		stack.push("Raj");
		stack.push("Rachana");

		String pop = stack.pop();
		System.out.println("poped element is " + pop);

		Iterator<String> itr =stack.iterator();

		while (itr.hasNext())
		{
			System.out.println(itr.next());

		}

	}

	public static void queueDemo() {
		System.out.println("Queue Example");
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("AA");
		queue.add("BB");
		queue.add("CC");
		queue.add("DD");
		queue.add("EE");

		System.out.println("head" + queue.element());
		System.out.println("head" + queue.peek());
		System.out.println("iterating the queue element");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}	
		System.out.println("removed elemnt" + queue.remove());
		System.out.println("poll element " + queue.poll());

		for(String queue1: queue )
		{
			System.out.println(queue1);	
		}	

	}
	public static void arrayListDemo()
	{
		System.out.println("ArrayList Examples");
		List<String> al=new ArrayList<String>();  
		al.add("Mango");  
		al.add("Apple");  
		al.add("Banana");  
		al.add("Grapes");  
		// Traversing Using Iterator
		Iterator itr=al.iterator();//getting the Iterator  
		while(itr.hasNext()){//check if iterator has the elements  
			System.out.println(itr.next());//printing the element and move to next
		}
		//accessing the element    
		System.out.println("Returning element 1st index element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		System.out.println("Changing 4th index value to Dates");
		al.set(3,"Dates");
		//Traversing list through For Loop  
		for(String fruit:al)    
			System.out.println(fruit); 
		System.out.println("Deleting the element 3rd index elemnt");
		al.remove(3);
		for(String fruit:al)    
			System.out.println(fruit);  
	}
	
	public static void hashMapDemo() {
		
	System.out.println(" Hash Map Example");
	HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
	map.put(1,"Mango"); //Put elements in Map
	map.put(2,"Apple");
	map.put(3,"Banana");
	map.put(4,"Grapes");

	System.out.println("Iterating Hashmap...");
	for(Entry<Integer, String> m : map.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());
	}
	System.out.println("Adding elements in the hash map & Traversing.");
	map.putIfAbsent(5, "Orange");
	System.out.println("After invoking putIfAbsent() method ");
	for(Entry<Integer, String> m:map.entrySet()){
	System.out.println(" "+m.getValue());
	}

	System.out.println("Removing 2nd key elements in the hash map");
	map.remove(2,"Apple");
	System.out.println("Hash list of elements: "+map);
	
	System.out.println("Replace 1st key element Mango to Pineapple in the Hash Map");
	map.replace(1, "Mango", "Pinepale");
	System.out.println("After Replace list of elements: "+map);


	}
	
	public static void mapDemo() {
		System.out.println("Map Example");
		Map<Integer,String> map1 = new LinkedHashMap<>(); //maintain inseration order
		map1.put(100, "Amit");
		map1.put(200, "Vijay");
		map1.put(300, "Ravi");
		map1.put(400, "Kavya");
		for(Map.Entry<Integer, String> res : map1.entrySet()) {
			System.out.println(res.getKey()+ " "+ res.getValue());
		}
	
	}
	public static void setDemo() {
		System.out.println("Set Example");
		Set<String> set = new TreeSet<>(); //sorted
		set.add("Ravi");
		set.add("Vijay");
		set.add("Raki");
		set.add("Rachu");
		for(String setRes : set)
		{
			System.out.println(setRes);
		}

	}
	
	public static void main(String[] args) {
		System.out.println("--------------------------");
		stackDemo();
		System.out.println("--------------------------");
		queueDemo();
		System.out.println("--------------------------");
		arrayListDemo();
		System.out.println("--------------------------");
		hashMapDemo();
		System.out.println("--------------------------");
		mapDemo();
		System.out.println("--------------------------");
		setDemo();
		System.out.println("--------------------------");


	}
}
