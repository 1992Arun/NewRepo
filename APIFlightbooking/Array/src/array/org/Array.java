package array.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array {
	
	
	
	String name;
	
	int rollNumebr;
	
	 int marks;
	
	
	public static void main(String[] args) {

//	int arr[] = new int[3];
//	
//	arr[0]=10;
//	
//	arr[1]=29;
//	
//	arr[2]=30;
//	
////	arr[3]=49;
//	
//	System.out.println(arr[2]);
//	
//	for(int i=0; i<arr.length;i++) {
//		
//		System.out.println(arr[i]);
//		
//	}
//	
//	
//	int a[] = {3,5,9};
//	
//	System.out.println(a[2]);
//	
//	System.out.println(a.length);
//	
//	for (int x:a) {
//		
//		System.out.println(x);
//	}
//
//	System.out.println("Multi Dimentional Array");
//	
//	 int b[][]= new int[2][2];
//	
//	b[0][0]= 30;
//	
//	b[0][1]=20;
//	
//	b[1][0]=43;
//	
//	b[1][1]=88;
//	
//	System.out.println(b.length);
//	
//	System.out.println(b[0].length);
//	
//	System.out.println(b[1][1]);
//	
//	System.out.println("Multi Dimentional for loop "); 
//	
//	for (int i=0; i<b.length;i++) {
//		
//		for(int j=0; j<b[0].length; j++) {
//			
//			System.out.println(b[i][j]);
//			
//		}
//		
//		
//	}
//	
//	System.out.println("Multi Dimentional enhanced for loop "); 
//	
//	int c[][]= {{3,4,5}, {9,8,1},{10,11,58}};
//	
//	
//	for (int[] x:c) {
//		
//		for(int y:x) {
//			
//			System.out.println(y);
//			
//		}
//		
//	}
	
	
//	System.out.println("========Sum of Array ============="); 
//	
//	int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//	
//	int add=0;
//	
//	for(int i=0; i<a.length; i++) {
//           
//		
//      
//		add=add+a[i];
//       
//	
//       }
//	
//	System.out.println(add);
//	
//	System.out.println("========Average value of Array ============="); 
//	
//int a1[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12};
//	
//	int add1=0;
//	
//	int ave=0;
//	
//	for(int x:a1) {
//           
//		
//      
//		add1=add1+x;
//		      
//	
//       }
//	
//	ave = add1/a1.length;
//	
//	System.out.println(ave);
	
	System.out.println("========Sorting array============="); 
	
	
	int  a2[]= {10,10,20,50,60,80,60,50};
	
	
	int temp = 0;
	
     for (int i=0; i<a2.length; i++)
     
     {
    	 for (int j=i+1; j<a2.length; j++) {
    		 
    		 if(a2[j]<a2[i])
    		 {
    			 
    			 temp= a2[i]; 
    			 
    			 a2[i]=a2[j];  
    			 
    			
    			 
    			 a2[j]= temp;  
    			 
    		 }
    		 
    		 
    		 
    		 }
    	 
    	
     } 
		
     for (int i=0; i<a2.length; i++) 
     
     {
    	 
    	 
    	 System.out.print(a2[i]+" ");
     }
     
     
     
     System.out.println("=========================");
     
     int b[] = {23,43,12,46, 45}; 
 	
 	int temp1 =0;
 	
 	for (int i=0; i<b.length; i++) {
			 
 		for(int j=i+1; j<b.length; j++) {
 			
 			if(b[j]<b[i]) {
 				
 				temp1 = b[i];
 				
 				b[i]=b[j];
 				
 				b[j]= temp1; 				
 				
 			}
 			
 			
 				
 				
 			}
 		}
 		
 	
 	for(int i=0; i<b.length; i++ ) {
 		
 		System.out.print(b[i]+ " ");
 		
 	}
 	
 	
 	
 	System.out.println("=============Remove Duplicates==============");
 	
 	//{10,10,20,50,60,80,60,50}
 	
 	ArrayList arr = new ArrayList();
 	
 	
 	arr.add(10);
 	arr.add(10);
 	arr.add(20);
 	arr.add(50);
 	arr.add(60);
 	arr.add(80);
 	arr.add(60);
 	arr.add(50);
 	
 	System.out.println("Before Sorting");
 	
 	System.out.println(arr);
 	
 	System.out.println(arr.size());
 	
 	
 	
 	int length =  arr.size();
 	
 	for(int i=0; i<length;i++) {
 		
 		for(int j= i+1 ; j<length; j++) {
 			
 			if(arr.get(i)==arr.get(j)) {
 				
 				arr.remove(i);
 				
 				i=0;
 				j=0;
 				
 				length= length-1;
 				
 				
 				
 			}
 			
 		}
 			
 		}

 	System.out.println("After Sorting");
 		System.out.println(arr);
 		
 		
 		
 		
 		System.out.println("========================================================");
 		
 		
 		//Create a new LinkedListlist with values and find the size() of it. 
        //Input : List = 100,200,300,400,500,600,700
 	
 		List ls = new LinkedList();
 		
 		ls.add(100);
 		ls.add(200);
 		ls.add(300);
 		
 		ls.add(400);
 		ls.add(500);
 		
 		ls.add(600);
 		
 		ls.add(700);
 		
 		
 		
 		
 				for (int i=0; i<ls.size();i++) {
 					
 					System.out.println(ls.get(i));
 					
 				}
 	
 		
 				
 				
 				System.out.println("===========================Get the first index value of 10=============================");
 		
	
 				
 				//Input:   List = 10,20,30,90
 				
 				List<Integer> fi = new ArrayList();
 				
 				fi.add(10);
 				fi.add(30);
 				fi.add(30);
 				fi.add(10);
 				fi.add(30);
 				fi.add(60);
 				fi.add(10);
 				
 				fi.add(2, 50);
 				
 				fi.set(2, 90);
 				System.out.println(fi);
 				
 				System.out.println(fi.lastIndexOf(10));
 				
 				
 				for (int i =0; i<fi.size(); i++) {
 				
 					
 					
 				if(fi.get(i)==10) {
 					
 					
 					
 					System.out.println(i);
 					 
 		             
 		               
 		               
 				
 				}
 				
 				
 					
 				}
	
 				
 				//Input : List = 10,20,30,90,10,10,40,50
 			      //        Input : List = 10,20,60,50,40,70,80,90
 				
 				List lis = new ArrayList();
 				
 				lis.add(10);
 				lis.add(20);
 				lis.add(30);
 				lis.add(90);
 				lis.add(10);
 				lis.add(40);
 				lis.add(50);
 				
 				System.out.println(lis);
 				
 				List lis2 = new ArrayList();
 				
 				lis2.add(10);
 				lis2.add(20);
 				lis2.add(60);
 				lis2.add(50);
 				lis2.add(40);
 				lis2.add(70);
 				lis2.add(80);
 				lis2.add(90);
 				
 				System.out.println(lis2);
 				
 				
 				lis2.retainAll(lis);
 				
 				System.out.println(lis2);
 				
	
	}
			
    	 
     }	


	
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
