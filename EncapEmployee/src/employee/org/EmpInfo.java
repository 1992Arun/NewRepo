package employee.org;

public class EmpInfo extends Employee {
	
	public static void main(String[] args) {
		

	
		EmpInfo e = new EmpInfo();
	
	   e.setEmployee_id(573973);
	   
	   e.setEmployee_name("Arun");
	
	   e.setEmployee_salary(348032.23f);
		
	
	   
	   EmpInfo e1 = new EmpInfo();
	   
	   
       e1.setEmployee_id(43535);
	   
	   e1.setEmployee_name("Kevin");
	
	   e1.setEmployee_salary(148032.23f);
	   
	   EmpInfo arr[]= new EmpInfo[2];
	   
	   arr[0]=e;
	   arr[1]=e1;
	   
	   for(int i =0; i<arr.length; i++)
	   {
		   
		   System.out.println("Employee IDs "+arr[i].getEmployee_id());
		   System.out.println("Employee Names "+arr[i].getEmployee_name());
		   System.out.println("Employee Salary "+arr[i].getEmployee_salary());
	   }
	   
	   
	}

}
