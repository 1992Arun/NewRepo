package listt.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Listtt {
	
	public static void main(String[] args) {

	List<Integer> li = new ArrayList<>();
	
	li.add(428);
	li.add(498);
	li.add(123);
	li.add(57);
	li.add(57);
	li.add(428);
	
	System.out.println(li);
	
	Integer in = li.get(0);
	
	System.out.println(in);
	
	int si = li.size();
	
	System.out.println(si);
	
	int io=li.indexOf(57);
	
	System.out.println(io);
	
	int ln= li.lastIndexOf(428);
	System.out.println(ln);
	
	boolean con = li.contains(57);
	
	System.out.println(con);
	
	int re= li.remove(5);
	
	System.out.println(li);
	
	
	System.out.println("=====================");
	
	List<Integer> l2= new ArrayList();
	
	l2.addAll(li);
	
	System.out.println(l2);
	
	l2.add(100);
	
	System.out.println(l2);
	
	l2.add(3, 300);
	
	System.out.println(l2);
	
	l2.set(3, 200);
	
	System.out.println(l2);
	
	l2.retainAll(li);


	System.out.println(l2+"Retained");
	
	int ls= l2.lastIndexOf(57);
	System.out.println(ls);
	
	l2.add(4, 100);
	System.out.println(l2);
	
	
	System.out.println("======================");
	
	List<Integer> nl= new ArrayList();
			
			nl.add(10);
			nl.add(20);
			nl.add(30);
			nl.add(90);
			nl.add(10);
			nl.add(10);
			nl.add(40);
			nl.add(50);
	
	List<Integer> nl2= new ArrayList();
	
	nl2.add(10);
	nl2.add(20);
	nl2.add(60);
	nl2.add(50);
	nl2.add(40);
	nl2.add(70);
	nl2.add(80);
	nl2.add(90);

	
	
	nl2.retainAll(nl);
	
	

	System.out.println("====================For Loop/ Index based====================");
	
	for(int i =0; i<nl.size(); i++) {
		
		System.out.println(nl.get(i));
	}
	
	
	System.out.println("====================Enhanced for loop/ Value based====================");
	
	for(int x:nl2) {
		
		System.out.println(x);
		
	}
	
	System.out.println("==========For each=========");
	
	nl.forEach(System.out::println);

	System.out.println("========== Replace the 10 into 100 in List=========");
	
//	Input:   List = 10,20,30,90,10,10,40,50,30
//    Output:  List = 100,20,30,90,100,100,40,50,30
	
	List <Integer> l5 = new LinkedList<>();
	
	l5.add(10);
	l5.add(20);
	l5.add(30);
	l5.add(90);
	l5.add(10);
	l5.add(10);
	l5.add(40);
	l5.add(50);
	l5.add(30);
	
	
	
	System.out.println(l5.indexOf(10));
	
	for(int i=0; i<l5.size();i++) {
		
		
	 if (l5.get(i)==10) {
		 
		 l5.set(i, 100);
	 }
			
			
		}
	
	System.out.println(l5);
		
	
	
	
//	Create a new ArrayListlists with values and return the common values
 //   Input : List = 10,20,30,90,10,10,40,50
   // Input : List = 30,40,50,60,80

	System.out.println("==========Return Common value===========");
	
	
	
	List<Integer> al= new  ArrayList<>();
	
	
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(90);
	al.add(10);
	al.add(10);
	al.add(40);
	al.add(50);
	
     System.out.println(al);

     List<Integer> al2= new  ArrayList<>();
 	
 	
 	al2.add(30);
 	al2.add(40);
 	al2.add(50);
 	al2.add(60);
 	al2.add(80);
 	al2.add(10);
 	
 	al2.retainAll(al);
 	
 	System.out.println(al2);
 	
 	System.out.println("=======Replace the value present in 7th index as 90 ========");
 	
 	//List = 100,200,300,400,500,600,700

 	List<Integer> al3 =  new ArrayList<>();
 	
 	al3.add(100);
 	al3.add(200);
 	al3.add(300);
 	al3.add(400);
 	al3.add(500);
 	al3.add(600);
 	al3.add(700);
 	
 	
 	
 		for(int i=0; i<al3.size(); i++) {
 			
 			if(al3.get(i)==300) {
 				
 				al3.set(i, 350);
 			}
 		}
 		
 		System.out.println(al3);
 		
 		
 		
 		List<String> ls5= new ArrayList();
 		
 		ls5.add("Green");
 		ls5.add("Red");
 		ls5.add("Yello");
 		ls5.add("White");
 		ls5.add("Black");
 		
 //		System.out.println(ls5);
 		
 	int size = ls5.size();
 		
 		for(int i=size-1 ;i>=0; i--) {
 			
 			System.out.println(ls5.get(i));
 		}
 		
 	
 		
 		
// 		for(String x:ls5) {
// 			
// 			System.out.println(x);
// 		}
 		
 	}
     
		
		}
		
		
		
		
		
		
	
	
		
	
	
	
	
	
	

