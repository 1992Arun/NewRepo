package mapp.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapp {
	
	private static final Object Sal = null;

	public static void main(String[] args) {

	//HashMap
	//LinkedHashMap
	//TreeMap
	//HashTable
	Map<Integer, String > mp = new HashMap();
	
	
	mp.put(10, "Arun");
	mp.put(20, "Kevin");
	mp.put(30, "Navin");
	mp.put(40, "Arun");
	mp.put(50, "Arun");
	
	
	
	Set ds = mp.keySet();
	
	Collection<String> values2 = mp.values();
	
	
	System.out.println(ds);
	
	int size = mp.size();
	
	System.out.println(size);
	
	
	
	System.out.println(mp.get(40));
	
	Set<Integer> keySet = mp.keySet();
	
	
	System.out.println(keySet);
	
	
	String string = mp.get(30);
	
	
	System.out.println(string);
	
	
	Collection<String> values = mp.values();
	
	
	System.out.println(values);
	
	Set<Entry<Integer, String>> es = mp.entrySet();
	
	for (Entry<Integer, String> x:es) {
		
		System.out.println(x);
	}
		
		System.out.println("=============================================");
		
		
//		Create a HashMap with the below key and values
//        key    : 10,20,30,40,50,60,10,50,40
//        values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
		
		
		HashMap<Integer, String> mp1= new HashMap();
		
		mp1.put(10, "java");
		mp1.put(20, "sql");
		mp1.put(30, "oops");
		mp1.put(40, "sql");
		mp1.put(50, "oracle");
		mp1.put(60, "DB");
		mp1.put(10, "selenium");
		mp1.put(50, "psql");
		mp1.put(40, "Hadoop");
		
		
		
		System.out.println(mp1);
		
	 Set<Entry<Integer, String>> entrySet = mp1.entrySet();
		
		Set keySet2 = mp1.keySet();
		
		System.out.println(keySet2);
		
		for(Entry<Integer, String> x: entrySet) {
			
			System.out.println(x);
			
		}
		
		entrySet.forEach(System.out::println);
		
		
	System.out.println("===============Map+++++++++++++++");
		
		Map<Integer, Integer> mp2= new LinkedHashMap();
		
	mp2.put(1, 10);
	mp2.put(2, 20);
	mp2.put(3, 30);
	mp2.put(4, 40);
	mp2.put(5, 50);
	
	
	Set<Entry<Integer, Integer>> entrySet2 = mp2.entrySet();
	
	
	
	
	System.out.println(mp2);
	
	System.out.println(mp2.get(2));
	
	System.out.println(mp2.values());
	System.out.println(mp2.keySet());
	
	Set<Entry<Integer, Integer>> es2 = mp2.entrySet();
	
	es2.forEach(System.out::println);
	
	for(Entry<Integer, Integer> x:es2) {
		
		System.out.println(x);
		
		
	}
	
	
//	Create a TreeHashMap with the below key and values
//    key    : !,@,#,$,%,^,&,*,(,
//    Values : 10,20,30,40,50,60,10,50,40
	

	
	
	Map<Character, Integer> tr = new TreeMap<Character, Integer>();
	
	tr.put('!', 10) ;
	
	tr.put('@', 20) ;
	
	tr.put('#', 30) ;
	tr.put('$', 40) ;
	tr.put('%', 50) ;
	tr.put('^', 60) ;
	
	tr.put('*', 50) ;
	
	tr.put('(', 40) ;
	
	
	
	System.out.println(tr);
	
	System.out.println(tr.keySet());
	
	System.out.println(tr.get('*'));
	
	tr.keySet();
	
	Set<Entry<Character, Integer>> es3 = tr.entrySet();
	
	for(Entry<Character, Integer> x:es3) {
		
		System.out.println(x);
		
	}
	
	Map<Character, Integer> tr1 = new TreeMap();
	

	tr1.put('%', 50) ;
	tr1.put('^', 60) ;
	tr1.put('&', 20) ;
	
	tr1.putAll(tr);
	System.out.println(tr1+"copy");
		System.out.println("====================Userdefined=============");
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Emp ID");
//		
//		int empId = sc.nextInt();
//		
//		System.out.println("Enter Emp Name");
//		
//		String name = sc.next();
//		
//		System.out.println("Enter Emp Phone number");
//		
//		long phone = sc.nextLong();
//		
//		
//		System.out.println("Enter Emp address");
//		
//		String address = sc.next();
//		
//		
//		System.out.println("Enter Emp DOB"); 
//		
//		int dob = sc.nextInt();
//		
//		System.out.println("Enter Emp DOJ");
//		
//		int doj = sc.nextInt();
//		
//		System.out.println("Enter Emp Email");
//		
//		String email = sc.next();
//		
//		
//		System.out.println("Enter Emp Gender");
//		
//		String g = sc.next();
//		
//		System.out.println("Enter Emp salary");
//		
//		int sal = sc.nextInt();
//		
//		char Gender = g.charAt(0);
		
//		Set emp1= new LinkedHashSet();
//		
//		emp1.add(empId);
//		emp1.add(name);
//		emp1.add(phone);
//		emp1.add(address);
//		emp1.add(dob);
//		emp1.add(doj);
//		emp1.add(email);
//	
//		emp1.add(Gender);
//		
//		Set emp2 = new LinkedHashSet();
//		
//		emp2.add(empId);
//		emp2.add(name);
//		emp2.add(phone);
//		emp2.add(address);
//		emp2.add(dob);
//		emp2.add(doj);
//		emp2.add(email);
//		
		
		
		
	
		
				
		
	//	empId,name,phone,address,dob,doj,eMail,gender,Sal
	
	Map<String, Object> Details = new HashMap();
	
	Details.put("empId", 653932 );
	
	Details.put("name", "Arun");
	
	Details.put("Address", "175,New Street, Tindivanam");
	
	
	Details.put("DOB", "11/3/2002");
	
	Details.put("DOJ", "11/20/2017");
	
	
	Details.put("Email", "arunkumar.erusan@gmail.com");
	
	
	Object ob = Details.get("Address");
	
	
		System.out.println(Details);
		
		System.out.println("=====================HashTable=============");
		
    Map<String, String> ht = new LinkedHashMap();
    
    

    
                     ht.put("vel", "Selenium");
                     ht.put("Ganesh", "framework");
                     ht.put("Dinesh", "oracle");
                     ht.put("Vengat", "corejava");
                     ht.put("subash", "jira");
                     
                     System.out.println(ht);
                     
                     Set<Entry<String, String>> e = ht.entrySet();
                     
//                     for(Entry<String, String> x:e) { 
//                    	 
//                    	 System.out.println(x);
//                    	 
//                     }
//                     
                    
                     
                     System.out.println(ht.get("vel"));
                     
                     System.out.println(ht.get("Ganesh"));
	
	                    e.forEach(System.out::println);
	                    
	                    System.out.println("=====+++++++++=======");
	                    
	                    
	                    Map<String, Integer> mp4 =  new HashMap();
	                    
	                    mp4.put("Arun", 34);
	                    
	                    mp4.put(null, 67);
	                    mp4.put("Kevin", 89);
	                    mp4.put("Varun", 75);
	                    mp4.put("Jerry", 45);
	                    
	                  System.out.println(mp.entrySet());
	                   
                   System.out.println(mp4.keySet());
	                   
	                    Set<String> key = mp4.keySet();
	                     
	                    for(String x:key) {
	                    	
	                    	System.out.println(x+" "+mp4.get(x));
	                    	
	                    }
	                    
	                    
	                    System.out.println("=============User Defined Map=======================");
	                    
	                  
	                    
	                    
	                    Map<Object, Object> ud= new TreeMap();
	                    
	                    
	                    ud.put("empId", 180323);
	                    
	                    ud.put("name", "Arun");
	                    
	                 
	                    
	                    ud.put("phone", 98217291293l);
	                    
	                    ud.put("address", "175, endiyur");
	                    
	                    ud.put("dob", null);
	                    
	                    System.out.println(ud.get("dob"));
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	
	}
	
}
