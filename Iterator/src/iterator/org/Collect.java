package iterator.org;

public class Collect {
	
//	public static boolean sum(int arr[], int target) {
//		
//		int left=0 ; int right=arr.length-1;
//		
//		 // int left = arr[i];  int right = arr[j];
//		  
//		  
//		  
//		  while(left<right) {
//			  
//			  int  sum = arr[left]+arr[right];
//		  
//		  if (sum==target) {
//		  
//			 return true;
//			 
//		  }else if(sum<target) {
//			  
//			  
//			  left++;
//			  
//		  }
//		  
//		  else {
//			  
//			  right--;
//			  
//		  }
//		  
//		  }
//		  
//		return false;
//	}
	
	public static void main(String[] args) {
		
	
		int arr[] = {3,4,1,5,2,56,3,2,1,9,30,40};
		
		
		int x=0;
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=i+1; j<arr.length-1;j++) {
				
				if(arr[i]>arr[j]) {
				
				x=arr[i];
				
				arr[i]= arr[j];
				
				arr[j]= x;
						
			}
			
			}
			
			
		}
		
		
		for(int k=0; k<arr.length; k++) {
			
			System.out.println(arr[k]);
			
		}
		
		
		int temp[] = new int[arr.length-1];
		
		int j=0;
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]!=arr[i+1]) {
				
				temp[j++]=arr[i];
			}
			
		}
		
		System.out.println("Uniq numbers");
		
		for(int l=0; l<j; l++) {
			
			System.out.println(temp[l]);
			
			
			
		}
		
		System.out.println("lenght of the array");
		
		System.out.println(j);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
		
//		String a = "Arun";
//		
//		char[] arr = a.toCharArray();
//		
//		int i=0; int j= arr.length-1;
//		
//		char temp = 0;
//		
//		while(i<j) {
//		
//			
//			temp = arr[i];
//			
//			arr[i]=arr[j];
//			
//			arr[j]= temp;
//			
//			i++;
//			
//			j--;
//			
//			
//			
//		
//		}
//		
//		for(int k=0; k<arr.length; k++) {
//			
//			
//			System.out.println(arr[k]);
//			
//		}
//		
//		}
				
				
		
//		
//		int a[] = {34,34,12,78,90,32,32,92,12,90};
//		
//		int len =a.length;
//		
//		
//	   int temp = 0;
//		
//		
//		
//		for(int i=0; i<len-1;i++) {
//			
//			for(int j=i+1; j<len;j++) {
//			
//				
//			 if(a[i]<a[j]) {
//				 
//				 temp= a[i];
//				 
//				 a[i]=a[j];
//				 
//				a[j]= temp;
//				 
//			 }
//				
//			}
//			
//		}
//       	
//			for(int k=0; k<len-1;k++) {
//			
//			System.out.println(a[k]);
//			
//		}
//			
//			//int b[] = new int[a.length];
//			
//			int j=0;
////			
//			int tempp[] = new int[a.length];
//			
//			for(int i=0; i<len-1;i++) {
//				
//				
//				
//					
//				 if(a[i]!=a[i+1]) {
//					 
//					 tempp[j++] = a[i];			
//					
//				}
//				
//			}
//					 
//			tempp[j++] = a[len-1];
////			
//			System.out.println("uniq elements");
//			
//			for(int k=0; k<j;k++) {
//				
//				
//				
//				System.out.println(tempp[k]);
//		
//		}
//		
//	}}
//
//
//		
////		List ls = new ArrayList();
////		
////		ls.add("Arun");
////		
////		ls.add("Rajiv");
////		
////		ls.add("Aravind");
////		
////		ls.add("gokul");
////		
////		 Iterator<String> it = ls.iterator();
////		 
////		// System.out.println(it.next());
////		 
////		 while(it.hasNext()) {
//			 
//			 System.out.println(it.next());
//		 }
//	   
//	   
//		 
//		
//		
		
		
//		Map m = new HashMap<>();
//		
//		m.put(1, "Arun");
//		
//		m.put(2, "Rajiv");
//		
//		
//		m.put(3, "Aravind");
//		
//		m.put(4, "gokul");
//		
//		Iterator a = m.
//		
	


