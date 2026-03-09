package Map;

import java.util.HashMap;

public class HashMapExample {
	public static void main (String args[])
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "java");// put used to add the key and values pair
		map.put(2, "c");
		map.put(3, "javaScript");
		map.put(4, "c++");
		map.put(5, "java");
		System.out.println(map);//{1=java, 2=c, 3=javaScript, 4=c++, 5=java}
		map.put(6, "java");//
		System.out.println(map);//{1=java, 2=c, 3=javaScript, 4=c++, 5=java}
		// Hasmap accept duplicate values but not duplicate key
		
		//get(key): get() used to get value using key;
		
		System.out.println(map.get(1));//java
		
		//remove used to remove value using key; remove(key)
		
		System.out.println(map.remove(6));//java
		System.out.println(map);//{1=java, 2=c, 3=javaScript, 4=c++, 5=java}
		
		// containsKey checks keys are exist or not containsKey(key)
		System.out.println(map.containsKey(6));//false
		System.out.println(map.containsKey(3));// true
		
		
		 // containsValue checks value exists or not containsValue("Value");
		System.out.println(map.containsValue("java"));//true
		System.out.println(map.containsValue("j++"));// False
		
		
		//isEpty checks map is empty or not
			System.out.println(map.isEmpty());// False
			
		//Size() of the elements
			System.out.println(map.size());// 5
			
		//clear() : remove all elements
			map.clear() ;
			System.out.println(map);// 5


			

		

		
		
		
		
		
		

		
		
		
		
	}

}
